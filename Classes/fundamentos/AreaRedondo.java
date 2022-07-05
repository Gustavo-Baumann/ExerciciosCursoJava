package fundamentos;

public class AreaRedondo {

	public static void main(String[] args) {
		double raio = 3.3;
		final double PI = 3.14159;
		double area = PI*raio*raio;
		System.out.println("Área = " + area + "M²");
		
		raio = 10;
		area = PI*raio*raio;
		System.out.println("Área = " + area + "M²");
	}
}
