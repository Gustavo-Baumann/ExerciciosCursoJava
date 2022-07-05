package Collections;

import java.util.Objects;

public class Users {

	String nome;
	
	Users(String nome){
		this.nome = nome;
	}

	public String toString() {
		return "Meu nome é: " + this.nome;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
