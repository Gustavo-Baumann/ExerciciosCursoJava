package lambdas;

public class CalculoExec2 {

	public static void main(String[] args) {
		
		Calculo soma = (x , y) ->{ return x + y; };
		System.out.println(soma.exec(5, 5));
	
		soma = (x , y) -> x * y; 
		System.out.println(soma.exec(5, 5));
		
		System.out.println(soma.muitoLegal());
		System.out.println(Calculo.daorasso());
	}
}
