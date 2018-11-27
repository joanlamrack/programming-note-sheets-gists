import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Angkot {
	private String[] route;
	private int pricePerOneStop = 0;
	private ArrayList<AngkotHistory> history = new ArrayList<AngkotHistory>();

	class AngkotHistory {
		Passanger passangerData;
		int price = 0;

		public AngkotHistory(Passanger onePassanger, int price) {
			this.passangerData = onePassanger;
			this.price = price;
		}

		@Override
		public String toString() {
			return "\n"+this.passangerData.getName() +" "+ this.passangerData.getPickUp() +" "+ this.passangerData.getDestination()
					+" "+ this.price;
		}
	}

	public Angkot(String[] route, int pricePerOneStop) {
		this.route = route;
		this.pricePerOneStop = pricePerOneStop;
	}

	private int calculatePrice(String destination, String to){
		int output = this.pricePerOneStop * Math.abs( this.getIndex(destination) - this.getIndex(to));
		return output;
	}

	public String assessPassangers(Passanger[] people){
		String output = "";

		for(Passanger apassanger : people){
			//System.out.println(apassanger);
			this.history.add(new AngkotHistory(apassanger, calculatePrice(apassanger.getDestination() , apassanger.getPickUp())));
		}

		for(AngkotHistory oneHistory : this.history){
			output+= oneHistory.toString();
		}

		return output;
	}

	

	private int getIndex(String target) {
		return Arrays.asList(this.route).indexOf(target);
	}
}