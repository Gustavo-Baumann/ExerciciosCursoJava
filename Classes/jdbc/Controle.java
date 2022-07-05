package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controle {

	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		String continuar = "sim";
		Connection conexao = geradorConexao.getConexao();
		
		while(continuar.equalsIgnoreCase("SIM")) {
			System.out.print("Digite seu comando: ");
			String sql = input.nextLine();
			Statement stmt = conexao.createStatement();
			
			try {
				stmt.execute(sql);
				System.out.println("Comando executado");
			}catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			}finally {
				stmt.close();
			}
			System.out.print("Continuar? "); 
			continuar = input.nextLine();
		}
		
		
		conexao.close();
		input.close();
		
	}

}
