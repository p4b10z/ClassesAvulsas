package Revisitando_Array;

import java.util.HashSet;
import java.util.Set;

public class conjuntoComportado {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();

		lista.add("sex");
		lista.add("carlos");
		lista.add("lucas");
		lista.add("treeset()");
		lista.add("sortedset()");
		lista.add("erro de compilação");

		for (String candidatos : lista) {
			System.out.println(candidatos);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(3);
		nums.add(87);
		nums.add(109);

		System.out.println(nums);

	}

}
