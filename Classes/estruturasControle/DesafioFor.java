package estruturasControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "@";
		for(String a = ""; a.length() <5 ; a += "a") {
			System.out.println(valor);       // WRONG
			valor += "@";
			
		}
		
		String value = "@";
		
		for(String b = "@";!b.equals("@@@@@@"); b += "@") {
			System.out.println(value);       // RIGHT 
			value += "@"; 
		}
	}
}
