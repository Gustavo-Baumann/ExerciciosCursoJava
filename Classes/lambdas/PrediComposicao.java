package lambdas;

import java.util.function.Predicate;

public class PrediComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = num -> num %2 == 0;
		Predicate<Integer> is3digits = num -> num >= 100 && num <= 999;
		System.out.println(isEven.and(is3digits).test(125));            // and == &&
		System.out.println(isEven.or(is3digits).test(125));             // or == ||
		System.out.println(isEven.and(is3digits).negate().test(125));   // negate == !
	}

}
