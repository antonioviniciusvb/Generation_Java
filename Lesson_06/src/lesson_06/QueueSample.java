package lesson_06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.add("Aline");
		queue.add("Pedro");
		queue.add("Vinicius");
		queue.add("Luiza");
		queue.add("Maria");
		queue.add("Antonio");

		System.out.println(queue);

		queue.remove();

		System.out.println(queue);

		System.out.println(queue.peek());

		System.out.println(queue);

		System.out.println(queue.poll());

		System.out.println(queue);
		
		System.out.println(queue.contains("Antonio"));
		
		System.out.printf("Queue Size: %d", queue.size());
	}

}
