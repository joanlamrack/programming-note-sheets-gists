public class HighestScoreMain{
	public static void main(String[]args){
		Student[] students = {
			new Student("foxes", "Alexander", 100),
			new  Student("wolves", "Alisa", 76),
			new Student("foxes", "Vladimir", 92)
		};

		DoHighestInClass.assessStudents(students);
	}
}