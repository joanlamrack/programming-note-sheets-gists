public class Student{
	private String name = "";
	private String className = "";
	private int score = 0;

	public Student(String studentName, String className, int studentScore){
		this.name = studentName;
		this.className = className;
		this.score = studentScore;
	}

	public String getStudentName(){
		return this.name;
	}

	public String getClassName(){
		return this.className;
	}

	public int getStudentScore(){
		return this.score;
	}
}