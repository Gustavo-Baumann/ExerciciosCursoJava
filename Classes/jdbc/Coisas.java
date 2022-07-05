package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Coisas {

	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		Connection conexao = geradorConexao.getConexao();
		String sqlstart = "CREATE TABLE IF NOT EXISTS coisas (id INT unsigned NOT NULL auto_increment PRIMARY KEY, nome VARCHAR(50) NOT NULL UNIQUE KEY, caracteristica VARCHAR(50) NOT NULL);";
		Statement stmtstart = conexao.createStatement();
		stmtstart.execute(sqlstart);
		stmtstart.close();
		String continuar = "sim";
		
		while(continuar.equalsIgnoreCase("sim")) {
			System.out.println("\n[1] Adicionar um item ");
			System.out.println("[2] Deletar um item ");
			System.out.println("[3] Busca de itens  ");
			System.out.println("[4] Lista completa de itens");
			System.out.println("[5] Editar um item ");
			System.out.println("[6] Limpar lista ");
			System.out.println("[7] Modo editor\n");
		
			System.out.print("Informe a ação desejada: ");
			String comando = input.nextLine();
			
			switch(comando){
			case "1" :
				
				System.out.print("Digite o nome do item ");
				String nome1 = input.nextLine();
				System.out.print("Digite a característica do item ");
				String caracteristica = input.nextLine();
				String sql1 = "INSERT INTO coisas(nome, caracteristica) VALUES (?,?)";
				PreparedStatement stmt1 = conexao.prepareStatement(sql1);
				
				try {
					stmt1.setString(1, nome1);
					stmt1.setString(2, caracteristica);
					stmt1.execute();
					System.out.println("Item adicionado com sucesso");
				}catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}finally {
					stmt1.close();
				}
				break;
				
			case "2":
				
				System.out.print("Digite o nome do item que você deseja deletar ");
				String nome2 = input.nextLine();
				String sql2 = "DELETE FROM coisas WHERE nome = ?";
				PreparedStatement stmt2 = conexao.prepareStatement(sql2);
				stmt2.setString(1, nome2);
				
				if(stmt2.executeUpdate() > 0) {
					System.out.println("Item deletado com sucesso");
				}else {
					System.out.println("Item não encontrado");
				}
				
				stmt2.close();
				break;
				
			case "3" :
				
				System.out.print("Deseja procurar por Nome [n] ou Característica [c] ? ");
				String alvo = input.nextLine();
				int numeroDeResultados = 0;
				
				if(alvo.equalsIgnoreCase("n")) {
					String sql3a = "SELECT * FROM coisas WHERE nome = ?";
					PreparedStatement stmt3a = conexao.prepareStatement(sql3a);
					System.out.print("Digite o nome: ");
					String nome3 = input.nextLine();
					stmt3a.setString(1, nome3);
					ResultSet result1 = stmt3a.executeQuery();
					
					while(result1.next()) {
						int id = result1.getInt("id");
						String nomeX = result1.getString("nome");
						String caracteristicaX = result1.getString("caracteristica");
						System.out.println("\nID: " + id);
						System.out.println("Nome: " + nomeX);
						System.out.println("Característica : " + caracteristicaX);
						numeroDeResultados++;
					}
					
					System.out.println("\nNúmero de Resultados: " + numeroDeResultados);
					stmt3a.close();	
				}else if(alvo.equalsIgnoreCase("c")) {
					String sql3b = "SELECT * FROM coisas WHERE caracteristica = ?";
					PreparedStatement stmt3b = conexao.prepareStatement(sql3b);
					System.out.print("Digite a característica: ");
					String caracteristicaZ = input.nextLine();
					stmt3b.setString(1, caracteristicaZ);
					ResultSet result1 = stmt3b.executeQuery();
					
					while(result1.next()) {
						int id = result1.getInt("id");
						String nomeX = result1.getString("nome");
						String caracteristicaX = result1.getString("caracteristica");
						System.out.println("\nID: " + id);
						System.out.println("Nome: " + nomeX);
						System.out.println("Característica : " + caracteristicaX);
						numeroDeResultados++;
					}
					
					System.out.println("\nNúmero de Resultados: " + numeroDeResultados);
					stmt3b.close();	
				}else {
					System.out.println("\nComando Inválido");
				}
				break;
				
			case "4" :
				
				String sql4 = "SELECT * FROM coisas";
				Statement stmt4 = conexao.createStatement();
				ResultSet result2 = stmt4.executeQuery(sql4);
				int numeroDeResultados2 = 0;
				
				while(result2.next()) {
					int id = result2.getInt("id");
					String nomeX = result2.getString("nome");
					String caracteristicaX = result2.getString("caracteristica");
					System.out.println("\nID: " + id);
					System.out.println("Nome: " + nomeX);
					System.out.println("Característica : " + caracteristicaX);
					numeroDeResultados2++;
				}
				
				System.out.println("\nNúmero de resultados: " + numeroDeResultados2);
				stmt4.close();
				break;
				
			case "5" :
				
				System.out.print("\nDigite o nome do item que você deseja editar: ");
				String nome5 = input.nextLine();
				System.out.print("Deseja editar o nome [n] ou a característica [c] ");
				String alvo2 = input.nextLine();
				
				if(alvo2.equalsIgnoreCase("n")) {
					System.out.print("Digite o novo nome: ");
					String novoNome = input.nextLine();
					String sql5a = "UPDATE coisas SET nome = ? WHERE nome = ? ";
					PreparedStatement stmt5a = conexao.prepareStatement(sql5a);
					stmt5a.setString(1, novoNome);
					stmt5a.setString(2, nome5);
					if(stmt5a.executeUpdate() > 0) {
						System.out.println("\nNome alterado com sucesso");
					}else {
						System.out.println("\n" + nome5 + " não existe na lista");
					}
					stmt5a.close();
				}else if(alvo2.equalsIgnoreCase("c")) {
					System.out.print("Digite a nova característica: ");
					String novaCaracteristica = input.nextLine();
					String sql5b = "UPDATE coisas SET caracteristica = ? WHERE nome = ? ";
					PreparedStatement stmt5b = conexao.prepareStatement(sql5b);
					stmt5b.setString(1, novaCaracteristica);
					stmt5b.setString(2, nome5);
					if(stmt5b.executeUpdate() > 0) {
						System.out.println("\nCaracterística alterada com sucesso");
					}else {
						System.out.println("\n" + nome5 + " não existe na lista");
					}
					stmt5b.close();
				}else {
					System.out.println("\nComando Inválido");
				}
				break;
				
			case "6" :
				
				System.out.println("\nDeseja realmente limpar todos registros? [sim]");
				String confirmarExclusao = input.nextLine();
				
				if(confirmarExclusao.equalsIgnoreCase("sim")) {
					String sql6 = "DELETE FROM coisas" ;
					Statement stmt6 = conexao.createStatement();
					stmt6.execute(sql6);
					System.out.println("\nTabela Limpa com sucesso");
					stmt6.close();
				}else {
					System.out.println("\nLimpeza cancelada");
				}	
				break;
				
			case "7" :
				
				System.err.println("\nCuidado! Alterações à tabela podem requerir mudanças no código ");
				System.err.println("Comandos que geram Result Set não são suportados");
				System.out.print("Digite seu Comando SQL: ");
				String sql7 = input.nextLine();
				Statement stmt7 = conexao.createStatement();
				try {
					stmt7.execute(sql7);
					System.out.println("Comando executado com sucesso");
				}catch(Exception e){
					System.out.println("Erro: " + e.getMessage());
				}finally {
					stmt7.close();
				}
				break;
				
			default :
				System.out.println("\nComando Inválido");
			}
			
			System.out.print("Deseja continuar? [sim] ");
			continuar = input.nextLine();
		}

		System.out.println("Programa Encerrado ");
		conexao.close();
		input.close();
	}

}
