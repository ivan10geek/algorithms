package com.wazquez.s15.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		String[] personRootWhitelist = { "USA_MM_CVS", "USA_MM_MRN", "USA_MM_OSCAR", "USA_PROFILE" };
		String input = "USA_MM_OSCAR";
		/*if (Arrays.stream(personRootWhitelist).findAny().equals(input.toString())) {
			System.out.println("Encontrado");
		} else {
			System.out.println("No hayado");
		}*/

		boolean val = personRootWhitelist.toString().contains(input);
		//System.out.println("VAL: " + val);
		
		List<String> valor=Arrays.stream(personRootWhitelist).filter(x->x.equalsIgnoreCase(input)).collect(Collectors.toList());
		for (String string : valor) {
			//System.out.println(string);
		}
		
		
		/*
		 * for (String str : personRootWhitelist) {
		 * 
		 * if(str==input) { System.out.println("Hayado"); break; }else {
		 * System.out.println("NO Hayado"); continue; }
		 * 
		 * }
		 */
		
		
		
	}
}
