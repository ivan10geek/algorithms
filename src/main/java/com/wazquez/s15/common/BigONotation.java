package com.wazquez.s15.common;

public class BigONotation {

	/*
	 * Problem: Given an array of integers, create a function that prints all possible pairs of elements from the array. 
	 * Example:
	 * Input: Array:  [1, 2, 3, 4]
	 * 
	 * Output: Pairs: (1, 2), (1, 3), (1, 4),
	 * 				  (2, 3), (2, 4), 
	 * 				  (3, 4)
	 */
	public static void main(String[] args) {
			int intArray[] = {1, 2, 3, 4};
			 printPairs(intArray, intArray.length);

	}
	
	static void printPairs(int arr[], int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("("+ arr[i]+", \t"+ arr[j]+ ")"+", \t");
			}
		}
	}
	
	/*static void printPairs(int arr[], int n)
	{
	  
	    // Nested loop for all possible pairs
		
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("(" +  arr[i]+ ", \t" + arr[j]+ ")"+ ", \t");
	        }
	        System.out.println();
	    }
	}*/
	 

}