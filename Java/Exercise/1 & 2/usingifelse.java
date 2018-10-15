public class usingifelse {
	public static void main(String[] args) {
		String nama = "";
		String peran = "";

		if (nama == "" && peran == "") {
			System.out.println("Nama harus diisi!");
		} else if (nama != "" && peran == "") {
			System.out.println("Halo, " + nama + ", pilih peranmu untuk memulai!");
		} else {
			System.out.println("Selamat datang di Dunia Proxytia, " + nama);
			switch (peran) {
			case "Tabib":
				System.out.println("Halo " + peran + " " + nama + ", kamu akan membantu temanmu yang terluka.");
				break;
			case "Ksatria":
				System.out.println("Halo " + peran + " " + nama + ", kamu dapat menyerang dengan senjatamu!");
				break;
			case "Penyihir":
				System.out.println("Halo " + peran + " " + nama + ", ciptakan keajaiban yang membantu kemenanganmu!");
				break;
			}
		}
	}
}