package estruturasControle;

public class While {

	public static void main(String[] args) {
		
		int counter = 1;
		
		while(counter <= 10) {
			System.out.println("Fon");
			counter++;
		}
		
		System.out.println("----------");
		
		while(counter <=20) {
			System.out.printf("Fon %d\n", counter);
			counter+= 2;
		}
	}
}
