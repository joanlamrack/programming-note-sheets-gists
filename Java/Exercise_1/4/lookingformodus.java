import java.util.Arrays;
import java.util.HashMap;

public class lookingformodus{
	public static void main(String[]args){
		int input = dolookingformodus(new int[]{1,3,3});

		System.out.println(input);
	}

	public static int dolookingformodus(int[] input){
		HashMap<Integer,Integer> container= new HashMap<Integer,Integer>();
		int biggestModeNumber = 0;
		int occurences = 0;

		for(Integer number : input){
			Integer container_content = container.get(number);

			container.put(number, container_content != null ? container_content + 1 :  1);
		}

		for(Integer key : container.keySet() ){
			if(biggestModeNumber == 0 || occurences < container.get(key)){
				biggestModeNumber = key;
				occurences = container.get(key);
			}

		}

		return biggestModeNumber;
	}
}