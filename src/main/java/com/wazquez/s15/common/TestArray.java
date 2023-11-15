package com.wazquez.s15.common;

public class TestArray {

	public static void main(String[] args) {
		int intArray[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// Input: Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
		// [-2, 1, -3, 4, -1, 2, 1, -5, 4]
		//

		// System.out.println(Integer.MIN_VALUE);

		int size = intArray.length;
		int maximo_hasta_ahora = Integer.MIN_VALUE, maximo_termina_aqui = 0;
		for (int i = 0; i < size; i++) {
			maximo_termina_aqui = maximo_termina_aqui + intArray[i];
			System.out.println("Iteration: " + i + " -  max_ending_here: " + maximo_termina_aqui);
			if (maximo_hasta_ahora < maximo_termina_aqui)
				maximo_hasta_ahora = maximo_termina_aqui;
			System.out.println("\t			 	Index: " + i + " - max_so_far: " + maximo_hasta_ahora);
			if (maximo_termina_aqui < 0)
				maximo_termina_aqui = 0;
		}
	}
}