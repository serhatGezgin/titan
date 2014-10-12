package deneme.model;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class University {
	private String universityName;
	private List<Student> universityStudents;
	private Set<Course> universityCourses;
	
	public University(){
		universityStudents = new ArrayList<>();
		universityCourses = new TreeSet<>();
	}
	
	public University(String universityName
	, 
	List<Student> universityStudents
	, 
	TreeSet<Course> universityCourses
	){
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
	public Set<Course> getUniversityCourses() {
	return universityCourses;
	}
	
	public void setUniversityCourses(TreeSet<Course> universityCourses) {
		this.universityCourses = universityCourses;
	}
	
}
