import java.util.Calendar;

public class changeme {
	public static void main(String[] args) {
		String[][] input = new String[][] { { "Christ", "Evans", "Male", "1982" }, { "Robert", "Downey", "Male" } };
		dochangeme(input);
	}

	public static void dochangeme(String[][] input) {
		for (String[] peoplebio : input) {
			System.out.println("firstName: " + peoplebio[0]);
			System.out.println("lastName: " + peoplebio[1]);
			System.out.println("gender: " + peoplebio[2]);
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			String age =  peoplebio.length == 4 ?  Integer.toString(currentYear - Integer.parseInt(peoplebio[3])) : "Invalid date";
			System.out.println("age: " + age);
		}
	}
}