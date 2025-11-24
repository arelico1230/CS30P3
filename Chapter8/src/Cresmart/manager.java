package Cresmart;

public class manager extends employee
{
	private double yearlySalary;
	
	public manager(String fn, String ln, double S)
	{
		super(fn, ln);
		yearlySalary = S;
	}
	
	public double pay (double weeks)
	{
		double payEarned;
		payEarned = yearlySalary/52 * weeks;
		
		return payEarned;
	}
}
