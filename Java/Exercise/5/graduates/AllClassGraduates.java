import java.util.HashMap;

public class AllClassGraduates{
	public static HashMap<String, ClassGraduates> allClassGraduates = new HashMap<String, ClassGraduates>(); 

	public static void assessAllStudents(Student[] allStudents){
		for(Student oneStudent : allStudents){
			assessOneStudents(oneStudent);
		}
	}
	
	public static void assessOneStudents(Student oneStudent){
		String className = oneStudent.getClassName();
		boolean isClassAlreadyExist = allClassGraduates.containsKey(className);
		if(isClassAlreadyExist){
			allClassGraduates.get(className).addMoreStudentGraduated(oneStudent);
		}
		else{
			allClassGraduates.put(className, new ClassGraduates(oneStudent));
		}
	}
	
}