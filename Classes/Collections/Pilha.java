package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {  // Last In First Out

	public static void main(String[] args) {
		
		Deque<String> stack = new ArrayDeque<>();
		
		stack.push("Batata");    // add retorna true ou false 
		stack.push("Tomate");    // push não retorna nada
		stack.push("Pepino");	 // se vc usar 2 add diferentes dá bagunça na ordem da pilha
		stack.push("Ovo");        
		stack.push("Uva");
		stack.push("Ave");
		
		System.out.println(stack.peek());
		System.out.println(stack.element());         // adicionar : add,offer,(push apenas pilha)
		                                             // ler : peek,element
		System.out.println();                        // remover : remove,poll,(pop apenas pilha)
		
		System.out.println(stack.size());
		
		for(String comida : stack) {
			System.out.println(comida);
		}
		
		System.out.println();
		
		System.out.println(stack.pop());      // pop similar ao remove, da erro caso pilha vazia
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
	}
}
