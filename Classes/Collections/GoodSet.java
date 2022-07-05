package Collections;

import java.util.HashSet;

import java.util.Set;

import java.util.TreeSet; 

public class GoodSet {

	public static void main(String[] args) {
		
		Set<String> lista = new TreeSet<String>();  // treeset da ordem aos itens
		lista.add("salve");
		lista.add("eae");
		lista.add("bao");
		lista.add("sim");
		lista.add("etu");
		lista.add("baotb");	
		
		for(String fala : lista) {
			System.out.println(fala);
		}
		
		System.out.println();
		
		Set<Integer> livro = new HashSet<>();
		livro.add(1);
		livro.add(5);
		livro.add(10);
		livro.add(33);
		
		for(int n : livro) {
			System.out.println(n);
		}
	}
}
