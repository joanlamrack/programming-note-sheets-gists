public class lookingformedian{
	public static void main(String[]args){
		System.out.println(dolookmedian(new double[]{1,2,3}) );
	}

	public static double dolookmedian(double[] input){
		if(input.length % 2 == 1){
			return input[(input.length/2)];
		}
		else{
			return (input[input.length/2]+input[(input.length/2)-1])/2;
		}
	}
}