package deneme.model;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class Graph {
	private String name;
	private List<Edge> edges;
	private Set<Vertex> vertices;
	
	public Graph(){
		edges = new ArrayList<>();
		vertices = new TreeSet<>();
	}
	
	public Graph(String name
	, 
	List<Edge> edges
	, 
	TreeSet<Vertex> vertices
	){
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
	public Set<Vertex> getVertices() {
	return vertices;
	}
	
	public void setVertices(TreeSet<Vertex> vertices) {
		this.vertices = vertices;
	}
	
}
