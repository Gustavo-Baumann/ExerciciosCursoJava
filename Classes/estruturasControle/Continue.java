package estruturasControle;

public class Continue {

	public static void main(String[] args) {
		
		for(int a = 0; a <=10; a++) {
			
			if(a % 2 == 1) continue;  //continue interrompe a sequencia e da restart
			
			System.out.println(a);
		}
	}
}
