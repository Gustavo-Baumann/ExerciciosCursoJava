package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o nome que vc quer editar: ");
		String nomeAlvo = input.nextLine();	
		System.out.print("Digite o novo nome: ");
		String novoNome = input.nextLine();
		
		Connection conexao = geradorConexao.getConexao();
		String sql = "UPDATE pessoas SET nome = ? WHERE nome = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, novoNome);
		stmt.setString(2, nomeAlvo);
		stmt.execute();
		System.out.println("Nome alterado com sucesso");
		
		stmt.close();
		conexao.close();
		input.close(); 
	}

}
