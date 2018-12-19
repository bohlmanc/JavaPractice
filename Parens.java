import java.util.Stack;

public class Parens {

	String testString;

	public boolean HasEqualParens() {

		int openParens = 0;
		for(int i = 0;i<testString.length();i++) {
			System.out.println(testString.substring(i,i+1));
			if(testString.substring(i,i+1).equals("(")) {
				System.out.println("Found open.");
				openParens++;
			}
			if(testString.substring(i,i+1).equals(")")) {
				System.out.println("Found closed.");
				openParens--;
			}
		}
		return openParens == 0;
	}

	public boolean HasEqualParensStack() {

		Stack stack = new Stack<>();
		char c;

		for(int i = 0;i<testString.length();i++) {
			c = testString.charAt(i);
			if(c == '(') {
				System.out.println("Pushing open.");
				stack.push(c); 
			}
			if(c == ')') {
				System.out.println("Trying to pop closed");
				if(stack.empty()) {
					System.out.println("Closed found before open");
					return false;
				}
				stack.pop();
			}
		}
		return stack.empty();
	}


	public static void main(String[] args) {
		
		String testString = args[0];
		Parens p = new Parens(testString);

		System.out.println(p.HasEqualParensStack());

	}

	public Parens(String s) {
		testString = s;
	}

}