package fundamentos;

import java.util.Scanner;

public class DesafioConversao2 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Digite salário 1: ");
			String salario1 = input.nextLine();
			System.out.println("Digite salário 2: ");
			String salario2 = input.nextLine();
			System.out.println("Digite salário 3: ");
			String salario3 = input.nextLine();
			input.close();
			
			salario1 = salario1.replace(",", ".");
			salario2 = salario2.replace(",", ".");
			salario3 = salario3.replace(",", ".");
			
			double valor1 = Double.parseDouble(salario1);
			double valor2 = Double.parseDouble(salario2);
			double valor3 = Double.parseDouble(salario3);
			
			double media = (valor1 + valor2 + valor3) / 3;
			System.out.println("A média do salário é: " + media);
			
		}
}
