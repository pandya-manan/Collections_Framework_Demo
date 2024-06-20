package collection_framework;

import java.util.Stack;

public class CollectionStackDemo {

	public static void main(String[] args) {
		Stack<Integer> numbers=new Stack<>();
		
		//(CREATE) Operation - pushing the elements into the stack
		numbers.push(12);
		numbers.push(13);
		numbers.push(11);
		numbers.push(9);
		
		System.out.println(numbers.toString());
		
		//POP Operation - Will pop out the top most element from the stack
		numbers.pop();
		System.out.println(numbers.toString());
		
		//Peek Operation - Will peek the topmost element but not remove it. 
		System.out.println(numbers.peek());
		System.out.println(numbers.toString());
		
		//Search for a particular element returns the index if the element is found else will not return.
		System.out.println(numbers.search(13));
		
		//Contains is used to check if an element is present or not and returns the boolean value.
		System.out.println(numbers.contains(11));
		

	}

}
