public class keepeatingrecursive{
	public static void main(String[]args){
		System.out.println(dokeepeatingrecursive(66));
		System.out.println(dokeepeatingrecursive(100));
		System.out.println(dokeepeatingrecursive(90));
		System.out.println(dokeepeatingrecursive(10));
		System.out.println(dokeepeatingrecursive(0));
	}

	public static int dokeepeatingrecursive(int minute){
		if ( minute <= 0 ) {
			return 0;
		}
		else {
			return 1 + dokeepeatingrecursive(minute - 15);
		}
	}
}