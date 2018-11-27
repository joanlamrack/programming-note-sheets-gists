import java.util.ArrayList;
import java.util.Arrays;

public class ShopItem {
	private String itemName = "";
	private int itemPrice = 0;
	private int itemCount = 0;
	private ArrayList<String> shoppers = new ArrayList<String>();

	ShopItem(String itemName, int itemPrice, int itemCount) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCount = itemCount;
	}

	public String getItemName() {
		return this.itemName;
	}

	public int getItemPrice() {
		return this.itemPrice;
	}

	public int getItemCount() {
		return this.itemCount;
	}

	public void decreaseItemCountBy(int itemCountToBeDecrease) {
		if (this.itemCount - itemCountToBeDecrease >= 0) {
			this.itemCount -= itemCountToBeDecrease;
		}
	}

	public void addShopper(Shopper people) {
		this.shoppers.add(people.getShopperName());
	}

	public String[] getShopper() {
		return (this.shoppers.toArray(new String[shoppers.size()]));
	}
}