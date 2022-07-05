package fundamentos;

import java.util.Scanner;

public class IgualdadeString {

	public static void main(String[] args) {
		
		System.out.println("50" == "50"); 
		
		String cinquenta = new String("50"); 
		System.out.println("50" == cinquenta); // este dá falso
		
		String cinquenta2 = "52";
		System.out.println("52" == cinquenta2); // este dá verdadeiro
		
		System.out.println("50".equals(cinquenta)); // tbm verdadeiro
		
		Scanner input = new Scanner(System.in);
		String numero = input.nextLine();
		System.out.println("2" == numero); // false string + numero
		System.out.println("2".equals(numero)); // true  ignora tipo
		System.out.println("2".equals(numero.trim())); // true trim ignora espaços em branco
		
		// sempre usar equals quando comparar strings 
	
		input.close();
		
		
	}
}
