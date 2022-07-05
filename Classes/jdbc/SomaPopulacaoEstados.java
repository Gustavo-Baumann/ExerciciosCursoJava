package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SomaPopulacaoEstados {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = geradorConexao.getConexao();
		String sql = "SELECT SUM(populacao) FROM estados";
		Statement stmt = conexao.createStatement();
		ResultSet result = stmt.executeQuery(sql);
		
		while(result.next()) {
			double populacao = result.getDouble(1);
			System.out.println("A soma da população de todos estados é: " + populacao + " Milhões");
		}
		
		sql = "SELECT AVG(populacao) FROM estados";
		result = stmt.executeQuery(sql);
		
		while(result.next()) {
			double populacao = result.getDouble(1);
			System.out.println("A média da população de todos estados é: " + populacao + " Milhões");
		}
		
		stmt.close();
		conexao.close();
		
	}

}
