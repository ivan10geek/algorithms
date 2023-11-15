package com.wazquez.s15.common;

public class Test2 {
 
		
		/*
		 * Problem: Given a sorted array of integers, implement a function to search for
		 * a specific target value. If the target is found, return its index; otherwise,
		 * return -1. You should optimize the algorithm for the best time complexity.
		 * Example:Input: Array: [1, 3, 5, 7, 9] Target: 5 Output: Index: 2
		 */
		
		public static void main(String[] args) {

			int intArray[] = { 1, 3, 5, 7, 9 };
			int target = 9;
			int value=getIndex(intArray, target);
			System.out.println("Index: "+value);

		}

		private static int getIndex(int intArray[], int target) {
			
			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i] == target) {
					return i;
				} else {
					continue;
				}
			}
			return -1;
		}

	}