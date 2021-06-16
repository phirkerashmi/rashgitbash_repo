package com.activities;

public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	
	
	public void setTeamName(String teamname)
	{
		this.teamname = teamname;
	}
	
	public String getTeamName()
	{
		return teamname;
	}
	
	public void setInningsName(String inningsname)
	{
		this.inningsname = inningsname;
	}
	
	public String getInningsName()
	{
		return inningsname;
	}
	
	public void setRuns(int runs)
	{
		this.runs = runs;
	}
	
	public int getRuns()
	{
		return runs;
	}
	
	public void displayInningsDetails()
	{
		System.out.println("Name: " + teamname);
		System.out.println("Scored: " + runs);
		if(runs < 0)
		{
			System.out.println("Input is invalid");			
		}
		else if( runs < 200)
		{
			System.out.println("Need " + ++runs + " to win");
		}
		else if (runs == 200)
		{
			System.out.println("Match is ended");
		}
		else
		{
			System.out.println("Input is invalid");			
		}
			
	}

}
