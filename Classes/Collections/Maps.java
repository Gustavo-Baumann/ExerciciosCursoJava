package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		
		Map<Integer,String> Users = new HashMap<Integer,String>();
		
		Users.put(1, "Alex");
		Users.put(2, "Bruno");
		Users.put(3, "Carlos");
		
		System.out.println(Users.size());
		System.out.println(Users);
		
		Users.put(3, "Carol");       // put substitui caso tal valor já exista
		System.out.println(Users);
		
		System.out.println();
		
		System.out.println(Users.keySet());
		System.out.println(Users.values());
		System.out.println(Users.entrySet());  // só troca por colchetes, vai que né :)
		
		System.out.println();
		
		System.out.println(Users.containsKey(3));
		System.out.println(Users.containsValue("Daniel"));
		
		System.out.println();
		
		System.out.println(Users.get(1));      // usa a key e não o index 
		System.out.println(Users.remove(3));
		
		for(Integer chave : Users.keySet()) {
			System.err.println(chave);
		}
		for(String valor : Users.values()) {
			System.err.println(valor);
		}
		for(Entry<Integer,String> registro : Users.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.print(registro.getValue());
			System.out.println();
		}
	}

}
