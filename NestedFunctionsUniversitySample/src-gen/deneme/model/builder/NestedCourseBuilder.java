package deneme.model.builder;

import deneme.model.Course;
 
public class NestedCourseBuilder {
	
	public static Course Course(String courseCode, String courseName
	){
		Course o = new Course();o.setCourseCode(courseCode);o.setCourseName(courseName);return o;
	}
	public static String courseCode(String courseCode
	){
		return courseCode;
	}
	public static String courseName(String courseName
	){
		return courseName;
	}
}
