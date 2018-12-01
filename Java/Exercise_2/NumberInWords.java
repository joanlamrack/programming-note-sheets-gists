import java.util.LinkedHashMap;

public class NumberInWords {
	public static void main(String[] args) {
		double[] testInputs = { 4, 19, 27, 102, 38079, 821027130621.0, 82102 };

		for (double input : testInputs) {
			System.out.println(doNumberInWords(input));
		}
	}

	public static String doNumberInWords(double input) {
		final LinkedHashMap<Double, String> timesTenMapper = new LinkedHashMap<Double, String>();

		timesTenMapper.put(1000000000000.0, "trilyun");
		timesTenMapper.put(1000000000.0, "milyar");
		timesTenMapper.put(1000000.0, "juta");
		timesTenMapper.put(1000.0, "ribu");
		timesTenMapper.put(100.0, "ratus");
		timesTenMapper.put(10.0, "puluh");

		final LinkedHashMap<Double, String> belowTen = new LinkedHashMap<Double, String>();

		belowTen.put(10.0, "belas");
		belowTen.put(9.0, "sembilan");
		belowTen.put(8.0, "delapan");
		belowTen.put(7.0, "tujuh");
		belowTen.put(6.0, "enam");
		belowTen.put(5.0, "lima");
		belowTen.put(4.0, "empat");
		belowTen.put(3.0, "tiga");
		belowTen.put(2.0, "dua");
		belowTen.put(1.0, "se");
		belowTen.put(0.0, "nol");

		final String one = "satu";

		if (input == 0) {
			return belowTen.get(0.0);
		} else if (input == 1) {
			return one;
		} else if (input < 10) {
			return belowTen.get(input);
		} else if (input == 10) {
			return belowTen.get(1.0) + timesTenMapper.get(input);
		} else if (input > 10 && input < 20) {
			double teens = input - 10.0;
			return belowTen.get(teens) + " " + belowTen.get(10.0);
		} else if (input >= 20) {
			for (double mapper : timesTenMapper.keySet()) {
				if (input >= mapper) {
					double howManytenTimes = Math.floor(input / mapper);
					double remainder = input % (howManytenTimes * mapper);

					return (howManytenTimes == 1.0 ? belowTen.get(howManytenTimes) : doNumberInWords(howManytenTimes))
							+ " " + timesTenMapper.get(mapper) + " "
							+ (remainder == 0 ? "" : doNumberInWords(remainder));
				}
			}
		}
		return "Invalid input";

	}
}