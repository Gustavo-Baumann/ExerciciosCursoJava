package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Mapa {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> marcas = Arrays.asList("Nissan", "Tesla" , "Ford", "Porsche");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> upCase = n -> n.toUpperCase();
		//UnaryOperator<String> inicial = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + " lasquera!!";
		
		System.out.println("\nUsando composição de lambdas");
		marcas.stream()
		.map(Misc.upCase)
		.forEach(print);
		
		System.out.println("\nUsando as 3 lambdas");
		marcas.stream()
		.map(Misc.upCase)   // usando uma lambda static de outra classe
		.map(Misc.inicial)
		.map(Misc::grito)   // referenciando um metodo static de outra classe
		.forEach(print);
	}

}
