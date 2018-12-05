public class LinearSearch{
	public static void main(String[]args){

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