package fundamentos;

public class OperadoresAtribuição {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 5;
		int c = a + b;
		System.out.println(c);
		
		c += a; // c = c + a 
		System.out.println(c);
		c -= b; // c = c - b 
		System.out.println(c);
		c *= a; // c = c * a
		System.out.println(c);
		c /= b; // c = c / b
		System.out.println(c);
		c %= 2; 
		System.out.println(c); // 1 = impar, 0 = par
		
		c++; // c = c + 1
		System.out.println(c);
		c--; // c = c - 1
		System.out.println(c);
		++c; // pode ser a frente tb
		--c;
		
		
		
	}
}
