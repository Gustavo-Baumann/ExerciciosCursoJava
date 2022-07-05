package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OpBinario {

	public static void main(String[] args) {
		
		//BinaryOperator tem 2 entradas e 1 retorno do mesmo tipo ; usa .apply
		BinaryOperator<Double> media = (valor1, valor2) -> (valor1 + valor2) / 2;
		System.out.println(media.apply(2.8, 9.7));		
		
		//BiFunction recebe 2 entradas e tem 1 retorno do tipo escolhido ; .apply tbm
		BiFunction<Double,Double,String> media2 = (num1, num2) -> ((num1 + num2) / 2) >= 7.0
				? "Aprovado" : "Reprovado";
		System.out.println(media2.apply(6.7, 7.5));
		
		BiFunction<Double, Double, String> media3 = (n1,  n2) -> {   // mesma coisa só que com corpo 
			return  ((n1 + n2) /2) >= 7 ? "Aprovado" : "Reprovado";  // necessario return
		};
		System.out.println(media3.apply(5.7, 7.3));
		
		Function<Double, String> passou = media1 -> media1 >=7 ? "Aprovado" : "Reprovado" ;
		
		UnaryOperator<String> reacao = resultado -> resultado + " Meu Deus";
		
		System.out.println(media.andThen(passou).andThen(reacao).apply(5.7, 8.9));  
		// ByOp ,Function e UnOp juntos 
	}

}
