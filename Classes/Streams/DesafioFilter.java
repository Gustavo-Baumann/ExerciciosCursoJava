package Streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Carros c1 = new Carros("Nissan", 212, false);
		Carros c2 = new Carros("Ferrari", 242, false);
		Carros c3 = new Carros("Tesla", 176, true);
		Carros c4 = new Carros("Volvo", 122, false);
		Carros c5 = new Carros("Toyota", 236, true);
		Carros c6 = new Carros("BMW", 224, false);
		
		List<Carros> loja = Arrays.asList(c1,c2,c3,c4,c5,c6);
		
		//linhas abaixo movidas para a classe static Misc
		//Predicate<Carros> rapido = c -> c.velocidadeMaxima >= 200; 
		//Predicate<Carros> green = c -> c.eletrico == true;
		//Function<Carros,String> daora = c -> "O Carro da " + c.nome + " é daora";
		
		loja.stream()
		.filter(Misc.rapido)
		.filter(Misc.green)
		.map(Misc.daora)
		.forEach(System.out::println);
		
	}

}
