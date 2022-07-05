package estruturasControle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = input.nextDouble();
		
		input.close();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Inválida");
		}else  if(nota >= 8) {
			System.out.println("Nota A");	
		}else if(nota >= 6) {
			System.out.println("Nota B");
		}else if(nota >= 4) {
			System.out.println("Nota C");
		}else if(nota >= 2) {
			System.out.println("Nota D");
		}else {
			System.out.println("Nota F");
		}
		
		System.out.println("Até Mais");
		
	}
}
