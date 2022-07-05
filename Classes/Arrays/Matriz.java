package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número de alunos: ");
		int numeroAlunos = input.nextInt();
		
		System.out.println("Digite o número de notas: ");
		int numeroNotas = input.nextInt();
		
		double [] [] todasNotas = new double [numeroAlunos] [numeroNotas];
		double notaTotal = 0;
		
		for(int a = 0 ; a < todasNotas.length ; a++) {
			for(int n = 0 ; n < todasNotas[a].length ; n++ ) {
				System.out.printf("Digite a nota %d do aluno %d\n" , n+1, a+1);
				todasNotas[a][n] = input.nextDouble();
				notaTotal += todasNotas[a][n];
			}
		}
		
		double mediaTotal = notaTotal / (numeroAlunos * numeroNotas);
		System.out.println("A Média da turma é:" + mediaTotal );
		
		for(double[] notasTurma : todasNotas) {
			System.out.println(Arrays.toString(notasTurma));
		}
		input.close();
	}
}
