package com.wazquez.s15.common;

import java.util.stream.IntStream;

public class RevertString {

	public static void main(String[] args) {

		invertedR("Hola mundo!");
		System.out.println();
		invertedString("Hola mundo!");
		System.out.println();
		invertedStringJSE8("Hola mundo!");
		System.out.println();		

	}

	private static void invertedR(String cadena) {
		int index = cadena.length() - 1;

		if (cadena.length() > 0) {
			System.out.print(cadena.charAt(index));
			invertedR(cadena.substring(0, index));
		}
	}

	private static void invertedString(String cadena) {
		if (cadena.length() > 0) {
			StringBuilder stringBuilder = new StringBuilder(cadena);
			String invertida = stringBuilder.reverse().toString();
			System.out.print(invertida);
		}
	}

	private static void invertedStringJSE8(String cadena) {
		IntStream intStream = cadena.chars();
		intStream.forEach(System.out::print);
	}
	

}
