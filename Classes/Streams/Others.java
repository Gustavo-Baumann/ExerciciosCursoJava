package Streams;

import java.util.Arrays;
import java.util.List;

public class Others {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alice", 8.6);
		Aluno a2 = new Aluno("Bruno", 9.3);
		Aluno a3 = new Aluno("Carla", 6.4);
		Aluno a4 = new Aluno("Dante", 7.4);
		Aluno a5 = new Aluno("Elias", 9.2);
		Aluno a6 = new Aluno("Fábio", 6.8);
		Aluno a7 = new Aluno("Guben", 8.8);
		Aluno a8 = new Aluno("Hélio", 6.5);
		Aluno a9 = new Aluno("Ilene", 9.6);
		Aluno a10 = new Aluno("Ilene", 9.6);
		
		List<Aluno> classe = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
		
		System.out.println("Distinct");	         // descarta objetos duplicados
		classe.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip");            // pula 'x' itens da lista antes de executar 
		classe.stream().distinct().skip(4).forEach(System.out::println);
		
		System.out.println("\nLimit");           // apenas os 'x' primeiros itens executam
		classe.stream().limit(4).forEach(System.out::println);
		
		System.out.println("\nSkip & Limit");    // o skip come os itens que o limit ia executar
		classe.stream().limit(4).skip(2).forEach(System.out::println);
		
		System.out.println("\nTakeWhile");       // enquanto o predicate for true ele executa
		classe.stream().takeWhile(Misc.aprovado).forEach(System.out::println);
		
	}

}
