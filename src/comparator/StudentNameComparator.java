package comparator;

import java.util.Comparator;

public class StudentNameComparator {
	
	private StudentNameComparator()
	{
		throw new IllegalStateException("Utility Class");
	}
	
	public static final Comparator<Student> compareByName=new Comparator<Student>()
	{
		@Override
        public int compare(Student student1, Student student2) {
            return student1.getStudentName().compareTo(student2.getStudentName());
        }
		
	};
			

}
