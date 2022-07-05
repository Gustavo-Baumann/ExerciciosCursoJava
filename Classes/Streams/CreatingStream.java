package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStream {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> printn = System.out::println;
		
		Stream<String> comida = Stream.of("Pão ", "Café ", "Bolacha\n");
		comida.forEach(print);
		String[] maisComida = {"Pizza ", "Lasanha ", "Sorvete\n"};
		Stream.of(maisComida).forEach(print);
		String[] outraComida = {"Carne ", "Arroz ", "Milho\n"};
		Arrays.stream(outraComida).forEach(print);
		// Arrays.stream(outraComida, 1,2).forEach(print);  Index 1 da lista é incluido, e o 2 fecha
		List<String> comidaLegal = Arrays.asList("Chocolate ", "Queijo ", "Coxinha\n");
		comidaLegal.stream().forEach(print);
		comidaLegal.parallelStream().forEach(print);
		Stream.generate(() -> "E").forEach(print);   //.generate usa um suplier como parametro
		Stream.iterate(0, n -> n+1).forEach(printn);  //  .iterate usa uma seed e itera sobre ela
		
	}

}
