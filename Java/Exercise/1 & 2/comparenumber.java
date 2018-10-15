public class comparenumber{
	public static void main(String[]args){
		System.out.println(compare(4, 4));
	}

	public static String compare(int angka1, int angka2){
		return angka2 > angka1 ? "true" : angka1 == angka2 ? "-1" : "false";
	}
}