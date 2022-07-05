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
		
		Connection conex�o = geradorConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ? ;";
		PreparedStatement stmt = conex�o.prepareStatement(sql);
		stmt.setString(1, "%" + busca + "%");
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
			int codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			int idade = result.getInt("idade");
			System.out.println("C�digo: " + codigo);
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade + "\n");
			numeroDeResultados ++;
		}
		
		System.out.println("N�mero de Resultados: " + numeroDeResultados);
		stmt.close();
		conex�o.close();
		input.close();
	}

}
