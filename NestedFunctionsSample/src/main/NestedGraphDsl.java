package main;

//Update this according to the package name of your builder
import static deneme.model.builder.NestedEdgeBuilder.Edge;
import static deneme.model.builder.NestedEdgeBuilder.from;
import static deneme.model.builder.NestedEdgeBuilder.to;
import static deneme.model.builder.NestedEdgeBuilder.weight;
import static deneme.model.builder.NestedGraphBuilder.Graph;
import static deneme.model.builder.NestedGraphBuilder.edges;
import static deneme.model.builder.NestedGraphBuilder.name;

import java.util.List;

import deneme.model.Edge;
import deneme.model.Graph;
 
public class NestedGraphDsl {
	public static void main(String[] args) {
		Graph graph = Graph(name("AA"),
				edges( 
					Edge(from("a"), to("b"), weight(23.4)),
					Edge(from("b"), to("c"), weight(26.4)),
					Edge(from("c"), to("d"), weight(16.4))
				)
		);
		   
		System.out.println(graph.getName());
		List<Edge> edges = graph.getEdges();
		for (Edge edge : edges) {
			System.out.println(edge.getWeight());
		}
	}
}
