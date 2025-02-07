package Revisitando_Array;

import java.util.ArrayList;

public class lista {
     public static void main(String[] args) {
		ArrayList<usuario_1> lista = new ArrayList<usuario_1>(); 
		
		usuario_1 u1 = new usuario_1("ana"); 
		usuario_1 u2 = new usuario_1("ana");
		
		lista.add(u1);
		lista.add(u2);
		lista.add(new usuario_1("Carlos"));
		lista.add(new usuario_1("Maria"));
		lista.add(new usuario_1("João"));
		lista.add(new usuario_1("Ana"));
		lista.add(new usuario_1("Pedro"));
		lista.add(new usuario_1("Lucas"));
		lista.add(new usuario_1("Fernanda"));
		lista.add(new usuario_1("Juliana"));
		lista.add(new usuario_1("Rafael"));
		lista.add(new usuario_1("Patrícia"));
		
		System.out.println(lista.get(1));
		
		for(usuario_1 u : lista) {
			System.out.println(u.nome);
		}
		
	
	}
}
