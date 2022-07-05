package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		//predicate retorns boolean e usa .test
		Predicate<Produto> isExpensive = produto -> (produto.getPreco() * (1 - produto.desconto)) >= 10;
		
		Produto caixa = new Produto("Bola", 11.2, 0.1);
		System.out.println(isExpensive.test(caixa));
	}

}
