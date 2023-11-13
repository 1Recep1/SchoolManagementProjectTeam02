package pojos.US10Pojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonCreator;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class US10LessonProgramLessonNamePojo implements Serializable {
	private int lessonId;
	private String lessonName;
	private int creditScore;
	private boolean compulsory;

	public US10LessonProgramLessonNamePojo() {
	}
	@JsonCreator
	public US10LessonProgramLessonNamePojo(
			@JsonProperty("lessonId") int lessonId,
			@JsonProperty("lessonName") String lessonName,
			@JsonProperty("creditScore") int creditScore,
			@JsonProperty("compulsory") boolean compulsory) {
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.creditScore = creditScore;
		this.compulsory = compulsory;
	}


	public void setLessonId(int lessonId){
		this.lessonId = lessonId;
	}

	public int getLessonId(){
		return lessonId;
	}

	public void setLessonName(String lessonName){
		this.lessonName = lessonName;
	}

	public String getLessonName(){
		return lessonName;
	}

	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}

	public int getCreditScore(){
		return creditScore;
	}

	public void setCompulsory(boolean compulsory){
		this.compulsory = compulsory;
	}

	public boolean isCompulsory(){
		return compulsory;
	}

	@Override
 	public String toString(){
		return 
			"LessonNamePojo{" + 
			"lessonId = '" + lessonId + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",creditScore = '" + creditScore + '\'' + 
			",compulsory = '" + compulsory + '\'' + 
			"}";
		}
}