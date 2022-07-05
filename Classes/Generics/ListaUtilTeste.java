package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> tongue = Arrays.asList("Alemon","Gringo","Engolish");
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		String ultimaLingua = (String) ListaUtil.getUltimoItem1(tongue);
		System.out.println(ultimaLingua);
		Integer ultimoNumero = (Integer) ListaUtil.getUltimoItem1(nums);
		System.out.println(ultimoNumero);
		
		String ultimaLingua2 = ListaUtil.getUltimoItem2(tongue); 
		System.out.println(ultimaLingua2); // metodo2 não precisou de cast
		
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimoItem2(nums);
		//da pra especificar o tipo de lista a se receber, mas não é necessario 
		System.out.println(ultimoNumero2);
	}
}
