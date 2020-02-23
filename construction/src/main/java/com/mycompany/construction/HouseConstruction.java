package com.mycompany.construction;

import org.apache.log4j.Logger;

public class HouseConstruction 
{
	static final Logger logger = Logger.getLogger(Client.class);
	public int estimationCost(int house, int standard, String automated)
	{
		try 
		{
			if(automated.equals("y") && standard == 3)
			{
				return house*2500;
			}
			else if(standard == 3)
			{
				return house*1800;
			}
			else if(standard == 2)
			{
				return house*1500;
			}
			else if (standard == 1)
				return house*1200;
			else
				throw new Exception();
		}
		catch(Exception a)
		{
			logger.error("Option you choose is not among the displayed. Try again!!!");
			System.exit(0);
		}
		return 0;
	}
}
