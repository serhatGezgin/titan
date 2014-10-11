package deneme.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String studentCode;
	private String studentName;
	private List<Course> studentCourses;
	
	public Student() {
		studentCourses = new ArrayList<>();
	}
	
	public Student(String studentCode, String studentName, List<Course> studentCourses
	) {
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.studentCourses = studentCourses;
	}
	
	public void addCourse(Course course) {
		getStudentCourses().add(course);
	}
	
	public String getStudentCode(){
		return this.studentCode;
	}
	
	public void setStudentCode(String studentCode){
		this.studentCode = studentCode;
	}
	public String getStudentName(){
		return this.studentName;
	}
	
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	public List<Course> getStudentCourses() {
		return studentCourses;
	}
	
	public void setStudentCourses(List<Course> studentCourses) {
		this.studentCourses = studentCourses;
	}
}
