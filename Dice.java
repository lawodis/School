/*
 * Jack Wood
 * 
 * Dice are used a lot in D&D, both in creating or later playing a character. Unlike other games D&D dice don't always
 * have six sides. Each pack of Dice comes with a 4 sided, 6 sided, 7 sided, 10 sided, 12 sided, and 20 sided dice.
 * 
 * This class can be used to simulate rolling a single die and returning the value rolled or rolling the same die
 * multiple times and returning the total rolled.
 * 
 * You can also set a name for the die if later it becomes helpful to call it an attack die or a damage die etc. 
 */

import java.util.*;

public class Dice
{
	private int numberOfSides, valueOnDie;
	
	private String name; //probably won't need this but it might be nice at some point
	
	public Dice()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nA dice is being created without sides.\n\nPlease enter how many sides this dice should have:");
		
		int sides = keyboard.nextInt();
		
		setSides(sides);
		
		rollDie();//The Dice would show a value even if it hadn't been used yet
		
		return;
	}//just in case I create a dice and forget to say how many sides it should have this method will get my back
	//also could come in handy for debugging
	
	public Dice(int sides)
	{		
		setSides(sides);
		
		rollDie();//The Dice would show a value even if it hadn't been used yet
		
		return;
	}
	
	public void setSides(int sides)
	{
		numberOfSides = sides;
		
		return;
	}//allows the number of sides the die has to be set or changed
	
	public int rollDie()
	{
		valueOnDie = (int) (Math.random() * numberOfSides + 1);
		
		return valueOnDie;
	}//simulates rolling a dice and returns the value that was rolled
	
	public void rollDice()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nA method has been called meant to roll the same dice multiple times, \nbut the number of times it should be rolled has not been specified.\n\nPlease enter how many times the die should be rolled:");
		
		rollDice(keyboard.nextInt());
	}//anticipates code written calling this method by accident or forgetting that the other method requires a integer for number of sides
	//also could be useful for debugging
	public int rollDice(int numberOfRolls)
	{
		int valueOnDice = 0;
		
		for(int i = 1; i <= numberOfRolls; i++)
		{
			valueOnDice += rollDie();
		}
		
		return valueOnDice;
	}//simulates rolling the same dice multiple times and keeping track of the total of those rolls
	
	public int readDie()
	{
		return valueOnDie;
	}
	
	public int getNumberOfSides()
	{
		return numberOfSides;
	}//can't really see where this would come in handy yet, but it doesn't hurt any
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

}
