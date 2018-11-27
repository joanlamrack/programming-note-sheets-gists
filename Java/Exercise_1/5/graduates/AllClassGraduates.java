import java.util.HashMap;

public class AllClassGraduates{
	private static HashMap<String, ClassGraduates> allClassGraduates = new HashMap<String, ClassGraduates>(); 

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
	

	public static String getContent() {
		String output = "";

		for(String classes : allClassGraduates.keySet()){
			output+= classes +" : \n"+ allClassGraduates.get(classes) ;
		}

		return output;
	}
}