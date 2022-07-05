package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {  // First In First Out

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Nay");          // add da erro caso a fila esteja cheia 
		fila.offer("Sirino");     // offer não 
		fila.offer("Batista");
		fila.offer("Peredro");
		fila.offer("Résfael");
		
		System.out.println(fila.peek());     // caso fila vazia, peek retorna null
		System.out.println(fila.element());  // já element dá erro 
		
		System.out.println();
		
		System.out.println(fila.size());
		fila.clear();
		System.out.println(fila.isEmpty());
		
		System.out.println();
		
		fila.add("Jeduardo");
		fila.add("Genésio");
		
		System.out.println(fila);
		
		System.out.println(fila.poll());      // poll passa e retira o item
		System.out.println(fila.poll());      
		System.out.println(fila.poll());      // com 0 itens retorna null
		
		fila.add("Françolino");
		fila.add("Abastácio");
		
		System.out.println();
		
		System.out.println(fila.remove());    // remove mesma coisa do poll
		System.out.println(fila.remove());    // com 0 itens dá erro
		
		System.out.println();
		
		System.out.println(fila.contains("Falácio"));
	
	}
}
