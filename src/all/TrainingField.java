package all;

public class TrainingField 
{
	public static void main(String args[])
	{
		ReVector<Integer> vector = new ReVector<Integer>(10, 5);
		vector.add(0, 1);
		vector.add(1, 2);
		vector.add(2, 4);
		vector.add(3, 8);
		for(int i = 0; i < vector.capacity(); i++)
			System.out.println((i) + ")" + vector.get(i));
		System.out.println();
		
		vector.offsetAdd(1, 3);
		
		for(int i = 0; i < vector.capacity(); i++)
			System.out.println((i) + ")" + vector.get(i));
		System.out.println();
	}
}
