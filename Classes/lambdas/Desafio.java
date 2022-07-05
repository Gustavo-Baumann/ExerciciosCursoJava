package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto x = new Produto("PC", 3333.99, 0.13);
		
		BinaryOperator<Double> desconto = (preco, descont) -> preco * (1 - descont);
		UnaryOperator<Double> imposto = impost -> impost >= 2500 ? impost * 1.085 : impost;
		UnaryOperator<Double> frete = fret -> fret >= 3000 ? fret + 100 : fret + 50;
		Function<Double, String> arredondar = result -> {
			DecimalFormat y = new DecimalFormat("0.00");
			return y.format(result);
		};
		System.out.println("O preço é: R$ " + desconto.andThen(imposto).andThen(frete)
				.andThen(arredondar).apply(x.preco, x.desconto));
	}

}
