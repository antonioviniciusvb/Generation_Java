package lesson_06;

import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		stack.push("Aline");
		stack.push("Pedro");
		stack.push("Vinicius");
		stack.push("Luiza");
		stack.push("Maria");
		stack.push("Antonio");

		System.out.println(stack);

		stack.pop();

		System.out.println(stack);

		System.out.println(stack.peek());

		System.out.println(stack.contains("Antonio"));

		System.out.printf("Queue Size: %d", stack.size());
	}

}
