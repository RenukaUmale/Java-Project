package assignment3;
import java.io.*;
import java.util.*;
 class StackDemo {
	 
	class StackDemo {
	   
	      // Main Method
	    public static void main(String[] args)
	    {
	 
	        // Default initialization of Stack
	        Stack stack1 = new Stack();
	 
	        // Initialization of Stack
	        // using Generics
	        Stack<String> stack2 = new Stack<String>();
	 
	        // pushing the elements
	        stack1.push("India");
	        stack1.push("USA");
	        stack1.push("Canada");
	        stack1.push("Hongkong");
	        stack1.push("UK");
	        stack1.push("China");
	        stack1.push("Russia");
	        stack1.push("Ukrane");
	        stack1.push("Pakisthan");
	        stack1.push("Bangladesh");
	        
	 
	        
	 
	          // Printing the Stack Elements
	        System.out.println(stack1);
	        System.out.println("Popped element: "
	                + stack1.pop());
	        System.out.println("Popped element: "
	                + stack1.pop());
	        System.out.println("Popped element: "
	                + stack1.pop());
	        stack1.push("India");
	        stack1.push("USA");
	        stack1.push("Canada");
	        stack1.push("Hongkong");
	        stack1.push("UK");
	        stack1.push("China");
	        stack1.push("Russia");
	        stack1.push("Ukrane");
	        stack1.push("Pakisthan");
	        stack1.push("Bangladesh");
	        System.out.println(stack2);
	        System.out.println("The element at the top of the"
	                + " stack is: " + stack2.peek());
	        System.out.println("Popped element: "
	                + stack2.pop());
	        System.out.println("Popped element: "
	                + stack2.pop());
	        System.out.println("Popped element: "
	                + stack2.pop());
	        System.out.println("Popped element: "
	                + stack2.pop());
	        System.out.println("Does the stack contains India?"
	                + stack1.search("india"));
	        System.out.println("Does the stack contains Canada?"
	        		+ stack1.search("Canada")); 
	    }
	}
}
