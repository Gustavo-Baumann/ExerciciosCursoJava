package DesafioModulo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa Nay = new Pessoa("Nay", 60);
		Comida Arroz = new Comida("Arroz", 0.2);
		Comida Carne = new Comida("Carne", 0.3);
		
		System.out.println(Nay.Intro());
		Nay.comer(Arroz);
		System.out.println(Nay.Intro());
		Nay.comer(Carne);
		System.out.println(Nay.Intro());
		
	
	}
}
