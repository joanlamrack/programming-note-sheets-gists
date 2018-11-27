import java.util.ArrayList;
import java.util.Arrays;

public class groupingnumber{
	public static void main(String[]args){
		System.out.println(Arrays.deepToString( dogroupnumber(new int[] {2, 4, 6}) ));
	}

	public static Integer[][] dogroupnumber(int[] input){
		Integer[][] output = new Integer[3][];
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		ArrayList<Integer> tripletNumbers = new ArrayList<Integer>();
		
		for(int number : input){
			if(number%3 == 0){
				tripletNumbers.add(number);
			}
			else if(number%2 == 0){
				evenNumbers.add(number);
			}
			else if(number%2 == 1){
				oddNumbers.add(number);
			}
		}

		output[0] = evenNumbers.toArray(new Integer[evenNumbers.size()]);
		output[1] = oddNumbers.toArray(new Integer[oddNumbers.size()]);
		output[2] = tripletNumbers.toArray(new Integer[tripletNumbers.size()]);

		return output;
	}
}