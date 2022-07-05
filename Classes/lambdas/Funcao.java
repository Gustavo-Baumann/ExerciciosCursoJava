package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		//functions recebem um tipo escolhido e retornam um tipo escolhido ; usa .apply
		Function<Integer,String> ParImpar = numero -> numero %2 == 0 ? "Even" : "Odd";
		System.out.println(ParImpar.apply(36));
		System.out.println(ParImpar.apply(37));;
		
		Function<String,String> result = valor -> "The value is : " + valor;
		
		Function<String,String> plus = valor -> valor + " *Sike* ";
		
		String resultado = ParImpar.andThen(result).andThen(plus).apply(40); 
		System.out.println(resultado);     // andthen insere uma função dentro da outra
		                                   // desde que o output de uma seja igual o input da proxima
	}

}
