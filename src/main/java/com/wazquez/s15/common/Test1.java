package com.wazquez.s15.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
	/*
	 * Problem: Design a data structure that supports two operations: add(value) and
	 * getRandom(). The add operation adds a value to the data structure, and the
	 * getRandom operation returns a random value from the data structure with equal
	 * probability. Example: Input/Operation Sequence: add(1) add(2) add(3)
	 * getRandom() add(4) getRandom() Output: 2 (Random value from the data
	 * structure) 3 (Random value from the data structure)
	 */

	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		System.out.println(s1.getRandom());
	}

}
class Sub {

	private List<Integer> intArray;

	Sub() {
		this.intArray = new ArrayList<Integer>();
	}

	public int getRandom() {

		int rnd = new Random().nextInt(this.intArray.size());

		return intArray.get(rnd);
	}

	public void add(Integer intValue) {
		intArray.add(intValue);
	}

}
