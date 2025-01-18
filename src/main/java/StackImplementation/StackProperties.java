package StackImplementation;

import java.util.Stack;

public class StackProperties {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Java");
		stack.push("Selenium");
		stack.push("Automation");
		stack.push("Testing");
		stack.push("SDET");
		
		System.out.println(stack);
		
		
		String peekelement = stack.peek();
		System.out.println(peekelement);
		
		String popelement = stack.pop();
		
		stack.addFirst("RestAssure API Automation");
		stack.addLast("DB Testing");
		System.out.println(stack);

	}

}
