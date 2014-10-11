package deneme.model;


public class Edge {
	private Vertex from;
	private Vertex to;
	private double weight;
	
	public Edge() {
		from = new Vertex();
		to = new Vertex();
	}
	
	public Edge(Vertex from, 
	Vertex to, 
	double weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	
	public Vertex getFrom() {
		return this.from;
	}
	
	public void setFrom(Vertex from) {
		this.from = from;
	}
	public Vertex getTo() {
		return this.to;
	}
	
	public void setTo(Vertex to) {
		this.to = to;
	}
	public double getWeight(){
		return this.weight;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
}
