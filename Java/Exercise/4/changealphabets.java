import java.util.Arrays;

public class changealphabets{
	public static void main(String[]args){
		System.out.println( dochangealphabets("wow") );
	}

	public static String dochangealphabets(String input){
		char[] converted = input.toCharArray();

		for(int start = 0; start < converted.length ; start++){
			if(converted[start] == 'z'){
				converted[start] = 'a';
			}
			else{
				int numalph = converted[start];
				numalph++;
				converted[start] = (char)(numalph);
			}
		}

		return new String(converted);
	}
}