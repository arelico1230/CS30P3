package Cresmart;

public class associate extends employee
{
	private double hourlypay;
	
	public associate(String fn, String ln, double hrate) 
	{
		super(fn,ln);
		hourlypay = hrate;
	}
	
	public double pay (double hours) 
	{
		double payEarned;
		if ( hours > 40 ) 
		{
			payEarned = ((hourlypay*40) + (hourlypay*1.5) * (hours - 40));
		}
		else 
		{
			payEarned = hours*hourlypay;
		}
		
		return payEarned;
	}
	
	public String toString() 
	{
		return(super.toString() + ", Associate, " + "Hourly pay:" + hourlypay);
	}
}
