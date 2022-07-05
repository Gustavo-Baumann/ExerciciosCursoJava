package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class criarTabelaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = geradorConexao.getConexao();
		String sql = "CREATE TABLE IF NOT EXISTS pessoas "
				+ "(codigo INT auto_increment PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL );";
		
		String sql2 = "DELETE FROM pessoas WHERE codigo = 10;";
				
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		stmt.execute(sql2);		
		System.out.println("Tabela Criada");
		conexao.close();
	}

}
