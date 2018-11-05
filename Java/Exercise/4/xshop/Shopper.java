public class Shopper {
	String shopperName = "";
	String productName = "";
	int amount = 0;

	Shopper(String shopperName, String productName, int amount) {
		this.shopperName = shopperName;
		this.productName = productName;
		this.amount = amount;
	}

	public String getShopperName() {
		return this.shopperName;
	}

	public String getProductName() {
		return this.productName;
	}

	public int getAmountForShopping() {
		return this.amount;
	}
}