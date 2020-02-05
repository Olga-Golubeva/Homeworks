package inheritance;

public class Student extends Person{

	private int numCourse;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 12;
	
	public Student(String name, String address){
		super (name, address);
		this.numCourse = 0;
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
		
		
	}
	public void addCourseGrade(String course, int grade){
	
		courses[numCourse] = course;
		grades[numCourse] = grade;
		++numCourse;
		
	}
	
	public void printGrades(){
		for(int grade: grades)
		System.out.print("Grade: "+ grade+ " ");
		
	}
	
	public double getAverageGrade(){
		return 0.0;
		double average = 0;
		if(grades.length>0) {
			double sum = 0;
		for(int i = 0; i <MAX_COURSES; i++) {
			
				sum += grades[i];
				
		average = sum / grades.length;
		System.out.print("Grades average is: " + average);
		
		}
		}
	}
	public String toString(){
		return "Student: " + super.toString();
	}
	
}