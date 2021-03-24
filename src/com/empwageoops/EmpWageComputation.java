package com.empwageoops;

public class EmpWageComputation {
	// Creating a method
	public void welcomeMsg() {
		System.out.println("Welcome employee wage computation problem");

		// Check the employee is present or absent
		int IS_FULL_TIME = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("emp is present");
		} else {
			System.out.println("emp is not present");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To creating a object and call the method
		EmpWageComputation ewc = new EmpWageComputation();
		ewc.welcomeMsg();

	}
	
}
