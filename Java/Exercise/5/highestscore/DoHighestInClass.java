import java.util.ArrayList;
import java.util.HashMap;

public class DoHighestInClass{
	private static HashMap<String,Class> classes = new HashMap<String,Class>();
	public static void assessStudents(Student[] students){
		for(Student oneStudent : students){
			assessStudent(oneStudent);
		}
	}

	public static void assessStudent(Student oneStudent){
		
		String className = oneStudent.getClassName();
		Class theClassWithSuchName = classes.get(className);
		int currentStudentScore = oneStudent.getScore();
		
		if(theClassWithSuchName == null){
			classes.put(className, new Class(className, oneStudent));
		}
		else if(theClassWithSuchName.getBestStudentScore() < currentStudentScore){
			theClassWithSuchName.setBestStudent(oneStudent);
		}
	}

	public static String getContent() {
		String output = "";
		for(String key : classes.keySet()){
			output += classes.get(key).toString();
		}

		return output;
	}

}