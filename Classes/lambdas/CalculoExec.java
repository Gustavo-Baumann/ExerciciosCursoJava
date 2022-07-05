package lambdas;

public class CalculoExec {

	public static void main(String[] args) {
		
		Calculo soma = new Soma();
		System.out.println(soma.exec(2, 3));
		
		soma = new Multiplicar();
		System.out.println(soma.exec(2, 3));
	}

}
