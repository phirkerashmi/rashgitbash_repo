package com.activities;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee e=new Employee();
		System.out.println("Enter the name : ");
		e.setName(sc.next());
		System.out.println("Enter Address : ");
		e.setAddress(sc.next());
		System.out.println("Enter Mobile : ");
		e.setMobile(sc.next());
		System.out.println("Employee details : ");
		System.out.println("Name : " + e.getName());
		System.out.println("Address : " + e.getAddress());
		System.out.println("Mobile : " + e.getMobile());
		

		
	}

}
