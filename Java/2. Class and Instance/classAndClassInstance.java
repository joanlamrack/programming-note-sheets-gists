public class classAndClassInstance {
	String stringContainer;
	String name;

	public classAndClassInstance(String name) {
		System.out.println(name);
		this.name = name;
	}

	public void setStringContainer(String input) {
		stringContainer = input;
	}

	public String getString() {
		return stringContainer;
	}

	public static void main(String[] args) {
		classAndClassInstance newInstance = new classAndClassInstance("hehe");

		newInstance.setStringContainer("Haha");

		System.out.println("the name is " + newInstance.name + "\n" + "String in the container is: "
				+ newInstance.stringContainer);
	}
}

/*
 * Class and instance.
 * 
 * public class <ClassName>{ //constructor public <ClassName>(<Any Parameter>){
 * 
 * }
 * 
 * public <return type> <methodName> (<Method Params>){
 * 
 * } }
 */