public class switchcapitalandundercase{
	public static void main(String[]args){
		System.out.println( doswitchcapitalandundercase("Hello World") );
	}

	public static String doswitchcapitalandundercase(String input){
		char[] converted = input.toCharArray();
		for(int start = 0 ; start < converted.length ; start++){
			if(  Character.isUpperCase(converted[start]) == true ){
				converted[start] = Character.toLowerCase(converted[start]);
			}
			else if( Character.isLowerCase(converted[start]) == true ){
				converted[start] = Character.toUpperCase(converted[start]);
			}
		}
		return new String(converted);
	}
}