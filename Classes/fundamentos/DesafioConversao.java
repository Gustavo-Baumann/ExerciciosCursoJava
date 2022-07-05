package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Salário mês 1: ");
		String salario1 = input.nextLine();
		System.out.println("Salário mês 2: ");
		String salario2 = input.nextLine();
		System.out.println("Sálario mês 3: ");
		String salario3 = input.nextLine();
		input.close();
		
		salario1 = salario1.replace(",", ".");
		salario2 = salario2.replace(",", ".");
		salario3 = salario3.replace(",", ".");
		
		Double valor01 = Double.parseDouble(salario1);
		Double valor02 = Double.parseDouble(salario2);
		Double valor03 = Double.parseDouble(salario3);
	
		
		double media = (valor01 + valor02 + valor03) / 3;
		System.out.println("Média: " + media);
	}
	
}
