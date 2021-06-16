package com.activities;

import java.util.Scanner;

public class EmployeeMain1 {

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
		
		System.out.println("Verify and Update the details: ");
		System.out.println("Menu");
		System.out.println("1.	Update Employee name");
		System.out.println("2.	Update Employee Address");
		System.out.println("3.	Update Employee mobile");
		System.out.println("4.	All information correct/Exit");
		
		int choice = 0;
		boolean done = false;
		while(choice!=4){
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Current name is: " + e.getName());				
				System.out.println("Enter new name : ");
				e.setName(sc.next());
				System.out.println("Updated name is: " + e.getName());
				
				System.out.println("Menu");
				System.out.println("1.	Update Employee name");
				System.out.println("2.	Update Employee Address");
				System.out.println("3.	Update Employee mobile");
				System.out.println("4.	All information correct/Exit");
				
				break;
				
				
			case 2:
				System.out.println("Current address is: " + e.getAddress());
				System.out.println("Enter new address : ");
				e.setAddress(sc.next());
				System.out.println("Updated address is: " + e.getAddress());

				System.out.println("Menu");
				System.out.println("1.	Update Employee name");
				System.out.println("2.	Update Employee Address");
				System.out.println("3.	Update Employee mobile");
				System.out.println("4.	All information correct/Exit");
				
				break;
				
			case 3:
				System.out.println("Current mobile is: " + e.getMobile());
				System.out.println("Enter new mobile : ");
				e.setMobile(sc.next());
				System.out.println("Updated mobile is: " + e.getMobile());
				
				System.out.println("Menu");
				System.out.println("1.	Update Employee name");
				System.out.println("2.	Update Employee Address");
				System.out.println("3.	Update Employee mobile");
				System.out.println("4.	All information correct/Exit");
				
				break;
				
			case 4:
				
				break;
			}
				
		}
			
		}
		
	}


