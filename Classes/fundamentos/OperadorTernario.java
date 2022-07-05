package fundamentos;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 4.0;
		
		String passoUm = media >= 5.0 ? "em recuperação" : "reprovado";
		String passoDois = media >= 7.0 ? "aprovado" : passoUm;
		System.out.println("Voce está " + passoDois);
		
		double media2 = 5.0;
		boolean passou = media2 <=7.0;
		String resultado = passou ? "Aprovado" : "Reprovado";
		System.out.printf( "Voce está %s" , resultado);
		
		
	}
}
