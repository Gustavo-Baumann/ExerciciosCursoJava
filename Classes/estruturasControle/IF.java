package estruturasControle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner input  =  new Scanner(System.in);
		
		System.out.println("Digite sua nota");
		double nota = input.nextDouble();
		
		input.close();
		
		if(nota >= 7 && nota <= 10) { 
			System.out.println("Parabéns você foi aprovado");	
		}
		
		if(nota >= 4 && nota < 7) {
			System.out.println("Você está de recuperação");
		}
		
		if(nota < 4) {
			System.out.println("Você está reprovado");
		}
	}
}
