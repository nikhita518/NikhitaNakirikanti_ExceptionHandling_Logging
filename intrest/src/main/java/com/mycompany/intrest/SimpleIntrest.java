package com.mycompany.intrest;


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SimpleIntrest 
{
	public double calculateIntrest(int principle, float rate, int time) 
	{
		double intrest = (principle*rate*time)/100;
		DecimalFormat f = new DecimalFormat("##.00");
		f.setRoundingMode(RoundingMode.DOWN);
		String s = f.format(intrest);
		return Double.parseDouble(s);
	}
	
	
}
