package com.mycompany.intrest;

import java.io.PrintStream;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class ClientMachine 
{
	private int principle;
	private float rate;
	private int time;
	static final Logger logger = Logger.getLogger(ClientMachine.class);
	
	@SuppressWarnings("resource")
	public ClientMachine()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		print.print("1.Simple Intrest\n2.Compound Intrest\nChoose the intrest you need to calculate");
		try 
		{
			int choice = scan.nextInt();
			if (choice==1)
			{
				inputMethod();
				SimpleIntrest simpleintrest = new SimpleIntrest();
				print.print(simpleintrest.calculateIntrest(principle,rate,time));
			}
			else if(choice==2)
			{
				inputMethod();
				CompoundIntrest compoundintrest = new CompoundIntrest();
				print.print(compoundintrest.calculateIntrest(principle,rate,time));
			}
			else
				throw new Exception();
		}
		catch(Exception e)
		{
			logger.error("You choose the wrong option. Please Try again!!!");
		}
		scan.close();
		
	}
	public void inputMethod()
	{
		try 
		{
			Scanner scan = new Scanner(System.in);
			PrintStream print = new PrintStream(System.out);
			logger.info("Enter the amount in 6 digits");
			print.print("Enter the principle amount:");
			principle = scan.nextInt();
			print.print("Enter the rate of intrest:");
			rate = scan.nextFloat();
			print.print("Enter the term of loan/deposit in years:");
			time = scan.nextInt();
			scan.close();
		}
		catch(Exception e)
		{
			logger.error("You might have entered wrong input. Please try again!!!");
			System.exit(0);
		}
	}
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	logger.debug("Debugging of ClientMachine class has started");
        new ClientMachine();
    }
}
