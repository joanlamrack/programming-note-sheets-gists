public class damagecalculation{
	public static void main(String[]args){
		System.out.println(damageCalculation(9, 25));
	}

	public static int attack(int damage){
		return damage - 2;
	}

	public static int damageCalculation(int numberOfAttacks, int damagePerattack){
		return numberOfAttacks * attack(damagePerattack);
	}

}