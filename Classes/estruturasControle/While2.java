package estruturasControle;

import java.util.Scanner;

public class While2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String texto = "";
		
		while(!texto.equalsIgnoreCase("sair")) {
			System.out.println("Digite alguma coisa");
			texto = input.nextLine();
		}
		
		input.close();
		
	}

}
