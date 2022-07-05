package Collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Users> lista = new ArrayList<>();
		
		Users u1 = new Users("Mario");
		lista.add(u1);
		lista.add(new Users("Behind"));
		lista.add(new Users("TheArmario"));
		
		for(Users uX : lista) {
			System.out.println(uX);  // uX.nome é necessario, mas o metodo tostring serve
		}
		
		System.out.println();
		
		for(Users uX : lista) {
			System.out.println(uX.nome);
		}
		
		System.out.println();
		
		System.out.println(lista.get(0));  // busca por index na lista
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		System.out.println();
		
		lista.remove(1);
		lista.remove(new Users("TheArmario"));
		System.out.println(lista);
		
		System.out.println(lista.remove(new Users("Mario"))); 
		System.out.println(lista.size());
		System.out.println(lista.contains(u1));
		lista.add(u1);
		System.out.println(lista.contains(u1));
		
		
	}

}
