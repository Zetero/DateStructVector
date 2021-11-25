package all;

public class TrainingField 
{
	public static void main(String args[]) throws Exception
	{
		ReVector<Integer> vector = new ReVector<Integer>(5);
		vector.set(0, 1);
		vector.set(1, 2);
		vector.set(8, 6);
		
		for(int i = 0; i < vector.size(); i++)
			System.out.println((i) + ")" + vector.get(i));
		System.out.println();
	}
}
