public class multidimensionaccess{
	public static void main(String[]args){
		String[][] input = {
			{"0001", "Roman Alamsyah", "Bandar Lampung", "21/05/1989", "Membaca"},
			{"0002", "Dika Sembiring", "Medan", "10/10/1992", "Bermain Gitar"},
			{"0003", "Winona", "Ambon", "25/12/1965", "Memasak"},
			{"0004", "Bintang Senjaya", "Martapura", "6/4/1970", "Berkebun"}
		};

		dataHandling(input);
	}

	public static void dataHandling(String[][] input){
		for(String[] element: input){
			String nomorID = "Nomor ID: "+element[0];
			String namaLengkap = "Nama Lengkap: "+element[1];
			String TTL = "TTL: "+element[2]+", "+element[3];
			String hobi = "Hobi "+element[4];

			System.out.println(nomorID+"\n"+namaLengkap+"\n"+TTL+"\n"+hobi+"\n");
		}
	}
}