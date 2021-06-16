package com.activities;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Innings a1 = new Innings();

		System.out.println("Enter the team name: ");
		a1.setTeamName(sc.next());
		

		System.out.println("Enter session: ");
		a1.setInningsName(sc.next());
		System.out.println("Enter runs: ");
		a1.setRuns(sc.nextInt());
		a1.displayInningsDetails();
		

		

	}

}
