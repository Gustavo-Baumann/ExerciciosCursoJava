package estruturasControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		int counter = 0;
		double entrada = 0;
		
		while(entrada !=-1) {
			System.out.println("Digite uma nota: ");
			entrada = input.nextDouble();
			if(entrada >=0 && entrada <=10) {
				total += entrada;
				counter++;
			}else if (entrada != -1) {
				System.out.println("Nota Inválida");
			}		
		}
		
		double media = total / counter;
		System.out.println("A Média da turma é: " + media);
		
		
		input.close();
		
		
	}
}
