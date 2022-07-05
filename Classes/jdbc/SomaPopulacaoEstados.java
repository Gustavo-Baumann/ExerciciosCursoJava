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
			System.out.println("A soma da popula��o de todos estados �: " + populacao + " Milh�es");
		}
		
		sql = "SELECT AVG(populacao) FROM estados";
		result = stmt.executeQuery(sql);
		
		while(result.next()) {
			double populacao = result.getDouble(1);
			System.out.println("A m�dia da popula��o de todos estados �: " + populacao + " Milh�es");
		}
		
		stmt.close();
		conexao.close();
		
	}

}
