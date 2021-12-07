package mc.java.kod150;

import java.util.Stack;

public class LIFO {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Arslan");
		stack.push("Tilki");
		String s1 = stack.peek();
		String s2 = stack.pop();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(stack.search("Arslan"));
	}
	
}
