import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lookingforsuspects{
	public static void main(String[]args){
		System.out.println(dolookingforsuspects("mabcvabc"));
	}

	public static int dolookingforsuspects(String suspects){
		int matches = 0;
		
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher(suspects);
		while(matcher.find()) matches++;
		return matches;
	}
}