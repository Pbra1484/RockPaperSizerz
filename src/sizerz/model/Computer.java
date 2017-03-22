package sizerz.model;

public class Computer 
{
	
	public Computer()
	{
		
	}
	
	//returns a string for the computers random input
	public String randomGess()
	{
		String returned = "";
		int rand = (int)(Math.random() * 3);
		if(rand == 0)
		{
			returned = "Rock";
		}
		else if(rand == 1)
		{
			returned = "Paper";
		}
		else
		{
			returned = "Scissors";
		}
		
		return returned;
	}

}
