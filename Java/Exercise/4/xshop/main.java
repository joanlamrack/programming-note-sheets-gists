public class main{
	public static void main(String[]args){
		Shopper[] shoppers = new Shopper[]{new Shopper("Dina", "Sepatu Stacattu", 2), new Shopper("Dina2", "Sepatu Stacattu", 2)};

		Xshop.assessShoppers(shoppers);
		Xshop.printShopContent();
	}
}