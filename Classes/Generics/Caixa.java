package Generics;

public class Caixa<T> {     // <...> � um coringa para qualquer tipo 

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
