package Erros.Personalizados;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {

	private String nome;
	
	public NumeroForaIntervaloException(String nome){
		this.nome = nome;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intevalo válido", nome );
	}
}
