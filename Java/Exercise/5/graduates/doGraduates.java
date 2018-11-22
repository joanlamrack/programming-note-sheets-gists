public class doGraduates{
	public static void main(String[]args){
		Student[] students = {
			new Student("Dimitri", "foxes", 90),
			new Student("Alexei", "wolves", 85),
			new Student("Sergei", "foxes", 74),
			new Student("Anastasia", "wolves", 78)
		};

		AllClassGraduates.assessAllStudents(students);

		System.out.println(AllClassGraduates.getContent());
	}
}