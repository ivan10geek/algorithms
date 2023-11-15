package com.wazquez.s15.common;

public class ArrayTest {

	/*
	 * Problem: Given an array of integers, find the maximum subarray sum, which is
	 * the sum of a contiguous subarray with the largest possible sum. Return the
	 * maximum subarray sum. Example: Input: Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
	 * Output: Maximum Subarray Sum: 6 Explanation: The subarray [4, -1, 2, 1] has
	 * the largest sum, which is 6.
	 */

	public static void main(String[] args) {
		int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}