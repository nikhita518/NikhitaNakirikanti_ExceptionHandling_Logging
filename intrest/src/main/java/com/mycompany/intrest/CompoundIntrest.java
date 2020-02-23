package com.mycompany.intrest;


import java.math.RoundingMode;
import java.text.DecimalFormat;


public class CompoundIntrest
{
	public double calculateIntrest(int principle, float rate, int time) 
	{	
		double compoundIntrest = (principle*Math.pow((1+(rate/100)),time))-principle;	
		DecimalFormat f = new DecimalFormat("##.00");
		f.setRoundingMode(RoundingMode.DOWN);
		String s = f.format(compoundIntrest);
		return Double.parseDouble(s);
	}

}
