public class passwordGenerator{
	public static void main(String[]args){
		String oi = "hey heC";

		System.out.println(setLowerUpperCase(oi));

	}

	public static String changeVocals(String input){
		return "";
	}

	public static String reverseWord(String input){
		String reversedWord = new StringBuilder(input).reverse().toString();
		return reversedWord;
	}

	public static String setLowerUpperCase(String input){
		char[] output = input.toCharArray();

		for(int start = 0 ; start < output.length; start++){
			if(Character.isLowerCase(output[start])){
				output[start] = Character.toUpperCase(output[start]);
			}
			else if(Character.isUpperCase(output[start])){
				output[start] = Character.toLowerCase(output[start]);
			}
		}

		return new String(output);
	}

	public static String removeSpaces(String input){
		return input.replaceAll("\\s", "");
	}

	public static String dopasswordGenerator(String input){
		return "";
	}
}