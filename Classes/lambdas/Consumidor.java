package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		//consumer returns void e usa .accept
		Consumer<Produto> output = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Balao", 5.22, 0);
		Produto p2 = new Produto("Chapeu", 14.75, 0.1);
		Produto p3 = new Produto("Caneta", 2.27, 0);
		Produto p4 = new Produto("Regua", 8.63, 0.1);
		output.accept(p4);   
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

		produtos.forEach(output);
		produtos.forEach(produto -> System.out.println(produto.getPreco()));
		produtos.forEach(System.out::println);
		
	}

}
