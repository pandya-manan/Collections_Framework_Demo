package comparator;

public class Student implements Comparable<Student>{
	
	private Integer rollNumber;
	
	private String studentName;
	
	private String studentAddress;
	
	private Float marks;

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

	public Student() {
		super();
		
	}

	public Student(Integer rollNumber, String studentName, String studentAddress, Float marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Student otherStudent)
	{
		return this.rollNumber-otherStudent.rollNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + ", marks=" + marks + "]";
	}
	

}
