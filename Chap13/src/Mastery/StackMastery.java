package Mastery;

import stack.Stack2;

public class StackMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack2 sodastack = new Stack2(3);
		
		System.out.println("Stacking Coke, Crush, and Pepsi");
		
		sodastack.push("Coke");
		sodastack.push("Crush");
		sodastack.push("Pepsi");
		
		System.out.println("Top of the soda stack: "+ sodastack.top());
		
		System.out.println("Amount of cans: "+ sodastack.size());
		
		System.out.println("Take a soda off the top: "+ sodastack.pop());
		
		System.out.println("Top of the soda stack: "+ sodastack.top());
		
		System.out.println("Amount of cans: "+ sodastack.size());
		
	}

}