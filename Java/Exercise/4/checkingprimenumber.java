public class checkingprimenumber{
	public static void main(String[]args){
		System.out.println(docheckingprimenumber(6));
	}

	public static boolean docheckingprimenumber(int input){

		for(int start = 2 ; start < input-1 ; start++){
			if(input % start == 0 ){
				return false;
			}
		}

		return true;
	}
}