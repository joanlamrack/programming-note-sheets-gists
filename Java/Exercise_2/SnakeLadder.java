import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SnakeLadder {
	public static void main(String[] args) {
		Integer[][] generatedSnakeLadder = doSnakeLadder(10);
		PrintArray(generatedSnakeLadder);
	}

	public static Integer[][] doSnakeLadder(int widthHeightLadder) {
		ArrayList<Integer[]> output = new ArrayList<Integer[]>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for (int start = 1; start <= (widthHeightLadder * widthHeightLadder); start++) {

			row.add(start);
			if (start % widthHeightLadder == 0) {

				if(output.size()%2 == 1){
					reverseArrayList(row);
				}
				output.add(row.toArray(new Integer[row.size()]));
				row.clear();
			}
		}

		reverseArrayList(output);

		return output.toArray(new Integer[output.size()][]);
	}

	public static ArrayList<?> reverseArrayList(ArrayList<?> input) {
		Collections.reverse(input);
		return input;
	}

	public static void PrintArray(Integer[][] inputToPrint) {
		for (Integer[] row : inputToPrint) {
			System.out.println(Arrays.toString(row));
		}
	}
}