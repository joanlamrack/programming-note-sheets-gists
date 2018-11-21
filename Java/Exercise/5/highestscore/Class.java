public class Class {
	private String name = "";
	private Student bestStudent = null;

	public Class(String className, Student bestStudent ){
		this.name = className;
		this.bestStudent = bestStudent;
	}

	public String getBestStudentName(){
		return this.bestStudent.getName();
	}

	public int getBestStudentScore(){
		return this.bestStudent.getScore();
	}

	public String getClassName(){
		return this.name;
	}

	public void setBestStudent(Student newBestStudent){
		this.bestStudent = newBestStudent;
	}

	@Override
	public String toString() {
		return this.name +" "+ this.bestStudent;
	}

}