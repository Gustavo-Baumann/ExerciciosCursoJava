package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		//Suppliers n tem input e retornam um tipo escolhido ; usam .get
		Supplier<List<String>> lista = () -> Arrays.asList("Zé", "Jão");
		System.out.println(lista.get()); 
		
		Supplier<Integer> calendario = () -> 1 ;
		System.out.println(calendario.get());
	}

}
