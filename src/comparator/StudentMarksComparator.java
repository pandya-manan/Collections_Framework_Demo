package comparator;

import java.util.Comparator;

public class StudentMarksComparator {
	
	private StudentMarksComparator()
	{
		throw new IllegalStateException("Utility Class");
	}
	
	public static final Comparator<Student> compareByMarks=new Comparator<Student>()
	{
		@Override
        public int compare(Student student1, Student student2) {
            return Float.compare(student2.getMarks(), student1.getMarks());
        }
		
	};
			

}
