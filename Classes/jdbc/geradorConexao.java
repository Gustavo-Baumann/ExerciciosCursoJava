package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class geradorConexao {

	public static Connection getConexao() {
		try {
			String url = "jdbc:mysql://localhost/cursojava?verifyServerCertificate=false&useSSL=true"; 
			String usuario = "root";  
			String senha = "fon";
			
			return DriverManager.getConnection(url, usuario, senha);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	@SuppressWarnings("unused") // deu algum b.o sinistro 
	private static Properties getProperties() throws IOException{
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(geradorConexao.class.getResourceAsStream(caminho));
		return prop;
		
	}

}
