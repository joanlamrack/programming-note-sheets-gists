import java.util.ArrayList;
import java.util.HashMap;

public class DoHighestInClass {
	private static HashMap<String, StudentClass> classes = new HashMap<String, StudentClass>();

	public static void assessStudents(Student[] students) {
		for (Student oneStudent : students) {
			assessStudent(oneStudent);
		}
	}

	public static void assessStudent(Student oneStudent) {

		String className = oneStudent.getClassName();
		StudentClass theClassWithSuchName = classes.get(className);
		int currentStudentScore = oneStudent.getScore();

		if (theClassWithSuchName == null) {
			classes.put(className, new StudentClass(className, oneStudent));
		} else if (theClassWithSuchName.getBestStudentScore() < currentStudentScore) {
			theClassWithSuchName.setBestStudent(oneStudent);
		}
	}

	public static String getContent() {
		String output = "";
		for (String key : classes.keySet()) {
			output += classes.get(key).toString()+"\n";
		}

		return output;
	}

}