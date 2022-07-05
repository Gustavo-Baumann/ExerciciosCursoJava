package Arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas notas voc� quer calcular?");
		int numeroNotas = input.nextInt();
		
		double[] lista = new double[numeroNotas];
		double total = 0;
		
		for(int i = 0;  i < numeroNotas; i++) {
			System.out.println("Digite a nota n�" + (i + 1));
			lista[i] = input.nextDouble();
		}
		
		for(double mostrarNota : lista) {
			total += mostrarNota;
		}
		
		System.out.println("A M�dia das notas �: " + total / lista.length);
		
		input.close();
	}
}
