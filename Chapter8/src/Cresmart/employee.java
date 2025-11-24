package Cresmart;

public abstract class employee 
{
	private String firstname, lastname;
	
	//Constructor method
	public employee(String fn, String ln) 
	{
		firstname = fn;
		lastname = ln;
	}
	public String toString() 
	{
		return(firstname + " " + lastname);
	}
	
	abstract double pay(double period); 
}
