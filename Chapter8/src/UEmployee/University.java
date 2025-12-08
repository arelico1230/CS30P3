package UEmployee;

public class University {

	public static void main(String[] args)
	{
		Faculty f = new Faculty("Arelico", 70000, "Computer Science");
		Staff s = new Staff("Richard", 100000, "Principal");

		System.out.println("Faculty" + "\nName: " + f.getName() + "\nSalary: $" + f.getSalary() + "\nDepartment: " + f.getdepartment());
		
		System.out.println();

		System.out.println("Staff" + "\nName: " + s.getName() + "\nSalary: $" + s.getSalary() + "\nJob Title: " + s.gettitle());
	}
}

