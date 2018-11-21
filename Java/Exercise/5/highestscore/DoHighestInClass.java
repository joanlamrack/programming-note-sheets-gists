import java.util.ArrayList;
import java.util.HashMap;

public class DoHighestInClass{
	private static HashMap<String,Class> classes = new ArrayList<Class>();
	public static assessStudents(Student[] students){
		for(Student oneStudent : students){
			assessStudent(oneStudent);
		}
	}

	public static assessStudent(Student oneStudent){
		Class theClassWithSuchName = classes.get(className);
		String className = oneStudent.getClassName();
		int currentStudentScore = oneStudent.getScore();
		
		if(theClassWithSuchName == null){
			classes.set(className, new Class(className, oneStudent));
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