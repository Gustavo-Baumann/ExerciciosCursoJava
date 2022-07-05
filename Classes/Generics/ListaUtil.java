package Generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimoItem1(List<?> lista) {
		return lista.get(lista.size() -1);
	}
	
	public static<T> T getUltimoItem2(List<T> lista) {     // metodo generico 
		return lista.get(lista.size() -1);               // nao requer casting 
	}
}
