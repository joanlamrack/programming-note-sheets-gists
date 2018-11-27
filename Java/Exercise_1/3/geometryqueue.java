import java.util.Arrays;

public class geometryqueue{
	public static void main(String[]args){
		System.out.println(dogeometry(new int[]{2, 4, 6, 8}));
	}

	public static boolean dogeometry(int[] input){
		int space = input[1]/input[0];
		for(int start = 1 ; start < input.length-1; start++){
			if(input[start+1]/input[start] != space){
				return false;
			}
		}

		return true;
	} 
}