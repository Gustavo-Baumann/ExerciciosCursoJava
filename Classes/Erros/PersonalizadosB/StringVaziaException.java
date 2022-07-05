package Erros.PersonalizadosB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {

	private String nome;

	public StringVaziaException(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getMessage() {
		return String.format("A string '%s' está vazia" , nome );
	}
}
