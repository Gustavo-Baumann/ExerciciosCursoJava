package estruturasControle;

public class Switch {

	public static void main(String[] args) {
		
		String faixa = "vermelha";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("voc� � top");
		case "marrom":
			System.out.println("voc� � topzinho");
		case "roxa":
			System.out.println("voc� � legal");
		case "verde":
			System.out.println("voc� � legalzinho");
		case "laranja":
			System.out.println("voc� � um brother");
		case "vermelha":
			System.out.println("voc� � um par�a");
		case "amarela":
			System.out.println("voc� � um amigo");
			break;
		default:
			System.out.println("voc� � s� voc� mesmo");
			
			//sem break ele passa por todos os cases 
			
		}
		
		int idade = 5;
		switch(idade) {
		case 6:
			System.out.println("sabe escrever");
		case 5:
			System.out.println("sabe ler");
		case 4:
			System.out.println("sabe conversar");
		case 3:
			System.out.println("sabe falar");
		case 2:
			System.out.println("sabe andar");
		case 1:
			System.out.println("sabe chorar");	
		}
		
		
		
	}
}
