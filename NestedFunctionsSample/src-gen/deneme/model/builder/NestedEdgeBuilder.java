package deneme.model.builder;

import deneme.model.Edge;
import deneme.model.Vertex;

public class NestedEdgeBuilder {
	
	public static Edge Edge(Vertex from, 
	Vertex to, 
	double weight
	) {
		Edge o = new Edge();
		o.setFrom(from);
		o.setTo(to);
		o.setWeight(weight);
	
		return o;
	}

	public static Vertex from(String label) {
		return new Vertex(label
		);
	}
	public static Vertex to(String label) {
		return new Vertex(label
		);
	}
	public static double weight(double value) {
		return value;
	}
}  
