package lambdas;

import java.util.function.BinaryOperator;

public class CalculoExec3 {

	public static void main(String[] args) {
			
		BinaryOperator<Double> soma = (x , y) ->{ return x + y; };
		System.out.println(soma.apply(5.0, 5.0));
		
		soma = (x , y) -> x * y; 
		System.out.println(soma.apply(5.0, 5.0));
		
		BinaryOperator<Integer> soma2 = (x , y) ->{ return x + y; };
		System.out.println(soma2.apply(3, 3));
		
		soma2 = (x , y) -> x * y; 
		System.out.println(soma2.apply(3, 3));
		
		BinaryOperator<Double> divisao = (x , y) ->{ return x / y; };
		System.out.println(divisao.apply(9.0, 3.0));
		
		divisao = (x , y) -> x - y; 
		System.out.println(divisao.apply(9.0, 3.0));
		
	}
}
