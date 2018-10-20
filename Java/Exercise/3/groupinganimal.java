import java.util.ArrayList;
import java.util.Arrays;

public class groupinganimal{
	public static void main(String[]args){
		String[] sortthisout = new String[] {"ayam", "ox", "kuda", "anjing"};
		String[][] result = dogroupinganimal(sortthisout);
		System.out.println(Arrays.deepToString(result));
	}

	public static String[][] dogroupinganimal(String[] input){
		ArrayList<String[]> output = new ArrayList<String[]>();
		String[] copyofinput = input.clone();
		Arrays.sort(copyofinput);
		ArrayList<String> temp = new ArrayList<String>();

		for(int start = 0 ; start < copyofinput.length ; start++){
			temp.add(copyofinput[start]);
			if( start == copyofinput.length-1 || copyofinput[start+1].charAt(0) != copyofinput[start].charAt(0) ){
				output.add(temp.toArray(new String[temp.size()]));
				temp.clear();
			}
		}


	
		return output.toArray(new String[output.size()][]);
	}

}