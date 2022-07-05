package ClasseObjeto;

public class areaCircTeste {

	public static void main(String[] args) {
		
		//areaCirc.pi = 10;   // para ativar precisa retirar o final da variavel pi
		
		areaCirc a1 = new areaCirc(10);
		//a1.pi = 10;
		System.out.println(a1.area());
		
		areaCirc a2 = new areaCirc(5);
		//a2.pi = 5;
		System.out.println(a2.area());
		
		System.out.println(areaCirc.area(1));
	}
}
