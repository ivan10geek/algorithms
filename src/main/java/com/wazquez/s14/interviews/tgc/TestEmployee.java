package com.wazquez.s14.interviews.tgc;

import java.util.Arrays;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("John");
		Employee e2 = new Employee("Danna");
		Employee e3 = new Employee("Wilson");
		Employee e4 = new Employee("Scarlet");
		List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4);

		System.out.println("Employees List");
		employeeList.forEach(System.out::println);

		System.out.println("*****Sorted by name Acending way");
		employeeList.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).forEach(System.out::println);
		
		System.out.println("*****Sorted by name Decending way");
		employeeList.stream().sorted((x, y) -> y.getName().compareTo(x.getName())).forEach(System.out::println);

	}

}
