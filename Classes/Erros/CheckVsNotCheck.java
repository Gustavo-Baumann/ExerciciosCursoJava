package Erros;

public class CheckVsNotCheck {

	public static void main(String[] args) {
		
		try {
			erro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			erro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim");
	}
	
	//não checada / não verificada
	public static void erro1() {
		throw new RuntimeException("Erro legauu");
	}
	
	//checada / verificada ; precisa de throws exception
	public static void erro2() throws Exception {
		throw new Exception("Erro mais legauu");	
	}

}
