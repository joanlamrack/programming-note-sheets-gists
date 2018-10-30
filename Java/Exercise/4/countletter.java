import java.util.Arrays;
import java.util.HashMap;

public class countletter{
	public static void main(String[]args){
		String input = "Today, is the greatest day ever";
		System.out.println(dobiggestcountletter(input));
	}

	public static String dobiggestcountletter(String input){
		
		String[] splittedstring = input.split("\\W+");
		String longestWord = "";
		for(String word : splittedstring){
			if(longestWord.length() < word.length()){
				longestWord = word;
			}
		}

		return longestWord;
	}
}