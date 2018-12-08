import java.util.ArrayList;
import java.util.Collection;

public class SnakeLadder {
	public static void main(String[] args) {

	}

	public static Integer[][] doSnakeLadder(int widthHeightLadder) {
		ArrayList<Integer[]> output = new ArrayList<Integer[]>();

		for (int start = 1; start < (widthHeightLadder * widthHeightLadder); start++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			if(start % widthHeightLadder == 0){
				row.clear();
			}
		}

		return output.toArray(new Integer[output.size()][]);
	}

	public static Arraylist<?> reverseArrayList(Arraylist<?> input) {
		Collection.reverse(input);
		return input;
	}
}