import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckVowel{
	public static void main(String[]args){
		System.out.println( doCheckVowels("a") );
	}

	public static boolean doCheckVowels(String input){
		return Pattern.matches("[aiueo]+", input);
	}
}