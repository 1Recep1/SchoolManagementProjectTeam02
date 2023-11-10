package pojos.US10Pojo;

import java.util.List;
import java.io.Serializable;

public class US10LessonProgramObjectPojo implements Serializable {
	private int lessonProgramId;
	private String startTime;
	private String stopTime;
	private List<US10LessonProgramLessonNamePojo> lessonName;
	private String day;

	public US10LessonProgramObjectPojo(int lessonProgramId, String startTime, String stopTime, List<US10LessonProgramLessonNamePojo> lessonName, String day) {
		this.lessonProgramId = lessonProgramId;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.lessonName = lessonName;
		this.day = day;
	}

	public US10LessonProgramObjectPojo() {
	}

	public void setLessonProgramId(int lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public int getLessonProgramId(){
		return lessonProgramId;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
		return stopTime;
	}

	public void setLessonName(List<US10LessonProgramLessonNamePojo> lessonName){
		this.lessonName = lessonName;
	}

	public List<US10LessonProgramLessonNamePojo> getLessonName(){
		return lessonName;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}