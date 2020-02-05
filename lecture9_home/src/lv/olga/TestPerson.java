package lv.olga;

import inheritance.Student;
import inheritance.Teacher;

public class TestPerson {

	
	public static void main(String[] args) {
		
	
//		String[] strArr = new String[12];
//		strArr[0] = "Sport";
//		strArr[1] = "Math";
//		
//		System.out.println(strArr[0]+ ", " +strArr[1]);
		
		
	Teacher teacher1 = new Teacher("Toms", "Riga");
	System.out.println(teacher1.toString());
//	teacher1.addCourse("Sport");
//	teacher1.addCourse("Math");
//	teacher1.addCourse("English");
//	teacher1.addCourse("History");
	String[] courses = {"Sport", "Math", "English", "History"};
	
//	for-each loops
	for(String course: courses){
		teacher1.addCourse(course);
		System.out.println();
	}
	System.out.println("*********************************************");
	
	Student student1 = new Student("Ivars", "Ogre");
	System.out.println(student1.toString());
	
	student1.addCourseGrade("Math", 7);
	student1.addCourseGrade("Geo", 6);
	student1.addCourseGrade("Biology", 8);
	student1.addCourseGrade("English", 8);
	student1.printGrades();
	student1.getAverageGrade();
	
	}


}