public class lookingforamean{
	public static void main(String[]args){
		System.out.println(dolookingformean(new int[]{3, 5, 7, 5, 3}));
	}

	public static int dolookingformean(int[] input){
		float output = input[0];
		
		for(int start = 1 ; start < input.length; start++){
			output+=input[start];
		}



		return Math.round(output/input.length);
	}
}