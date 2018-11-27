public class palidrome{
	public static void main(String[]args){
		System.out.println(dopalidrome("katqk"));
	}

	public static boolean dopalidrome(String kata){
		char[] tobeCompared = kata.toCharArray();
		for(int start = 0, end = kata.length()-1; start < end ; start++, end--){
			if(tobeCompared[start]!=tobeCompared[end]){
				return false;
			}

		}

		return true;
	}
}