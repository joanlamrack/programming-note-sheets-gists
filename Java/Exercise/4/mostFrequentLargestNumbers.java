import java.util.Arrays;
import java.util.HashMap;

public class mostFrequentLargestNumbers {
	public static void main(String[] args) {
		int[] input = new int[]{2, 8, 4, 6, 8, 5, 8, 4};
		System.out.println(  Arrays.toString(sorting(input)) );
		//System.out.println( mostFrequentLargestNumber( sorting(input) ) );
		getTotal(sorting(input));

	}

	public static int[] sorting(int[] input) {
		int[] arrangedArr = input.clone();
		Arrays.sort(arrangedArr);
		return arrangedArr;
	}

	public static void getTotal(int[] input){
		HashMap<Integer,Integer> mapper = new HashMap<Integer,Integer>();

		for(int number : input){

			if(mapper.get(number) == null){
				mapper.put(number, 1);
			}
			else {
				int currentCount = mapper.get(number);
				mapper.put(number, ++currentCount);
			}
		}

		for(int key : mapper.keySet()){
			System.out.println(key + " : " + mapper.get(key));
		}

	}

	public static void mostFrequentLargestNumber(int[] input) {


	}
}