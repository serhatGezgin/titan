package deneme.model.builder;

import deneme.model.Edge;
import deneme.model.builder.NestedVertexBuilder;
import deneme.model.Vertex;
 
public class NestedEdgeBuilder {
	
	public static Edge Edge(Vertex from, Vertex to, Double weight
	){
		Edge o = new Edge();o.setFrom(from);o.setTo(to);o.setWeight(weight);return o;
	}
	public static Vertex from(String label
	){
		return NestedVertexBuilder.Vertex(label
		);
	}
	public static Vertex to(String label
	){
		return NestedVertexBuilder.Vertex(label
		);
	}
	public static Double weight(Double weight
	){
		return weight;
	}
}
