package fundamentos;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 4.0;
		
		String passoUm = media >= 5.0 ? "em recupera��o" : "reprovado";
		String passoDois = media >= 7.0 ? "aprovado" : passoUm;
		System.out.println("Voce est� " + passoDois);
		
		double media2 = 5.0;
		boolean passou = media2 <=7.0;
		String resultado = passou ? "Aprovado" : "Reprovado";
		System.out.printf( "Voce est� %s" , resultado);
		
		
	}
}
