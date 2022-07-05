package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObject {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Zé", "João", "Edu");
		
		System.out.println("For Padrão");
		
		for(int i = 0 ; i < aprovados.size() ; i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nForEach");
		
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nIterator");
		
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nStream");
		
		Stream<String> rio = aprovados.stream();
		rio.forEach(System.out::println);
		
		System.out.println("\nOutra forma simples");
		
		aprovados.forEach(System.out::println);
	}

}
