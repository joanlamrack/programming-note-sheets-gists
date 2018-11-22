import java.util.ArrayList;

public class ClassGraduates{
	private ArrayList<Student> studentsGraduated = new ArrayList<Student>();

	public ClassGraduates(Student firstStudent){
		this.studentsGraduated.add(firstStudent);
	}

	public void addMoreStudent(Student additionalStudent){
		this.studentsGraduated.add(additionalStudent);
	}

	@Override
	public String toString() {
		String output ="";
		for(Student oneStudent : this.studentsGraduated){
			output += oneStudent.getStudentName()+" : "+oneStudent.getStudentScore()+"\n";
		}
		return output;
	}
}