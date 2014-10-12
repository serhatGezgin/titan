package deneme.model;


public class Course implements Comparable<Course> {
	private String courseCode;
	private String courseName;
	
	public Course(){
	}
	
	public Course(String courseCode
	, 
	String courseName
	){
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
	
	@Override
	public int compareTo(Course o) {
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		
		int comparison;
		
		if (this == o) return EQUAL;			
		//Strings follow this form
		comparison = this.getCourseCode().compareTo(o.getCourseCode());
		if (comparison != EQUAL) return comparison;
		//Strings follow this form
		comparison = this.getCourseName().compareTo(o.getCourseName());
		if (comparison != EQUAL) return comparison;
		
		return EQUAL;
	}		
}
