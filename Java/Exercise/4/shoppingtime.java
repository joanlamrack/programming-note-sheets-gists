import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class shoppingtime {
	public static void main(String[] args) {

		System.out.println(doshoppingtime("djkeieri92934298", 700000));
	}

	public static String doshoppingtime(String memberId, int pricepoint){
		int changeMoney = pricepoint;
		ArrayList<String> listPurchased = new ArrayList<String>();
		LinkedHashMap<String,Integer> itemPrices = new LinkedHashMap<String, Integer>();
		itemPrices.put("Sepatu Stacattu", 1500000);
		itemPrices.put("Baju Zoro", 500000);
		itemPrices.put("Baju H & N", 250000);
		itemPrices.put("Sweater Uniklooh", 175000);
		itemPrices.put("Casing Handphone", 50000);



		if (memberId.length() == 0) {
			return "Mohon maaf, toko X hanya berlaku untuk member saja";
		}
		else if (pricepoint < 50000) {
			return "Mohon maaf, uang tidak cukup";
		}

		for(String item : itemPrices.keySet()){
			int itemprice = itemPrices.get(item);

			if(changeMoney < 50000){
				return Integer.toString(changeMoney) +  Arrays.toString(listPurchased.toArray(new String[listPurchased.size()]));
			}
			else if ( changeMoney >= itemprice ) {
				changeMoney = changeMoney - itemprice;
				listPurchased.add(item);
			}
		}
		return Integer.toString(changeMoney) +  Arrays.toString(listPurchased.toArray(new String[listPurchased.size()]));

	}
}