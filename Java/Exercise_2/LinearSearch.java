public class LinearSearch{
	public static void main(String[]args){
		int[] input = new int[] {1,6,7,10,9};
		System.out.println( doLinearSearch(input, 10) );
	}

	public static boolean doLinearSearch(int[] input, int toSearch){

		for(int oneElement : input){
			if(oneElement == toSearch){
				return true;
			}
		}
		return false;
	}
}