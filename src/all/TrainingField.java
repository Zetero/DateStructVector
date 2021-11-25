package all;

public class TrainingField 
{
	public static void main(String args[])
	{
		ReVector<Integer> vector = new ReVector<Integer>(5);
		ReVector<Integer> vector2 = new ReVector<Integer>(5);
		vector.add(0, 1);
		vector.add(1, 2);
		vector.add(2, 3);
		vector.add(3, 4);
		vector.add(4, 5);
		
		vector2.add(0, 5);
		vector2.add(1, 4);
		vector2.add(2, 3);
		vector2.add(3, 2);
		vector2.add(4, 1);
		
		for(int i = 0; i < vector.size(); i++)
			System.out.println((i) + ")" + vector.get(i));
		System.out.println();
		
		vector.Insert(4, vector2);
		
		for(int i = 0; i < vector.size(); i++)
			System.out.println((i) + ")" + vector.get(i));
		System.out.println();
	}
}
