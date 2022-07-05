package ClasseObjeto;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		User usuario1 = new User();
		usuario1.nome = "Nay";
		usuario1.email = "nayzika.fokmail.com";
		
		User usuario2 = new User();
		usuario2.nome = "Nay";
		usuario2.email = "nayzika.fokmail.com";
		
		System.out.println(usuario1 == usuario2);        // retornará false 
		System.out.println(usuario1.equals(usuario2));   // igual à == , até vc definir um metodo equals
		System.out.println(usuario1.equals(new Date())); // date não se atribui a user, entao será false
	
		System.out.println(usuario1.nome.hashCode());    // dunno  
	}

}
