import java.util.HashMap;
public class Xshop{
	private static shopItem[] shopItems = new shopItem[]{
		new shopItem("Sepatu Stacattu", 1500000, 10),
		new shopItem("Baju Zoro", 500000, 2),
		new shopItem("Sweater Uniklooh", 175000, 1)
	};

	public static String assessShoppers(Shopper[] input){
		for(Shopper people : input){
			for(ShopItem oneShopItem : shopItems){
				if((oneShopItem.getItemName() == people.getProductName()) && (oneShopItem.getItemCount() - people.getAmountForShopping() >= 0)){
					oneShopItem.decreaseItemCountBy(people.getAmountForShopping());
					oneShopItem.addShopper(people);
				}
			}
		}
	}

	public void printShopContent(){
		for(ShopItem oneShopItem : shopItems){
			System.out.println(oneShopItem.getItemName() +" "+oneShopItem.getItemCount());
		}
	}
}