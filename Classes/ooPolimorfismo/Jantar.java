package ooPolimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa gordo = new Pessoa(115.041);
		Arroz a1 = new Arroz(0.180);
		Feijão f1 = new Feijão(0.154);
		Sorvete s1 = new Sorvete(0.402);
		
		System.out.println(gordo.getPeso());
		
		gordo.comer(a1);
		gordo.comer(f1);
		
		System.out.println(gordo.getPeso());
		
		gordo.comer(s1);
		
		System.out.println(gordo.getPeso());
	}
}
