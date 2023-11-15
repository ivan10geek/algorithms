package com.wazquez.s14.interviews.tgc;

import java.util.Random;

public class Employee {
	private int id;
	private String name;

	Employee() {
		this.id = getRandomlyId();
	}

	Employee(String name) {
		this.name = name;
		this.id = getRandomlyId();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getRandomlyId() {

		Random rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;

		return randomNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
