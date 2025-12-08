package UEmployee;

public class University {

	public static void main(String[] args)
	{
		Faculty f = new Faculty("Arelico", 70000, "Computer Science");
		Staff s = new Staff("Richard", 100000, "Principal");

		System.out.println("Faculty" + "\nName: " + f.getname() + " Salary: $" + f.getsalary() + " Department: " + f.getdepartment());
		
		System.out.println();

		System.out.println("Staff" + " Name: " + s.getname() + " Salary: $" + s.getsalary() + " Job Title: " + s.gettitle());
	}
}

