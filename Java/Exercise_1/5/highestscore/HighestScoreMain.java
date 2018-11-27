public class HighestScoreMain{
	public static void main(String[]args){
		Student[] students = {
			new Student("foxes", "Vladimir", 92),
			new Student("foxes", "Alexander", 100),
			new Student("wolves", "Alisa", 76)
			
		};

		DoHighestInClass.assessStudents(students);
		System.out.println(DoHighestInClass.getContent());
	}
}