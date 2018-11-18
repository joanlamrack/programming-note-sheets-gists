public class deepsum{
	public static void main(String[]args){
		int[][][] input = {
			{
				{1, 2, 3},
				{1, 2, 3}
			},
			{
				{1, 2, 3},
				{1, 2},
				{1}
			}
		};

		System.out.println(dosumdeeparray(input));
	}

	public static int dosumdeeparray(int[][][] input){
		int output = 0;

		for(int[][] rowbig : input){
			for(int[] rowsmol : rowbig){
				for(int number : rowsmol){
					output+=number;
				}
			}
		}

		return output;
	} 
}