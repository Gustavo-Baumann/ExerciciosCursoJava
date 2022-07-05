package Erros.PersonalizadosB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {

	private String nome;
	
	public NumeroForaIntervaloException(String nome){
		this.nome = nome;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intevalo válido", nome );
	}
}
