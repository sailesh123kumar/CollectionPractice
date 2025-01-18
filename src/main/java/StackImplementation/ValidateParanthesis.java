package StackImplementation;

import java.util.Stack;

public class ValidateParanthesis {

	public static void main(String[] args) {

		String parenthesis = "(()())";

		boolean flag = isBalanced(parenthesis);
		
		if(flag) {
			System.out.println("Paranthesis is balanced");
		}

		else
		{
			System.out.println("Paranthesis is Not balanced");
		}
		
	}

	
	    public static boolean isBalanced(String expression) {
	        // Create a stack to keep track of opening parentheses
	        Stack<Character> stack = new Stack<>();

	        // Iterate through each character in the expression using a for-each loop
	        for (char ch : expression.toCharArray()) {
	            // If the character is an opening parenthesis, push it to the stack
	            if (ch == '(') {
	                stack.push(ch);
	            }
	            // If the character is a closing parenthesis
	            else if (ch == ')') {
	                // Check if the stack is empty before popping
	                if (stack.isEmpty()) {
	                    return false; // Unmatched closing parenthesis
	                }
	                stack.pop(); // Safely remove the matched opening parenthesis
	            }
	        }

	        // If the stack is empty, all parentheses are balanced; otherwise, they are not.
	        return stack.isEmpty();
	    }
}
   