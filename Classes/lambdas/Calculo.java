package lambdas;

@FunctionalInterface
public interface Calculo {

	double exec(double a, double b);
	
	default String muitoLegal() {   // metodos default / static n�o interferem com a functionalItFc
		return "Muito Legal";
	}
	
	static String daorasso() {
		return "Daorasso";
	}
}
