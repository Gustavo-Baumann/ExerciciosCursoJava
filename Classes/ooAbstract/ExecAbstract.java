package ooAbstract;

public class ExecAbstract {

	public static void main(String[] args) {
		Animal a = new Cachorro();
		a.mover();
		a.respirar();
		
		Mamifero b = new Cachorro();
		b.mover();
		b.mamar();
		b.respirar();
		
		System.out.println(b.mover());
		System.out.println(b.mamar());
		System.out.println(b.respirar());
		
		// Animal c = new Animal(); animal é uma classe abstrata e n pode ser instanciada
		
	}

}
