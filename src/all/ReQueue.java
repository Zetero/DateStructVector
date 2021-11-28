package all;

public class ReQueue <T>
{
	protected int count = 0;
	protected Object[] objects;
	
	//Default constructor
	ReQueue()
	{
		objects = new Object[10];
	}
	
	//Constructor with argument size
	ReQueue(int size)
	{
		objects = new Object[size];
	}
	
	//Add object in end
	void push(T object)
	{
		if(count < objects.length)
		{
			objects[objects.length - count - 1] = object;
			count++;
		}
	}
	
	//Get element from start with delete
	Object pop()
	{
		Object O = objects[objects.length - count];
		for(int i = objects.length - 1; i > 0; i--)
		{
			objects[i] = objects[i - 1];
			objects[i - 1] = null;
		}
		count--;
		return O;
	}
	
	//Get element from start without delete
	Object getItem()
	{
		return objects[objects.length - 1];
	}
	
}
