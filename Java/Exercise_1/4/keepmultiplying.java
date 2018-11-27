public class keepmultiplying{
	public static void main (String[]args){
		System.out.println( dokeepmultiplying(1231) );
	}

	public static int dokeepmultiplying(int input){
		char[] numberIntoString = String.valueOf(input).toCharArray();
		int firstDigit = Character.getNumericValue(numberIntoString[0]);
		if(numberIntoString.length == 1){
			return input;
		}
		else {
			for(int start = 1 ; start < numberIntoString.length ; start++){
				firstDigit *= Character.getNumericValue(numberIntoString[start]);
			}

			return dokeepmultiplying(firstDigit);
		}
	}
}