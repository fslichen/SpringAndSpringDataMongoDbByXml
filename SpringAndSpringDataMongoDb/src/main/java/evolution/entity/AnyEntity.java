package evolution.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "any_entity")
public class AnyEntity {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AnyEntity1 [name=" + name + "]";
	}
	
}
