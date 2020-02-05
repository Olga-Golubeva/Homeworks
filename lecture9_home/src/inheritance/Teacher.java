package inheritance;

public class Teacher extends Person{
	
	private int numCourse;
	private String[] courses; 
	private static final int MAX_COURSES = 4;
	
	
	public Teacher(String name, String address){
	super(name, address);
	this.numCourse = 0;
	this.courses = new String[MAX_COURSES];
	
	}
	
	public void addCourse(String course){
		courses[numCourse] = course;
		++numCourse; //katru reizi izsaucot metodi, pievieno kursu
//		System.out.println(Arrays.toString(this.courses));
	}
	
	public boolean addCourses(String course){
		return true;
		
	}
	
	public boolean removeCourses(String course){
		return true;
	}
	
	public String toString(){
		return "Teacher: " + super.toString();
		
	}
	
}
