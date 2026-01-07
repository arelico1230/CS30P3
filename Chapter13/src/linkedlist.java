
public class linkedlist 
{
	private node head;
	
	public linkedlist () 
	{
		head = null;
	}
	
	public void addAtFront(String str) 
	{
		node newnode = new node(str);
		newnode.setNext(head);
		head = newnode;
	}
	
	public void addAtEnd(String str) 
	{
		node newnode = new node(str);
		node current = head;
		
		if(head == null) 
		{
			newnode.setNext(head);
			head = newnode;
		}
		else
		{
			while(current.getNext() != null) 
			{
				current = current.getNext();
			}
			current.setNext(newnode);
		}
	}
	
	public void remove(String str)
	{
		node current = head;
		node previous = head;
		
		if(current.getData().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				
				if(current.getData().equals(str))
				{
					previous.setNext(current.getNext());
				}
			}
		}
	}
	
	public int size()
	{
		node current = head;
		int count = 0;
		
		if(current != null)
		{
			count += 1;
			
			while(current.getNext() != null)
			{
				current = current.getNext();
				count += 1;
			}
			return count;
		}
		else
		{
			return 0;
		}
	}
	
	public String toString()
	{
		node current = head;
		String listString;
		
		if(current != null)
		{
			listString  = current.getData() + "\n";
			
			while(current.getNext() != null)
			{
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		}
		else
		{
			return("There are no items in the list.");
		}
	}
	
	public void makeEmpty()
	{
		head = null;
	}
}


