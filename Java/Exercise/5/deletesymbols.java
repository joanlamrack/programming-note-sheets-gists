public class deletesymbols{
	public static void main(String[]args){
		System.out.println(dodeletesymbols("test%$4aa"));
	}

	public static String dodeletesymbols(String input){
		String output = input.replaceAll("\\W", "");
		return output;
	}
}