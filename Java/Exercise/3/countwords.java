public class countwords {
	public static void main(String[] args) {
		System.out.println(docountwords("hey count me"));
	}

	public static int docountwords(String input) {
		return input.split(" ").length;
	}
}