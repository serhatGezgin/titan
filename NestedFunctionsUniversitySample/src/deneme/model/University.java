package deneme.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
 
public class University {
	private String universityName;
	private List<Student> universityStudents;
	private Set<Course> universityCourses;
	
	public   University(){
		universityStudents = new ArrayList<>();
		universityCourses = new TreeSet<>();
	}
	public  void addStudent(Student student
	){
		getUniversityStudents().add(student);
	}
	public  void addCourse(Course course
	){
		getUniversityCourses().add(course);
	}
	public  String getUniversityName(){
		return this.universityName;
	}
	public  void setUniversityName(String universityName
	){
		this.universityName = universityName;
	}
	public  List<Student> getUniversityStudents(){
		return this.universityStudents;
	}
	public  void setUniversityStudents(ArrayList<Student> universityStudents
	){
		this.universityStudents = universityStudents;
	}
	public  Set<Course> getUniversityCourses(){
		return this.universityCourses;
	}
	public  void setUniversityCourses(TreeSet<Course> universityCourses
	){
		this.universityCourses = universityCourses;
	}
}
