public class usingswitchcase {
	public static void main(String[] args) {
		int hari = 5;
		int bulan = 6;
		int tahun = 1987;

		System.out.println(getDate(hari, bulan, tahun));
	}

	public static String getDate(int day, int month, int year) {
		return day + " " + getMonth(month) + " " + year;
	}

	public static String getMonth(int month) {
		String output = "none";
		switch (month) {
		case 1:
			output = "Januari";
		case 2:
			output = "Februari";
		case 3:
			output = "Maret";
		case 4:
			output = "April";
		case 5:
			output = "Mei";
		case 6:
			output = "Juni";
		case 7:
			output = "Juli";
		case 8:
			output = "Agustus";
		case 9:
			output = "September";
		case 10:
			output = "Oktober";
		case 11:
			output = "November";
		case 12:
			output = "Desember";
		}

		return output;
	}
}