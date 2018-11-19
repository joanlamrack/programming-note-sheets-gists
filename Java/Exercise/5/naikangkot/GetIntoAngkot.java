public class GetIntoAngkot {
	public static void main(String[] args) {
		String[] route = { "A", "B", "C", "D", "E", "F" };
		Angkot oneAkot = new Angkot(route, 2000);

		Passanger dimitri = new Passanger("B", "F", "Dimitri");
		Passanger icha = new Passanger("A", "B", "Icha");
		Passanger[] passangers = new Passanger[]{ dimitri, icha };

		System.out.println(oneAkot.assessPassangers(passangers));
	}
}