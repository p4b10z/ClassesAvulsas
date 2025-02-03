package Revisitando_Array;

public class Usuario {
	String nome;
	String email;

	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;

			boolean nomeigual = outro.nome.equals(this.nome);
			boolean emailigual = outro.email.equals(this.email);

			return nomeigual && emailigual;
		} else {
			return false;
		}
	}
}

//o hash code será abrodado em outra aula 
//pausei os estudos do java com deitel pelo fato de falta de tempo 