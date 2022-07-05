package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class criarBanco {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; 
		String usuario = "root";  
		String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão Criada");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS cursoJava");
		stmt.execute("CREATE DATABASE IF NOT EXISTS cursoJava2");
		stmt.execute("DROP DATABASE IF EXISTS cursoJava2");
		
		System.out.println("Banco Criado");
		
		conexao.close();
	}

}
