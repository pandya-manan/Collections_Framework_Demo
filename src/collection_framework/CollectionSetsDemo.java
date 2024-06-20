package collection_framework;

import java.util.HashSet;
import java.util.Set;

/*
 * This program demonstrates the working of Sets in Collection Framework. It is similar to the Mathematical sets.
 */

public class CollectionSetsDemo {

	public static void main(String[] args) {
		Set<Integer> numbers=new HashSet<Integer>();
		//Duplicate elements won't be stored in sets,only unique elements are supported,CREATE Operation
		numbers.add(12);
		numbers.add(12);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		
		System.out.println(numbers.toString());
		
		//DELETE OPERATION USING remove(i)
		numbers.remove(12);
		System.out.println(numbers.toString());
		
		//Elements are not stored in continous location unlike array list or list
		System.out.println(numbers);
		
		//Printing out the size of the set
		System.out.println(numbers.size());
		

	}

}
