import java.util.Arrays;

public class aritmeticqueue{
	public static void main(String[]args){
		System.out.println(doaritmetic(new int[]{2, 4, 6, 12, 24}));
	}

	public static boolean doaritmetic(int[] input){
		int space = input[1]-input[0];
		for(int start = 1 ; start < input.length-1; start++){
			if(input[start+1]-input[start] != space){
				return false;
			}
		}

		return true;
	} 
}