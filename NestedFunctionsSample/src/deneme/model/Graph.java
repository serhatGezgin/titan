package deneme.model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private String name;
	private List<Edge> edges;
	private List<Vertex> vertices;
	
	public Graph() {
		name = new String();
		edges = new ArrayList<>();
		vertices = new ArrayList<>();
	}
	
	public Graph(String name, List<Edge> edges, 
	List<Vertex> vertices
	) {
		this.name = name;
		this.edges = edges;
		this.vertices = vertices;
	}
	
	public void addEdge(Edge edge) {
		getEdges().add(edge);
	}
	public void addVertex(Vertex vertex) {
		getVertices().add(vertex);
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	public List<Vertex> getVertices() {
		return vertices;
	}
	
	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}
}
