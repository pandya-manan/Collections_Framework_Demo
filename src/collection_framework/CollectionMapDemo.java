package collection_framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> people=new HashMap<>();
		people.put(1, "Jaimin");
		people.put(2, "Shreyas");
		people.put(3, "Kalpesh");
		people.put(4, "Danish");
		people.put(6, "Aditi");
		people.put(7, "Riddhi");
		people.put(8, "Akash A");
		
		
		//Printing out the contents of the map
		System.out.println("People: "+people);
		
		//Printing out the content based on the key, will get the value associated with that key as output
		System.out.println(people.get(1));
		
		//To check if a value exists for the given key using containsKey
		if(people.containsKey(3))
		{
			System.out.println("The person exists with the key 3 and the name is: "+people.get(3));
		}
		if(people.containsKey(5))
		{
			System.out.println("The person exists with the key 5 and the name is: "+people.get(5));
		}
		else
		{
			System.out.println("The person does not exist with the key 5");
		}
		
		//Using the remove(key) functionality to delete the particular entry from the map
		people.remove(4);
		System.out.println(people);
		
		//To get the number of key-value pairs present in the map
		Integer numberOfPeople=people.size();
		System.out.println("The number of persons: "+numberOfPeople);
		
		//To check if the map is empty or not
		if(people.isEmpty())
		{
			System.out.println("There are no people available");
		}
		else
		{
			System.out.println("The people present are: "+people);
		}
		
		//Iterate over the key values
		System.out.println("Poeple IDs:");
		Set<Integer> ids=people.keySet();
		Iterator<Integer> itrKey=ids.iterator();
		while(itrKey.hasNext())
		{
			System.out.print(itrKey.next()+" ");
		}
		System.out.println();
		
		//Iterate over the values
		System.out.println("People names:");
		Collection<String> names=people.values();
		Iterator<String> itrName=names.iterator();
		while(itrName.hasNext())
		{
			System.out.print(itrName.next()+" ");
		}
		System.out.println();
		
		// Iterate over key-value pairs
        System.out.println("People Details:");
        Set<Map.Entry<Integer, String>> entrySet = people.entrySet();
        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        //Clearing out the entire map
        people.clear();
        System.out.println(people);
        
	}

}
