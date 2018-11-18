public class Passanger{
	private String from = "";
	private String to = "";
	private String name = "";

	public Passanger(String from, String to, String name){
		this.from = from;
		this.to = to;
		this.name = name; 
	}

	public String getName(){
		return this.name;
	}

	public String getPickUp(){
		return this.from;
	}

	public String getDestination(){
		return this.to;
	}
}