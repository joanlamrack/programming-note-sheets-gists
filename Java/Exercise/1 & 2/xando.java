public class xando{
	public static void main(String[]args){
		System.out.println(xo("xoxoxoxo"));
	}

	public static boolean xo(String input){
		int x = 0;
		int o = 0;

		for(char element : input.toCharArray()){
			if(element== "x".charAt(0)){
				x++;
			}
			else if(element == "o".charAt(0)){
				o++;
			}
		}

		return x==o;
	}
}