package Animals;

public class Whale extends Animal{

	private String mainOcean;
	private int weight,maxSpeed,length;
	
	//default constructor
	public Whale() {
		super();
	}
	//full arguments constructor 
	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}
	
	//getter and setters
	public String getMainOcean() {
		return mainOcean;
	}
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
