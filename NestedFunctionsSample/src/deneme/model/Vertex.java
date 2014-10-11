package deneme.model;


public class Vertex {
	private String label;
	
	public Vertex() {
		label = new String();
	}
	
	public Vertex(String label) {
		this.label = label;
	}
	
	
	public String getLabel(){
		return this.label;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
}
