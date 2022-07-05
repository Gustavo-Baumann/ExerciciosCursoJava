package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOteste {

	public int incluir(String sql, Object... argmts) {
		try {
			PreparedStatement stmt = getConnection()
			.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			addAtributos(stmt,argmts);
			if(stmt.executeUpdate() > 0) {
				ResultSet result = stmt.getGeneratedKeys();	
				if(result.next()) {
					return result.getInt(1);
				}
			}
			return -1;	
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	private void addAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
		int indice = 1;
		for(Object atributo : atributos) {
			if(atributo instanceof String) {
				stmt.setString(indice, (String)atributo);
			}else if(atributo instanceof Integer) {
				stmt.setInt(indice, (Integer)atributo);
			}
			indice++;
		}
	}
	
	
	public void close() {
		try {
			getConnection().close();
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			conexao = null;
		}
	}
	
	
	
	private Connection conexao;
	private Connection getConnection() {
		try {
			if(conexao != null && !conexao.isClosed() ) {
				return conexao;
			}
		} catch (SQLException e) { 
			System.out.println("Erro: " + e.getMessage());
		}
		
		conexao = geradorConexao.getConexao();
		return conexao;
		
	}

}
