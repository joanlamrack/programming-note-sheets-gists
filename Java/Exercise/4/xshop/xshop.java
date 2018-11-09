import java.util.Arrays;
import java.util.HashMap;

public class Xshop {
	private static ShopItem[] shopItems = new ShopItem[] { new ShopItem("Sepatu Stacattu", 1500000, 10),
			new ShopItem("Baju Zoro", 500000, 2), new ShopItem("Sweater Uniklooh", 175000, 1) };

	public static void assessShoppers(Shopper[] input) {
		for (Shopper people : input) {
			for (ShopItem oneShopItem : shopItems) {
				if ((oneShopItem.getItemName() == people.getProductName())
						&& (oneShopItem.getItemCount() - people.getAmountForShopping() >= 0)) {
					oneShopItem.decreaseItemCountBy(people.getAmountForShopping());
					oneShopItem.addShopper(people);
				}
			}
		}
	}

	public static void printShopContent(){
		for(ShopItem oneShopItem : shopItems){
			System.out.println(oneShopItem.getItemName() +" "+oneShopItem.getItemCount() + " " + Arrays.toString(oneShopItem.getShopper()));
		}
	}
}