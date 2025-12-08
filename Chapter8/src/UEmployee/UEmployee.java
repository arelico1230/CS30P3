package UEmployee;

public class UEmployee {
	
	private String employeename;
	private double salary;

	
	public UEmployee(String en, double s)
	{
		employeename = en;
		salary = s;
	}

	
	public String getName()
	{
		return(employeename);
	}


	
	public double getSalary()
	{
		return(salary);
	}

	
	public String toString()
	{
		return("Employee name: " + employeename + ", Salary: " + salary + "\n");
	}
}
