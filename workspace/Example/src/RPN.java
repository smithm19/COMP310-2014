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
