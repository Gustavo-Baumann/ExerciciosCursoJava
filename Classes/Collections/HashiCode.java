package Collections;

import java.util.HashSet;

public class HashiCode {

	public static void main(String[] args) {
		
		HashSet<Users> lista = new HashSet<>();
		
		lista.add(new Users("Maria"));
		lista.add(new Users("Rose"));
		lista.add(new Users("Shinna"));
		
		System.out.println(lista.contains(new Users("Shinna"))); // true bc equals & hashcode are on
	}
}
