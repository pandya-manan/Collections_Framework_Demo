package collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueueDemo {
	
	public static void main(String[] args)
	{
		Queue<Integer> numbers=new PriorityQueue<>();
		
		//Adding elements to a queue using offer() method which follows FIFO Logic
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		numbers.offer(4);
		numbers.offer(5);
		
		System.out.println(numbers.toString());
		
		//Using the poll method to remove the element which had entered the queue first
		System.out.println(numbers.poll());
		
		//Using the peek method to just see which element will be removed next and is in the front end of the queue.
		System.out.println(numbers.peek());
		
	}

}
