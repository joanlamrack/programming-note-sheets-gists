public class Class {
	private String name = "";
	private String bestStudentName = "";
	private int bestStudentScore = 0;

	public Class(String className, String bestStudentName, int bestScore ){
		this.name = className;
		this.bestStudentName = bestStudentName;
		this.bestStudentScore = bestScore;
	}

	public String getBestStudentName(){
		return this.bestStudentName;
	}

	public int getBestStudentScore(){
		return this.bestStudentScore;
	}

	public String getClassName(){
		return this.name;
	}

	public void setBestStudentScore(int bestScore){
		this.bestStudentScore = bestScore;
	}

	public void setBestStudentName(int bestStudentName){
		this.bestStudentName = bestStudentName;
	} 

}