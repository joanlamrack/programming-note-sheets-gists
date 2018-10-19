public class nearesttarget{
	public static void main(String[]args){
		System.out.println( donearesttarget(new String[]{" ", " ", "o", " ", " ", "x", " ", "x"}));
	}

	public static int donearesttarget(String[] input){
		String firstFound = null;
		int firstFoundPosition = 0;

		for(int start = 0 ; start < input.length ; start++){
			String currentfloor = input[start]; 
			if(currentfloor != " "){
				if(firstFound == null){
					firstFound = currentfloor;
					firstFoundPosition = start;
				}
				else if(firstFound != currentfloor){
					return start-firstFoundPosition;
				}
			}
		}

		return firstFoundPosition;
	}
}