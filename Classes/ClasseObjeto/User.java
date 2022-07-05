package ClasseObjeto;

public class User {

	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof User) {
		User admin = (User) objeto;
		
		boolean nomeIgual = admin.nome.equals(this.nome);
		boolean emailIgual = admin.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.email.length();
	} 

	
}
