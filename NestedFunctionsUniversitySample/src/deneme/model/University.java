package deneme.model;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String universityName;
	private List<Student> universityStudents;
	private List<Course> universityCourses;
	
	public University() {
		universityStudents = new ArrayList<>();
		universityCourses = new ArrayList<>();
	}
	
	public University(String universityName, List<Student> universityStudents, 
	List<Course> universityCourses
	) {
		this.universityName = universityName;
		this.universityStudents = universityStudents;
		this.universityCourses = universityCourses;
	}
	
	public void addStudent(Student student) {
		getUniversityStudents().add(student);
	}
	public void addCourse(Course course) {
		getUniversityCourses().add(course);
	}
	
	public String getUniversityName(){
		return this.universityName;
	}
	
	public void setUniversityName(String universityName){
		this.universityName = universityName;
	}
	public List<Student> getUniversityStudents() {
		return universityStudents;
	}
	
	public void setUniversityStudents(List<Student> universityStudents) {
		this.universityStudents = universityStudents;
	}
	public List<Course> getUniversityCourses() {
		return universityCourses;
	}
	
	public void setUniversityCourses(List<Course> universityCourses) {
		this.universityCourses = universityCourses;
	}
}
