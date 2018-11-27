public class passwordGenerator{
	public static void main(String[]args){
		String oi = "Sergei Dragunov";

		System.out.println( dopasswordGenerator(oi) );
	}

	public static String changeVocals(String input){
		char[] compareSet = new char[]{'a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O'};
		char[] compareSet2 = new char[]{'b', 'j', 'v', 'f', 'p', 'B', 'J', 'V', 'F', 'P'};
		char[] output = input.toCharArray();
		
		for(int start = 0 ; start < output.length ; start++){
			for(int compareIndex = 0 ; compareIndex < compareSet.length ; compareIndex++){
				if(output[start] == compareSet[compareIndex]){
					output[start] = compareSet2[compareIndex];
				}
			}
		}

		return new String(output);
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
		String changedVocal = changeVocals(input);
		String reversed = reverseWord(changedVocal);
		String invertUpperLowerCase = setLowerUpperCase(reversed);
		String spacesRemoved = removeSpaces(invertUpperLowerCase);
		return spacesRemoved;
	}
}