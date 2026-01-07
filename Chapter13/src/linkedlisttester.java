
public class linkedlisttester {
	
	public static void main(String[] args) 
	{
		linkedlist list = new linkedlist();
		
		list.addAtFront("red");
		list.addAtFront("314");
		list.addAtFront("CHHS");
		
		System.out.println("List has " + list.size() + " items:");
		
		System.out.println(list);
		
		list.addAtEnd("blue");
		list.addAtEnd("green");
		
		System.out.println("List has " + list.size() + " items:");
		
		System.out.println(list);
	}
}

