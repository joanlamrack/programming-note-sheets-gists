public class checkab{
	public static void main(String[]args){
		System.out.println( docheckab("lane borrowed") );
	}

	public static boolean docheckab(String input){
		boolean output = false;
		int space = 4;
		char[] converted = input.toCharArray();

		for(int start = 0; start < converted.length-(space-1) ; start++){
			if(converted[start] == 'a' && converted[start+space] == 'b'){
				return true;
			}
			else if(converted[start] == 'b' && converted[start+space] == 'a'){
				return true;
			}
		}

		return output;
	}
}