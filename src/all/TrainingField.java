package all;

public class TrainingField 
{
	public static void main(String args[]) throws Exception
	{
		ReQueue<Integer> queue = new ReQueue<Integer>(5);
		queue.push(1);
		System.out.println(queue.getItem());
		queue.pop();
		queue.push(2);
		System.out.println(queue.getItem());
		System.out.println(queue.pop());
		System.out.println(queue.getItem());
		queue.push(5);
		System.out.println(queue.pop());
	}
}
