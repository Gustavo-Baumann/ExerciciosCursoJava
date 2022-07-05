package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> conversao1 = n -> Integer.toString(n,2);
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> conversao2 = n -> Integer.parseInt(n,2);
		
	
		nums.stream().map(conversao1).map(inverter).map(conversao2).forEach(System.out::println);
		
	}

}
