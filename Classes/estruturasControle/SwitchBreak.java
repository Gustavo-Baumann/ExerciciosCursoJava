package estruturasControle;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		int nota = input.nextInt();
		
		String conceito = "";
		
		switch(nota) {
		case 10: case 9: case 8: case 7:
			conceito = "CSA";
			System.out.println(conceito);
			break;
		
		case 6: case 5: case 4:
			conceito = "CPA";
			System.out.println(conceito);
			break;

		case 3: case 2: case 1: case 0:
			conceito = "CRA";
			System.out.println(conceito);
			break;
		
		default:
			System.out.println("Conceito indisponível");
		
		}
		
		input.close();
	}
}
