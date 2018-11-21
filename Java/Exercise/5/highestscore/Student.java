public class Student{
	private String belongToClass = "";
	private String name = "";
	private int score = "";
	
	public Student(String className, String studentName, int studentScore){
		this.belongToClass = className;
		this.name = studentName;
		this.score = studentScore;
	}

	public String getClassName(){
		return this.belongToClass;
	}

	public String getName(){
		return this.name;
	}

	public int getScore(){
		return this.score;
	}

	@Override
	public String toString() {
		return this.name +" : "+this.score;
	}
}