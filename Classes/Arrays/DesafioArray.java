package Arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas notas você quer calcular?");
		int numeroNotas = input.nextInt();
		
		double[] lista = new double[numeroNotas];
		double total = 0;
		
		for(int i = 0;  i < numeroNotas; i++) {
			System.out.println("Digite a nota nº" + (i + 1));
			lista[i] = input.nextDouble();
		}
		
		for(double mostrarNota : lista) {
			total += mostrarNota;
		}
		
		System.out.println("A Média das notas é: " + total / lista.length);
		
		input.close();
	}
}
