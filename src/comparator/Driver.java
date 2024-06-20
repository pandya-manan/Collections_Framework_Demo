package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Student>students=new ArrayList<Student>();
		students.add(new Student(1,"Aditi","Kagadassapura,Bangalore",450.0f));
		students.add(new Student(2,"Riddhi","Thippasandra,Bangalore",495.0f));
		students.add(new Student(5,"Shreyas","KR Puram,Bangalore",545f));
		students.add(new Student(6,"Sharath","Viman Nagar,Bangalore",350f));
		students.add(new Student(3,"Akash Agarwal","Kamlanagar,Agra",470f));
		students.add(new Student(4,"Palash Khare","Chuna Bhati,Bhopal",520f));
		students.add(new Student(8,"Devarshi Pandey","Sola,Ahmedabad",475.0f));
		students.add(new Student(10,"DJ Pawar","Vibhutipura,Hubbali",465f));
		students.add(new Student(9,"Chirag Damania","Kalali,Vadodara",530f));
		
		//Sort by roll number using default comparable
		Collections.sort(students);
		System.out.println("Sorted according to roll number:");
		for(Student student:students)
		{
			System.out.println(student.getRollNumber()+" "+student.getStudentName()+" "+student.getStudentAddress()+" "+student.getMarks());
		}
		System.out.println();
		
		//Sort by name using custom comparator
		Collections.sort(students, StudentNameComparator.compareByName);
		System.out.println("Sorted according to name of the students:");
		for(Student student:students)
		{
			System.out.println(student.getRollNumber()+" "+student.getStudentName()+" "+student.getStudentAddress()+" "+student.getMarks());
		}
		System.out.println();
		
		//Sort by marks using custom comparator
		Collections.sort(students, StudentMarksComparator.compareByMarks);
		System.out.println("Sorted according to marks of the students:");
		for(Student student:students)
		{
			System.out.println(student.getRollNumber()+" "+student.getStudentName()+" "+student.getStudentAddress()+" "+student.getMarks());
		}
		System.out.println();

	}

}
