package deneme.model;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class Graph {
	private String name;
	private Edge edges;
	private Vertex vertices;
	
	public   Graph(){
		edges = new ArrayList<>();
		vertices = new TreeSet<>();
	}
	public  void addEdge(Edge edge
	){
		getEdges().add(edge);
	}
	public  void addVertex(Vertex vertex
	){
		getVertices().add(vertex);
	}
	public  String getName(){
		return this.name;
	}
	public  void setName(String name
	){
		this.name = name;
	}
	public  List<Edge> getEdges(){
		return this.edges;
	}
	public  void setEdges(ArrayList<Edge> edges
	){
		this.edges = edges;
	}
	public  Set<Vertex> getVertices(){
		return this.vertices;
	}
	public  void setVertices(TreeSet<Vertex> vertices
	){
		this.vertices = vertices;
	}
}
