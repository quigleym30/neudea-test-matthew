package Animals;

public class Animal {

	private String name;

	
	//default constructor
	public Animal() {
		super();
	}
	//full arguments constructor 
	public Animal(String name) {
		super();
		this.name = name;
	}
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
