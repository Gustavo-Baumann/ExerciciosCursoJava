package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {

	public static void main(String[] args) throws SQLException {
		Connection conexao = geradorConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		Statement stmt = conexao.createStatement();
		ResultSet result = stmt.executeQuery(sql);	
		List<Pessoa> pessoas = new ArrayList<>();
		while(result.next()) {
			int codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			int idade = result.getInt("idade");
			pessoas.add(new Pessoa(codigo, nome, idade));
		}
		for(Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " -> " + p.getNome() + " tem " + p.getIdade() + " anos");
		}
		stmt.close();
		conexao.close();
	}

}
