public class minuteconversion{
	public static void main(String[]args){
		System.out.println(minuteConversion(704));
	}

	public static String minuteConversion(int seconds){
		int minute = seconds<60? 0:seconds/60;
		int second = seconds<60? seconds: seconds%60;

		return minute+":"+second;
	}
}