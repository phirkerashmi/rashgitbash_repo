package com.activities;

//import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
		Customer c=new Customer();				
		c.setName("Krishna");		
		c.setAddress("pune");		
		c.setMobile("6757565756");
		System.out.println("Employee details : ");
		String s = (c.getName()+","+c.getAddress()+","+c.getMobile());
		System.out.println(s);
		
		String[] words=s.split(",");//splits the string based on comma  
		
		System.out.println("Name: " + words[0]);  
		System.out.println("Address: " + words[1]);  
		System.out.println("Mobile: " + words[2]);  
}
}
