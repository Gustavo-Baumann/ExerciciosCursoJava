package fundamentos;

public class DesafioAritmetica {

	public static void main(String[] args) {
		
		System.out.println("bloco1");
		
		int a = 3;
		int b = 2;
		int c = 6;
		
		int d = a + b;
		int e = d * c;
		int f = (int) Math.pow(e, 2);
		int g = f / ( a * b );
		System.out.println(g);
		
		System.out.println("bloco2");
		
		int a2 = 1;
		int b2 = 5;
		int c2 = 2;
		int d2 = 7;
		
		int e2 = (a2 - b2) * (c2 - d2);
		int f2 = e2 / c2;
		int g2 = (int) Math.pow(f2, c2);
		System.out.println(g2);
		
		System.out.println("bloco3");
		
		int a3 = g - g2;
		int b3 = (int) Math.pow(a3, 3);
		System.out.println(b3);
		
		System.out.println("bloco4");
		
		int a4 = 10;
		int b4 = (int) Math.pow(a4, 3);
		int c4 = b3 / b4;
		System.out.println(c4);
		
	}
}
