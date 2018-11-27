import java.util.Arrays;

public class uniquetimes{
	public static void main(String[]args){
		System.out.println(Arrays.toString(douniquetimes(new int[] {2, 4, 6})));
	}

	public static int[] douniquetimes(int[] input){
		int[] output = input.clone();

		for(int exception = 0; exception < output.length ; exception++){
			int subtitute_placement = 0;
			for(int others = 0 ; others < output.length ; others++){
				if(exception != others){
					if(subtitute_placement == 0){
						subtitute_placement = input[others];
					}
					else{
						subtitute_placement*= input[others];
					}
				}
			}
			output[exception] = subtitute_placement;
		}
		return output;
	}
}