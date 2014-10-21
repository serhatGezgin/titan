package deneme.model.builder;

import java.util.Arrays;
import java.util.List;

import deneme.model.Edge;
import deneme.model.Graph;

public class NestedGraphBuilder {

	public static Graph Graph(String name, List<Edge> edges) {
		Graph o = new Graph();
		o.setName(name);
		for (Edge r : edges) {
			o.addEdge(r);
			o.addVertex(r.getFrom());
			o.addVertex(r.getTo());
		}
		return o;
	}

	public static String name(String name) {
		return name;
	}

	public static List<Edge> edges(Edge... edges) {
		return Arrays.asList(edges);
	}
}
