package Mastery;

import linkedlist.LinkedList;

public class LinkedListMastery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList soda = new LinkedList();
		
	soda.addAtFront("Crush");
	soda.addAtEnd("Pepsi");;
	soda.addAtFront("Coke");
		
	System.out.println("Soda amount: " + soda.size() + " cans");
	System.out.println(soda);
		
		
		
	soda.remove("Coke");
	System.out.println("Drank Coke");
	System.out.println("Soda amount: " + soda.size() + " cans");
	System.out.println(soda);
		
		
		
		
	soda.addAtFront("Sprite");
	soda.addAtEnd("Chubby Cola");
	System.out.println("Added Sprite to the front and Chubby Cola to the end");
	System.out.println("Soda amount: " + soda.size() + " cans");
	System.out.println(soda);
		
		
	soda.remove("Crush");
	System.out.println("Drank Crush");
	System.out.println("Soda amount: " + soda.size() + " cans");
	System.out.println(soda);
		
		
	soda.makeEmpty();
	System.out.println("Drank all sodas");
	System.out.println("Soda amount: " + soda.size() + " cans");
	}

}

