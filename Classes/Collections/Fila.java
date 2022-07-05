package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {  // First In First Out

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Nay");          // add da erro caso a fila esteja cheia 
		fila.offer("Sirino");     // offer n�o 
		fila.offer("Batista");
		fila.offer("Peredro");
		fila.offer("R�sfael");
		
		System.out.println(fila.peek());     // caso fila vazia, peek retorna null
		System.out.println(fila.element());  // j� element d� erro 
		
		System.out.println();
		
		System.out.println(fila.size());
		fila.clear();
		System.out.println(fila.isEmpty());
		
		System.out.println();
		
		fila.add("Jeduardo");
		fila.add("Gen�sio");
		
		System.out.println(fila);
		
		System.out.println(fila.poll());      // poll passa e retira o item
		System.out.println(fila.poll());      
		System.out.println(fila.poll());      // com 0 itens retorna null
		
		fila.add("Fran�olino");
		fila.add("Abast�cio");
		
		System.out.println();
		
		System.out.println(fila.remove());    // remove mesma coisa do poll
		System.out.println(fila.remove());    // com 0 itens d� erro
		
		System.out.println();
		
		System.out.println(fila.contains("Fal�cio"));
	
	}
}
