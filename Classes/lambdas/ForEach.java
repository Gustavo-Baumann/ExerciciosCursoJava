package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> app = Arrays.asList("Jao", "Ze", "Cleitinho");
		
		System.out.println("forma padrão");
		for(String nome : app) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda 01");
		app.forEach((nome) -> { System.out.println(nome);});
		app.forEach(nome -> System.out.println(nome));        // solto caso nome seja o unico parametro
		
		System.out.println("\nMethod Reference 01");
		app.forEach(System.out::println);     // 2x dois pontos para referenciar e exibir os valores
		
		System.out.println("\nLambda 02");
		app.forEach(nome -> imprimir(nome));
		
		System.out.println("\nMethod Reference 02");
		app.forEach(ForEach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("Meu nome é " + nome);
	}

}
