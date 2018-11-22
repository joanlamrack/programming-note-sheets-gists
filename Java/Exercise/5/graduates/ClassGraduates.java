import java.util.ArrayList;

public class ClassGraduates{
	private ArrayList<Student> studentsGraduated = new ArrayList<Student>();
	private int skbm = 75;

	public ClassGraduates(Student firstStudent){
		this.addMoreStudent(firstStudent);
	}

	public void addMoreStudentGraduated(Student additionalStudent){
		if(additionalStudent.getStudentScore() > this.skbm){
			this.studentsGraduated.add(additionalStudent);
		}
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