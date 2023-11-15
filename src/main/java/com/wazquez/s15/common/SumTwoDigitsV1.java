package com.wazquez.s15.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SumTwoDigitsV1 {

	public static void main(String[] args) {
		
		Integer input[] = {2,7,11,15};
		Integer target =18;
		
		HashSet<Integer> complements = new HashSet<Integer>();
		List<Integer[]> result = new ArrayList<Integer[]>();
		
		
		for(int i=0; i<input.length; i++ ) {
			
			int complement = target -input[i];
			
			if(complements.contains(complement)) {
				//return new int[] {input[i], complement};
			}else {
				complements.add(input[i]);
			}
			
		}
		
		

	}

}

