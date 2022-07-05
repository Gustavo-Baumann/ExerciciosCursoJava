package estruturasControle;

import java.util.Scanner;

public class DoWhile {

	 public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text = " ";
		
		do {
			System.out.println("Terminar?");
			text = input.nextLine();
		} while(!text.equalsIgnoreCase("sim"));
		
		input.close();
		
		 
	}
}
