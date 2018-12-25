public class data {
	public static String[] getData(){
		String readFromFile = FileReader.doReadFile("data.txt");
		String[] outputArray = FileReader.separateByEnter(readFromFile);
		return outputArray;
	}
}