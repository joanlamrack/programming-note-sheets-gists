import java.util.HashMap;

public class xshop{

	class shopper{
		String shopperName = "";
		String productName = "";
		int amount = 0;

		shopper(String shopperName, String productName, int amount){
			this.shopperName = shopperName;
			this.productName = productName;
			this.amount = amount;
		}

		public String getShopperName(){
			return this.shopperName;
		}

		public String getProductName(){
			return this.productName;
		}

		public int getAmountForShopping(){
			return this.amount;
		}
	}

	class shopItem{
		private String itemName = "";
		private int itemPrice = 0;
		private int itemCount = 0;
		private ArrayList<String> shoppers = new ArrayList<String>();

		shopItem(String itemName, int itemPrice, int itemCount){
			this.itemName = itemName;
			this.itemPrice = itemPrice;
			this.itemCount = itemCount;
		}

		public String getItemName(){
			return this.itemName;
		}

		public int getItemPrice(){
			return this.itemPrice;
		}

		public int getItemCount(){
			return this.itemCount;
		}

		public void decreaseItemCountBy(int itemCountToBeDecrease){
			this.itemCount-=itemCountToBeDecrease;
		}

	}

	class thexshop{
		private static shopItem[] shopItems = new shopItem[]{
			new shopItem("Sepatu Stacattu", 1500000, 10),
			new shopItem("Baju Zoro", 500000, 2),
			new shopItem("Sweater Uniklooh", 175000, 1)
		};

		public static String assessShoppers(){
			
		}
	}
	public static void main(String[]args){

	}

	
}