import java.util.ArrayList;
import java.util.Arrays;

public class meleerangegrouping {
	public static void main(String[] args) {
		String input = "Razor-Ranged,Invoker-Ranged,Meepo-Melee,Axe-Melee,Sniper-Ranged";
		System.out.println(Arrays.deepToString(domeleerangegrouping(input)));
	}

	public static String[][] domeleerangegrouping(String heroes) {
		ArrayList<String> ranged = new ArrayList<String>();
		ArrayList<String> melee = new ArrayList<String>();

		for (String oneHero : heroes.split(",")) {
			String[] nameAndType = oneHero.split("-");
			String heroesName = nameAndType[0];
			String type = nameAndType[1];

			if (type.equals("Ranged")) {
				ranged.add(heroesName);
			} else {
				melee.add(heroesName);
			}
		}

		return new String[][] { ranged.toArray(new String[ranged.size()]), melee.toArray(new String[melee.size()]) };
	}
}