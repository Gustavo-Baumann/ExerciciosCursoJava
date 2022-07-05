package lambdas;

import java.util.function.UnaryOperator;

public class OpUnario {

	public static void main(String[] args) {
		
		//unaryoperator retorna o mesmo tipo do input ; usa .apply
		UnaryOperator<Integer> plus2 = num -> num + 2;
		System.out.println(plus2.apply(5));
		UnaryOperator<Integer> times2 = num -> num * 2;
		System.out.println(times2.apply(5));
		UnaryOperator<Integer> square = num -> num * num;
		System.out.println(square.apply(5));
		
		int result = plus2.andThen(times2).andThen(square).apply(3);   // andThen == executar depois
		int result2 = square.compose(times2).compose(plus2).apply(3);  // compose == executar antes
		System.out.println(result);
		System.out.println(result2);
		
	}

}
