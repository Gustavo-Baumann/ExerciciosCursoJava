package jdbc;

public class DAOexec {

	public static void main(String[] args) {
		
		DAOteste dao = new DAOteste();		
		String sql = "INSERT INTO pessoas (nome,idade) VALUES (?,?)";
		try {
			System.out.println("ID: " + dao.incluir(sql, "Jumbileu", 17));
			System.out.println("Sucesso");
		}catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
	}

}
