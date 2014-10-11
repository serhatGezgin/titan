package deneme.model.builder;

import deneme.model.Vertex;

public class NestedVertexBuilder {
	
	public static Vertex Vertex(String label
	) {
		Vertex o = new Vertex();
		o.setLabel(label);
	
		return o;
	}

	public static String label(String value) {
		return value;
	}
}  
