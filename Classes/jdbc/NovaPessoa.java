package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Informe o nome: ");
			String nome = input.nextLine();
			System.out.print("Informe sua idade :");
			int idade = input.nextInt();
			if(idade > 120 || idade < 0) {
				System.out.println("Idade informada inválida");
				return;
			}
			String sql = "INSERT INTO pessoas (nome,idade) VALUES (?, ?)";
			Connection conexao = geradorConexao.getConexao();
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, nome);
			pstmt.setInt(2, idade);
			pstmt.execute();
			System.out.println("Pessoa adicionada com sucesso");
			pstmt.close();
			conexao.close();
		}catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		input.close();
	}

}
