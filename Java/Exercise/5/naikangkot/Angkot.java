import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Arrays;

public class Angkot {
	private String[] route;
	private int pricePerOneStop = 0;
	private ArrayList<AngkotHistory> history;

	private class AngkotHistory {
		Passanger passangerData;
		int price = 0;

		public AngkotHistory(Passanger onePassanger, int price) {
			this.passangerData = onePassanger;
		}

		@Override
		public String toString() {
			return this.passangerData.getName() + this.passangerData.getPickUp() + this.passangerData.getDestination()
					+ this.price;
		}
	}

	public Angkot(String[] route, int pricePerOneStop) {
		this.route = route;
		this.pricePerOneStop = pricePerOneStop;
	}

	public String assessPassangers(Passanger[] people){
		String output = "";

		for(Passanger apassanger : people){
			history.add(new AngkotHistory(apassanger, calculatePrice(apassanger.getDestination() , apassanger.getPickUp())));
		}

		for(AngkotHistory oneHistory : this.history){
			output+= oneHistory.toString();
		}

		return output;
	}

	private int calculatePrice(String destination, String to){
		return this.pricePerOneStop * Math.abs( this.getIndex(destination) - this.getIndex(to));
	}

	private int getIndex(String target) {
		return Arrays.stream(this.route) // IntStream
				.boxed() // Stream<Integer>
				.collect(Collectors.toList()) // List<Integer>
				.indexOf(target);
	}
}