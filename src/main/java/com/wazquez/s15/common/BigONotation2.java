package com.wazquez.s15.common;

public class BigONotation2 {
	/*
	 * Problem: Given an array of integers, create a function that prints all
	 * possible pairs of elements from the array. Example: Input: Array:  [1, 2, 3,
	 * 4]
	 * 
	 * Output: Pairs: (1, 2), (1, 3), (1, 4),  (2, 3), (2, 4),  (3, 4)
	 */
	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3, 4 };
		int temp = intArray.length;
		for (int i = 0; i < 4; i++) {
			for (int j = 3; j >= 0; j--) {
				System.out.println("I:" + i + "\t :" + j);
			}
			System.out.println();
		}
	}
}