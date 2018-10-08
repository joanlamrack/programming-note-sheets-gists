public class ImportClass {
	public static void main(String[] args) {
		ExportedClass importedClass = new ExportedClass();

		System.out.println("The content of imported class is " + importedClass.isTrue);

		importedClass.toggleBoolean();

		System.out.println("Now The content of imported class is " + importedClass.isTrue);
	}
}