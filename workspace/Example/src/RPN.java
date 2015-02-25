<<<<<<< HEAD
import java.io.StringReader;
import java.util.Scanner;
import java.util.Stack;


public class RPN {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	Stack<Integer> evaluate(String expression) {
		StringReader sr = new StringReader(expression);
		Scanner scanner = new Scanner(sr);
		while (scanner.hasNext()) {
			String token = scanner.next();
			
			// Check for +, -, /, *
			if (token.equals("+")) {
				int a = stack.peek();
				stack.pop();
				int b = stack.peek();
				stack.pop();
				
				stack.push(a+b);
			}
			else if(token.equals("-")){
				int a = stack.peek();
				stack.pop();
				int b = stack.peek();
				stack.pop();
				
				stack.push(a-b);
			}
			else if(token.equals("*")){
				int a = stack.peek();
				stack.pop();
				int b = stack.peek();
				stack.pop();
				
				stack.push(a*b);
			}
			else if(token.equals("/")){
				int a = stack.peek();
				stack.pop();
				int b = stack.peek();
				stack.pop();
				
				stack.push(a/b);
			}
			else{
				stack.push(Integer.parseInt(token));
			}
			// catch all case
			// put the integer on the stack

		}
		
		return stack;
	}
	void clear() {
		stack.clear();
	}
}
=======
import java.io.StringReader;
import java.util.Scanner;
import java.util.Stack;

public class RPN {
	Stack<Integer> stack = new Stack<Integer>();
	
	Stack<Integer> evaluate(String expression) {
		StringReader sr = new StringReader(expression);
		Scanner scanner = new Scanner(sr);
		while (scanner.hasNext()) {
			String token = scanner.next();
			// Check for +, -, /, *
			if (token.equals("+")) {
				// do the appropriate thing
				// pop 2 items off stack, and place result
				// onto stack
			}
			// catch all case
			// put the integer on the stack
			Integer.parseInt(token);
		}
		
		return stack;
	}
	void clear() {
		stack.clear();
	}
}
>>>>>>> 0ad2a94e7b7143214fe6de535ce7d216566eaabf
