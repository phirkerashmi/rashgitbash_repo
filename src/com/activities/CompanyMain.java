package com.activities;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Company c1=new Company();
		System.out.println("Enter the company name : ");
		c1.setName(sc.nextLine());
		
		System.out.println("Enter the employees : ");
		c1.setEmployees(sc.nextLine());
		
		System.out.println("Enter the TeamLead : ");
		c1.setTeamlead(sc.next());
		
		System.out.println("Team deails : ");
		System.out.println("Name : " + c1.getName());
		String sEmployees = (c1.getEmployees());
		System.out.println("Employees : " +sEmployees);
		System.out.println("Lead : " + c1.getTeamlead());
		
		String[] employeesArr =sEmployees.split(",");//splits the string based on comma  
		
		boolean isTeamLead = false;
		for(int i=0 ; i < employeesArr.length ; i++ )
		{
			String tempEmpName = employeesArr[i];
			if(tempEmpName.contains(c1.getTeamlead()))
					{
						isTeamLead = true;
						break;
					}
		}
			if(!isTeamLead)
			{
				System.out.println("Invalid Input");
			}
								
	}

}
