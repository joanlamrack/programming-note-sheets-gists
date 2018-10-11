public class playwithfunctions{
	public static void main(String[]args){
		shoutout();
		
		int a = 6;
		int b = 5;

		int hasil = calculateMultiply(a,b);

		System.out.println(hasil);

		System.out.println(processSentence("Budi", 30, "Yogyakarta", "gaming"));
	}

	public static void shoutout(){
		System.out.println("Halo function");
	}

	public static int calculateMultiply(int a, int b){
		return a * b ;
	}

	public static String processSentence(String name, int age, String address, String hobby){
		return "Nama saya "+name+"umur saya "+age+" tahun, alamat saya di "+address+", dan saya punya hobi yaitu "+hobby;
	}
}