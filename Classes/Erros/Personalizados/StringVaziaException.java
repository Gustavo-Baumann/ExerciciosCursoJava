package Erros.Personalizados;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String nome;

	public StringVaziaException(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getMessage() {
		return String.format("A string '%s' está vazia" , nome );
	}
}
