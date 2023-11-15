package com.wazquez.s15.common;

import java.util.Arrays;

public class ArrayPuzzle {
	/*
	 * Problem: Find the two numbers in an array that, when added together, give a
	 * specific target sum. You may assume that there is only one solution for the
	 * given input. Example: Input: Array: [2, 7, 11, 15] Target sum: 9 Output:
	 * Indices: [0, 1] Numbers: [2, 7]
	 */
	public static void main(String[] args) {
		System.out.println("case a={2,7,11,15} target=18 " + Arrays.toString(function(new int[] { 2, 7, 11, 15 }, 18)));
		System.out.println("case a={2,7,11,15} target=11 " + Arrays.toString(function(new int[] { 2, 7, 11, 15 }, 11)));
		System.out.println("case a={2,7,11,15,3} target=18 " + Arrays.toString(function(new int[] { 2, 7, 11, 15, 3 }, 18)));
		System.out.println("case a={} target=18 " + Arrays.toString(function(new int[] {}, 18)));
		System.out.println("case a={2,7,11,14} target=-1 " + Arrays.toString(function(new int[] { 2, 7, 11, 15 }, -1)));
	}

	private static int[] function(int[] a, int targetSum) {
		if (targetSum < 1 || a == null || a.length == 0)
			return null;
		Arrays.sort(a);
		int left = 0;
		int right = a.length - 1;
		while (left < right) {
			int sum = a[left] + a[right];
			if (sum == targetSum) {
				return new int[] { a[left], a[right] };
			} else if (sum < targetSum) {
				left++;
			} else if (sum > targetSum) {
				right--;
			}
		}
		return null;
	}
}