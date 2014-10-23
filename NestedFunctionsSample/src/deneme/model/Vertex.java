package deneme.model;


public class Vertex implements Comparable<Vertex>
{
	private String label;
	
	public   Vertex(){
	}
	public  String getLabel(){
		return this.label;
	}
	public  void setLabel(String label
	){
		this.label = label;
	}
	@Override
	public  int compareTo(Vertex o
	){
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		
		int comparison;
		
		if (this == o) return EQUAL;			
		//Strings follow this form
		comparison = this.getLabel().compareTo(o.getLabel());
		if (comparison != EQUAL) return comparison;
						
		return EQUAL;
	}
}
