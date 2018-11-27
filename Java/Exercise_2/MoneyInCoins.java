import java.util.ArrayList;
import java.util.Arrays;

public class MoneyInCoins{
	public static void main(String[]args){
		System.out.println( Arrays.toString(doMoneyInCoins(454)) );
	}

	public static Integer[] doMoneyInCoins(int input){
		ArrayList<Integer> output = new ArrayList<Integer>();
		final int[] coins = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 1};

		for(int coin : coins){
			while(input >= coin){
				output.add(coin);
				input-=coin;
			}
		}

		return output.toArray(new Integer[output.size()]);
	}
}