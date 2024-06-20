package generics;

public class Driver {

	public static void main(String[] args) {
		Trial<String> object1=new Trial<>("Akash A");
		Trial<Double> object2=new Trial<>(34.5);
		
		System.out.println(object1.getData()+" "+object2.getData());
		
		//Print the data using static Generic Method
		printData("Pranit Singh Kushwah");
		
		Driver obj=new Driver();
		//Print the data using non static Generic Method.
		obj.displayData("Udaipur");
		
		//Using the Bounded Generic Method to display everything only belonging to Number like Integer Float
		obj.displayNumber(123);
		obj.displayNumber(123.45);
		

	}
	//Static Generic Method
	static <E> void printData(E data)
	{
		System.out.println(data);
	}
	
	//Generic non static Method
	<E> void displayData(E data)
	{
		System.out.println(data);
	}
	//Bounded Generic Method-will work only on Number Type
	<G extends Number> void displayNumber(G data)
	{
		System.out.println(data);
	}

}
