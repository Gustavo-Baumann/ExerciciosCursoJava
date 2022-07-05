package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("digite um valor: ");
		double valor1 = input.nextDouble();
		System.out.println("digite outro valor: ");
		double valor2 = input.nextDouble();
		System.out.println("digite uma operacao: ");
		var operacao = input.next();
		input.close();
		
		double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
		resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1, operacao, valor2, resultado);
		
		
		
        
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
