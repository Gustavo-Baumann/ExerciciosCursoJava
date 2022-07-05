package fundamentos;

public class DesafioOpRelacionais {

	public static void main(String[] args) {
		
		boolean trabalho01 = false;
		boolean trabalho02 = false;
		
		boolean televisao50 = trabalho01 && trabalho02;
		boolean televisao32 = trabalho01 ^ trabalho02;
		boolean sorvete = trabalho01 || trabalho02;
		boolean rip = !trabalho01 && !trabalho02;
		
		System.out.println("Comprou TV 50' ? ");
		System.out.println(televisao50);
		System.out.println("\nComprou TV 32' ? ");
		System.out.println(televisao32);
		System.out.println("\nTomou Sorvete ? ");
		System.out.println(sorvete);
		System.out.println("\nRipou F Total ? ");
		System.out.println(rip);
		
		
	
			
	
	
	}
}
