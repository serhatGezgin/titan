package deneme.model;

 
public class Edge {
	private Vertex from;
	private Vertex to;
	private Double weight;
	
	public   Edge(){
	}
	public  Double getWeight(){
		return this.weight;
	}
	public  void setWeight(Double weight
	){
		this.weight = weight;
	}
	public  Vertex getFrom(){
		return this.from;
	}
	public  void setFrom(Vertex from
	){
		this.from = from;
	}
	public  Vertex getTo(){
		return this.to;
	}
	public  void setTo(Vertex to
	){
		this.to = to;
	}
}
