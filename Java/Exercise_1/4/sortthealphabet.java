import java.util.Arrays;

public class sortthealphabet{
	public static void main (String[]args){
		System.out.println( dosortalphabet("hello") );
	}

	public static String dosortalphabet(String input){
		char[] sortMaterial = input.toCharArray();
		Arrays.sort(sortMaterial);
		return new String(sortMaterial);
	}
}