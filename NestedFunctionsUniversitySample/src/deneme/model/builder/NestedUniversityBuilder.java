package deneme.model.builder;

import deneme.model.University;
import deneme.model.Student;
import deneme.model.Course;
import java.util.Arrays;import java.util.List;

public class NestedUniversityBuilder {
	
	public static University University(String universityName, 
	List<Student> universityStudents
	) {
		University o = new University();
		o.setUniversityName(universityName);
		for (Student r : universityStudents) {
			o.addStudent(r);
			for(Course c : r.getStudentCourses()){
				o.addCourse(c);
			}
		}
	
		return o;
	}

	public static String universityName(String value) {
		return value;
	}
	public static List<Student> universityStudents(Student...universityStudents) {
		return Arrays.asList(universityStudents);
	}
}  
