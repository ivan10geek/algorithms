package com.wazquez.s15.common;

public class BigONotation3 {

	public static void main(String[] args) {
		{
			System.out.println("evenOrOdd = " + evenOrOdd(1));

		}
	}

	static String evenOrOdd(int value) {
		if (value % 2 == 0) {
			return "Par";
		} else {
			return "Impar";
		}

	}

}

