package ClasseObjeto;

public class Nulll {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("salve"));
		
		Data d3 = Math.random() > 0.69 ? new Data() : null;
		if(d3 != null) {
			System.out.println(d3.obterData());
		}
			
		String s2 = Math.random() > 0.69 ? "salve": null;
		if(s2 != null) {
			System.out.println(s2.concat(""));
		}
		
		
	}  
}
