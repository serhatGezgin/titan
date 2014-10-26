package deneme.model.builder;

import java.util.Arrays;
import java.util.List;
import deneme.model.Student;
import deneme.model.Course;
 
public class NestedStudentBuilder {
	
	public static Student Student(String studentCode, String studentName, List<Course> studentCourses
	){
		Student o = new Student();o.setStudentCode(studentCode);o.setStudentName(studentName);for (Course r : studentCourses) {
			o.addCourse(r);
		}
		return o;
	}
	public static String studentCode(String studentCode
	){
		return studentCode;
	}
	public static String studentName(String studentName
	){
		return studentName;
	}
	public static List<Course> studentCourses(Course... studentCourses
	){
		return Arrays.asList(studentCourses);
	}
}
