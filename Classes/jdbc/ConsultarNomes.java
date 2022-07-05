package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarNomes {

	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite sua busca:");
		String busca = input.next();
		int numeroDeResultados = 0;
		
		Connection conexão = geradorConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ? ;";
		PreparedStatement stmt = conexão.prepareStatement(sql);
		stmt.setString(1, "%" + busca + "%");
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
			int codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			int idade = result.getInt("idade");
			System.out.println("Código: " + codigo);
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade + "\n");
			numeroDeResultados ++;
		}
		
		System.out.println("Número de Resultados: " + numeroDeResultados);
		stmt.close();
		conexão.close();
		input.close();
	}

}
