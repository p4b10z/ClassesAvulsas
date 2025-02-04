package Revisitando_Array;

import java.util.Objects;

public class usuario_1 {

	
	String nome ;

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
		usuario_1 other = (usuario_1) obj;
		return Objects.equals(nome, other.nome);
	} 
	
	
}
