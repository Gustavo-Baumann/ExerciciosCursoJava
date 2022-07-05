package ClasseObjeto;

public class areaCirc {

	double raio;
	static final double pi = 3.1415;
	
	public areaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
