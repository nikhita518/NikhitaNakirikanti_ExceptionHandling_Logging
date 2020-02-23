package com.mycompany.construction;

import java.io.PrintStream;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Client 
{
	private int house;
	private int standard;
	private String automated;
	static final Logger logger = Logger.getLogger(Client.class);
	
	public Client()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(System.out);
		logger.info("Enter the value of square feet within 6 digits");
		print.print("Enter the area of the house in square feet:");
		house = scan.nextInt();
		logger.info("Choose the options within the given one:");
		print.print("1.Use standard materials\n2.Use above standard materials\n3.Use high standard materials\nEnter the standard you need for your house:");
		standard = scan.nextInt();
		print.print("Enter do you need your house automated (y/n)");
		automated = scan.next();
		scan.close();
		print.print(new HouseConstruction().estimationCost(house,standard,automated));
	}
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	logger.debug("Debugging of the Client class has started");
        new Client();
    }
}
