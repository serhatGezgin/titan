package main;

//Update this according to the package name of your builder
import static deneme.model.builder.NestedUniversityBuilder.University;
import static deneme.model.builder.NestedUniversityBuilder.universityName;
import static deneme.model.builder.NestedUniversityBuilder.universityStudents;
import static deneme.model.builder.NestedStudentBuilder.Student;
import static deneme.model.builder.NestedStudentBuilder.studentCode;
import static deneme.model.builder.NestedStudentBuilder.studentName;
import static deneme.model.builder.NestedStudentBuilder.studentCourses;
import static deneme.model.builder.NestedCourseBuilder.Course;
import static deneme.model.builder.NestedCourseBuilder.courseCode;
import static deneme.model.builder.NestedCourseBuilder.courseName;
import deneme.model.Course;
import deneme.model.University;
  

public class NestedGraphDsl {
	public static void main(String[] args) {
		University university = University(universityName("Ege Universitesi"),
			universityStudents(
				Student(studentCode("S243"), studentName("Serhat"),
					studentCourses(
						Course(
							courseCode("C345"), courseName("Math1")
						)	
					)
				),
				Student(studentCode("S243"), studentName("Serhat"),
						studentCourses(
							Course(
								courseCode("C345"), courseName("Math1")
							)	
						)
				)
			)
		);
		
		for(Course c : university.getUniversityCourses()){
			System.out.println(c.getCourseCode());
		}
	}
}
