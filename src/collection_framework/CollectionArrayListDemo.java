package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayListDemo {

	public static void main(String[] args) {
		/*
		 * This program will demonstrate the CRUD operations in the Array List
		 */
		
				
		ArrayList<Integer> values=new ArrayList<>();
		values.add(12);
		values.add(123);
		values.add(45);
		values.add(121);
		
		ArrayList<Integer> valuesDuplicate=new ArrayList<>();
		valuesDuplicate.add(5);
		valuesDuplicate.add(6);
		valuesDuplicate.add(7);
		valuesDuplicate.add(53);
		
		//Create Operation
		
		System.out.println(values.toString());
		
		//Remove Operation by giving index number
		values.remove(1);
		System.out.println(values.toString());
		
		//Adding another collection to the existing collection at the end
		values.addAll(valuesDuplicate);
		System.out.println(values.toString());
		
		//Get functionality(read) to get an element present at particular index
		System.out.println(values.get(3));
		
		//Set value (CREATE) to add a value at a particular index
		values.set(4, 34);
		System.out.println(values.toString());
		
		//Printing (READ) the values using Iterator
		Iterator<Integer> ir=values.iterator();
		while(ir.hasNext())
		{
			System.out.print(ir.next()+" ");
		}
		
		System.out.println();
		//Printing(READ) the values using the For Each Loop
		for(Integer num:values)
		{
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
