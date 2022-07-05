package fundamentos;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = entrada.nextLine();
		System.out.println("Qual seu sobrenome?");
		String sobrenome = entrada.nextLine();
		System.out.println("Seu nome é: " + nome + " " + sobrenome);
		System.out.println("Qual sua idade?");
		int idade = entrada.nextInt();
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		entrada.close();
	}
}
