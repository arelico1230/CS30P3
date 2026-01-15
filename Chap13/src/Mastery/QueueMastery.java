/*
Name: Richard Chang
Credit Name: CSE3020 - Computer Science 4
Assignment name: QueueMastery
*/
package Mastery;

import queue.Queue2;

public class QueueMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2 sodalist = new Queue2(3);
		
		System.out.println("Adding Coke, Crush, and Pepsi to the soda list");
		
		sodalist.enqueue("Coke");
		sodalist.enqueue("Crush");
		sodalist.enqueue("Pepsi");
		
		System.out.println("First soda: "+ sodalist.front());
		System.out.println("Amount of cans: "+ sodalist.size());
		System.out.println("Remove a soda from the list: "+ sodalist.dequeue());
		System.out.println("First soda: "+ sodalist.front());
		System.out.println("Amount of cans: "+ sodalist.size());
		
	}

}

/*
 * Test Case:
 Adding Coke, Crush, and Pepsi to the soda list
First soda: Coke
Amount of cans: 3
Remove a soda from the list: Coke
First soda: Crush
Amount of cans: 2

 */
