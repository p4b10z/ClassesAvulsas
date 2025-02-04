package Revisitando_Array;

import java.util.HashSet;
import java.util.Set;

public class conjuntoBagunçado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double ==> Double
		conjunto.add(true); // boolean ==> Boolean
		conjunto.add("String"); // String
		conjunto.add(1); // int ==> integer
		conjunto.add('x'); // char ==> Charactere

		System.out.println("o tamanho do conjunto é " + conjunto.size());
		System.out.println(conjunto.remove("String"));

		System.out.println("o tamanho do conjunto é " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		
		
		
		Set nums = new HashSet(); 
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //união entre dois conjuntos 
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		 
	}
}
