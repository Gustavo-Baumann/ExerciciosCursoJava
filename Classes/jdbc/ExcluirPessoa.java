package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite o código da pessoa à ser excluída: ");
		int codigo = ent.nextInt();
		
		Connection conexao = geradorConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluída com sucesso");
		}else {
			System.out.println("Pessoa não encontrada");
		}
		
		stmt.close();
		conexao.close();
		ent.close();
	}
}
