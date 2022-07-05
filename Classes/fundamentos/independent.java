package fundamentos;

import java.util.Scanner;

public class independent {

	public static void main(String[] args) {
		
		int valor01 = 45;
		int valor02 = 67;
		int resultado = valor01 * valor02;
		System.out.println("O Resultado é: " + resultado);
		
		System.out.println("----------");
		
		String nome = "Nay";
		String jogoFavorito = "Counter-Strike";
		String time = "eFonX";
		System.out.println(String.format("O ser humano %s gosta de \njogar %s e tem \num time chamado %s", nome, jogoFavorito, time));
		
		System.out.println("----------");
		
		nome = nome.replace("a", "e");
		nome = nome.toUpperCase();
		System.out.println(nome);
		
		System.out.println("----------");
		
		System.out.printf("Eu tinha %d bananas e joão \nme deu %d maçãs, então eu \nfiquei com %d jacas no palito", valor01, valor02, resultado);
		
		System.out.println("\n----------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		nome = input.nextLine();
		System.out.println("Qual seu jogo favorito?");
		jogoFavorito = input.nextLine();
		System.out.println("Qual seu time?");
		time = input.nextLine();
		System.out.println("Quantas jacas no palito mesmo?");
		int jacaNoPalito = input.nextInt();
		System.out.printf("Parece que %s gosta de \n%s, além de ter um time \nchamado %s e no momente está em \nposse de %d jacas no palito", nome, jogoFavorito, time, jacaNoPalito);
		input.close();
		
		System.out.println("\n-----------");
		
		int quantia01 = 35;
		
		double quantia1 = (double) quantia01;
		System.out.println(quantia1);
		
		System.out.println("-----------");
		
		boolean calor = false; 
		boolean cs = true;
		
		boolean jogarMal = calor && cs;
		String jogarMalx = jogarMal ? "Está jogando mal" : "Não está jogando mal";
		System.out.println(jogarMalx);
		boolean incomodação = calor || cs;
		String incomodaçãox = incomodação ? "Está se incomodando" : "Não está se incomodando";
		System.out.println(incomodaçãox);
		boolean pa = calor ^ cs;
		String pax = pa ? "Está pa" : "Não está pa";
		System.out.println(pax);
		boolean safe = !calor && !cs;
		String safex = safe ? "Está safe" : "Não está safe";
		System.out.println(safex);
		
		
		
		
		
		
		
		
	}
}
