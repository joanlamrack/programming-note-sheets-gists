import java.util.LinkedHashMap;

public class RomanNumeralRecursive {
	public static void main(String[] args) {
		System.out.println(doRomanNumeralRecursive(1451));
	}

	public static String doRomanNumeralRecursive(int input) {
		String output = "";
		LinkedHashMap<Integer, String> romanReference = new LinkedHashMap<Integer, String>();

		romanReference.put(1000, "M");
		romanReference.put(900, "CM");
		romanReference.put(500, "D");
		romanReference.put(400, "CD");
		romanReference.put(100, "C");
		romanReference.put(90, "XC");
		romanReference.put(50, "L");
		romanReference.put(40, "XL");
		romanReference.put(10, "X");
		romanReference.put(9, "IX");
		romanReference.put(5, "V");
		romanReference.put(1, "I");

		for (int key : romanReference.keySet()) {
			if (input >= key) {
				input -= key;
				return romanReference.get(key) + doRomanNumeralRecursive(input);
			}
		}

		return output;
	}
}