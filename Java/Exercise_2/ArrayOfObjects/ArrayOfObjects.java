import java.util.ArrayList;

public class ArrayOfObjects{
    public static void main(String[]args){
		ArrayList<People> peoples = new ArrayList<People>();

		peoples.add( new People("akabr", People.Gender.MALE, 1));
		peoples.add( new People("icha", People.Gender.FEMALE, 1));

		 System.out.println(searchAndPrint("icha", peoples));
	}

	public static String searchAndPrint(String name, ArrayList<People> arrayToSearch){
		for( People onePeople : arrayToSearch){
			if(onePeople.getName() == name){
				return onePeople.toString();
			}
		}

		return "None Found";
	}
}