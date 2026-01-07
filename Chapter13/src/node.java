
public class node {
	
	private String data;
	private node next;
	
	public node(String newData)
	{
		data = newData;
		next = null;
	}
	
	public void setNext(node newnode)
	{
		next = newnode;
	}
	
	public String getData() 
	{
		return data;
	}
	
	public node getNext()
	{
		return next;
	}
}
