package com.wazquez.s15.common;

import java.util.ArrayList;
import java.util.List;

public class TestFors {

	public static void main(String[] args) {
		List<String> personRootWhitelist = new ArrayList<String>();
		personRootWhitelist.add("USA_MM_CVS");
		personRootWhitelist.add("USA_MM_MRN");
		personRootWhitelist.add("USA_MM_OSCAR");
		personRootWhitelist.add("USA_PROFILE");
		String root = "USA_PROFILE";
		int count = 0;
		for (int i = 0; i < personRootWhitelist.size(); i++) {
			if (!personRootWhitelist.get(i).equalsIgnoreCase(root)) {
				System.out.println("Index: " + i + ", No Existe");
			}
		}
		String test = findValueStream(personRootWhitelist, root);
		if (test == null || test.isEmpty()) {
			System.out.println("No se hayo");
		} else {
			System.out.println("Se hayo el elemento: " + test);
		}
	}

	static String findValueStream(List<String> list, String key) {
		return list.stream().filter(ds -> key.equals(ds)).findFirst().orElse(null);
	}

}
