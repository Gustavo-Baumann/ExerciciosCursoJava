package fundamentos;

import java.util.Scanner;

public class independent {

	public static void main(String[] args) {
		
		int valor01 = 45;
		int valor02 = 67;
		int resultado = valor01 * valor02;
		System.out.println("O Resultado �: " + resultado);
		
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
		
		System.out.printf("Eu tinha %d bananas e jo�o \nme deu %d ma��s, ent�o eu \nfiquei com %d jacas no palito", valor01, valor02, resultado);
		
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
		System.out.printf("Parece que %s gosta de \n%s, al�m de ter um time \nchamado %s e no momente est� em \nposse de %d jacas no palito", nome, jogoFavorito, time, jacaNoPalito);
		input.close();
		
		System.out.println("\n-----------");
		
		int quantia01 = 35;
		
		double quantia1 = (double) quantia01;
		System.out.println(quantia1);
		
		System.out.println("-----------");
		
		boolean calor = false; 
		boolean cs = true;
		
		boolean jogarMal = calor && cs;
		String jogarMalx = jogarMal ? "Est� jogando mal" : "N�o est� jogando mal";
		System.out.println(jogarMalx);
		boolean incomoda��o = calor || cs;
		String incomoda��ox = incomoda��o ? "Est� se incomodando" : "N�o est� se incomodando";
		System.out.println(incomoda��ox);
		boolean pa = calor ^ cs;
		String pax = pa ? "Est� pa" : "N�o est� pa";
		System.out.println(pax);
		boolean safe = !calor && !cs;
		String safex = safe ? "Est� safe" : "N�o est� safe";
		System.out.println(safex);
		
		
		
		
		
		
		
		
	}
}
