import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println( Arrays.deepToString( doSnakeLadder(10) ) );
	}

	public static Integer[][] doSnakeLadder(int widthHeightLadder) {
		ArrayList<Integer[]> output = new ArrayList<Integer[]>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for (int start = 1; start < (widthHeightLadder * widthHeightLadder); start++) {
			
			row.add(start);
			if(start % widthHeightLadder == 0){
				output.add( row.toArray( new Integer[row.size()]) );
				row.clear();
			}
		}

		return output.toArray(new Integer[output.size()][]);
	}

	public static ArrayList<?> reverseArrayList(ArrayList<?> input) {
		Collections.reverse(input);
		return input;
	}

	public static void PrintArray(Integer[][] inputToPrint){
		for(Integer[] row : inputToPrint){
			System.out.println( Arrays.toString( row ));
		}
	}
}