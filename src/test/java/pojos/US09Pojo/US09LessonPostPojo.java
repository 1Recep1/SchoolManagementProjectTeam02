package pojos.US09Pojo;

import java.io.Serializable;

public class US09LessonPostPojo implements Serializable {
	private boolean compulsory;
	private int creditScore;
	private String lessonName;

	public US09LessonPostPojo() {
	}

	public US09LessonPostPojo(boolean compulsory, int creditScore, String lessonName) {
		this.compulsory = compulsory;
		this.creditScore = creditScore;
		this.lessonName = lessonName;
	}

	public void setCompulsory(boolean compulsory){
		this.compulsory = compulsory;
	}

	public boolean isCompulsory(){
		return compulsory;
	}

	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}

	public int getCreditScore(){
		return creditScore;
	}

	public void setLessonName(String lessonName){
		this.lessonName = lessonName;
	}

	public String getLessonName(){
		return lessonName;
	}

	@Override
 	public String toString(){
		return 
			"US09ObjectPojo{" + 
			"compulsory = '" + compulsory + '\'' + 
			",creditScore = '" + creditScore + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			"}";
		}
}