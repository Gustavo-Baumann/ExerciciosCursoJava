package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarEstados {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = geradorConexao.getConexao();
		String sql = "SELECT * FROM estados";
		Statement stmt = conexao.createStatement();
		ResultSet result = stmt.executeQuery(sql);
		
		while(result.next()) {
			int id = result.getInt("id");
			String nome = result.getString("nome");
			String sigla = result.getString("sigla");
			String regiao = result.getString("regiao");
			double populacao = result.getDouble("populacao");
			System.out.println("ID: " + id);
			System.out.println("Nome: " + nome);
			System.out.println("Sigla: " + sigla);
			System.out.println("Região: " + regiao);
			System.out.println("População: " + populacao + " Milhões\n");
		}
		
		stmt.close();
		conexao.close();
		
	}

}
