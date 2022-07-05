package Generics;

import java.util.Objects;

public class Par<C,V> {

	private C chave;
	private V value;
	
	public Par(C chave, V value) {
		this.chave = chave;
		this.value = value;
	}
	C getChave() {
		return chave;
	}
	void setChave(C chave) {
		this.chave = chave;
	}
	V getValue() {
		return value;
	}
	void setValue(V value) {
		this.value = value;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par other = (Par) obj;
		return Objects.equals(chave, other.chave);
	}
	
	

	
}
