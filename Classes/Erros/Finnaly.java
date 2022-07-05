package Erros;

import java.util.Scanner;

public class Finnaly {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Diga um número");
			System.out.println(7/input.nextInt());		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			input.close();
		}
		
		System.out.println("fim");
	}

}
