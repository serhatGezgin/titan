package deneme.model;


public class Course {
	private String courseCode;
	private String courseName;
	
	public Course() {
	}
	
	public Course(String courseCode, String courseName) {
		this.courseCode = courseCode;
		this.courseName = courseName;
	}
	
	
	public String getCourseCode(){
		return this.courseCode;
	}
	
	public void setCourseCode(String courseCode){
		this.courseCode = courseCode;
	}
	public String getCourseName(){
		return this.courseName;
	}
	
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
}
