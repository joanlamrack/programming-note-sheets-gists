public class lookingbiggestcommonfactor{
	public static void main(String[]args){
		System.out.println(dobiggestcommonfactor(50, 40) );
	}

	public static int dobiggestcommonfactor(int firstNumber, int secondNumber){
		int output = 1;

		for(int start = 2; (start <= firstNumber) && (start <= secondNumber) ; start++){
			if((firstNumber%start == 0) && (secondNumber%start == 0)){
				output = start;
			}
		}

		return output;
	}
}