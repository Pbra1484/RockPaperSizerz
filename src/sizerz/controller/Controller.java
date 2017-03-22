package sizerz.controller;

import java.util.Scanner;
import sizerz.model.Computer;

public class Controller 
{
	
	Scanner input;
	boolean again;
	String cInput;
	String pInput;
	Computer cpu;
	Controller()
	{
		input = new Scanner(System.in);
		again = true;
		cpu = new Computer();
	}
	
	
	//starts the program and loops the game loop until exit method changes again
	public void start()
	{
		System.out.println("Welcome to RPS");
		
		while(again)
		{
			System.out.println("Rock Paper or Scissors?");
			
			
			if(isValidInput())
			{
				gameLoop();
			}
			else
			{
				System.out.println("Please input a proper value");
			}
		
			exit();
		}
	}

	//check if the player input is valid
	private boolean isValidInput()
	{
		pInput = input.nextLine();
		if(pInput.equalsIgnoreCase("Rock") || pInput.equalsIgnoreCase("Paper") || pInput.equalsIgnoreCase("Scissors"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//the main game loop where all the comparisons are done
	private void gameLoop()
	{
		cInput = cpu.randomGess();
		
		System.out.println("You used " + pInput + " and the computer used " + cInput);
		
		if(pInput.equalsIgnoreCase(cInput))
		{
			System.out.println("You tied");
		}
		else
		{
			if(pInput.equalsIgnoreCase("Rock"))
			{
				if(cInput.equalsIgnoreCase("Scissors"))
				{
					System.out.println("You won");
				}
				else
				{
					System.out.println("You lose");
				}
			}
			else if(pInput.equalsIgnoreCase("Paper"))
			{
				if(cInput.equalsIgnoreCase("Rock"))
				{
					System.out.println("You won");
				}
				else
				{
					System.out.println("You lose");
				}
			}
			else
			{
				if(cInput.equalsIgnoreCase("Paper"))
				{
					System.out.println("You won");
				}
				else
				{
					System.out.println("You lose");
				}
			}
		}
	}
	
	//checks to see if the player want to continue the does that
	private void exit()
	{
		System.out.println("Continue? Yes or No");
		
		String exit = input.nextLine();
		
		if(exit.equalsIgnoreCase("Yes"))
		{
			
		}
		else if(exit.equalsIgnoreCase("No"))
		{
			again = false;
		}
		else
		{
			System.out.println("Please input a correct value");
			exit();
		}
	}
}
