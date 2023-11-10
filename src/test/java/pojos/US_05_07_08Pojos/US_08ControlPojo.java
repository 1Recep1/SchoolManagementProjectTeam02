package pojos.US_05_07_08Pojos;

import java.io.Serializable;
import java.util.List;

public class US_08ControlPojo implements Serializable {
	private int lessonProgramId;
	private String startTime;
	private String stopTime;
	private List<US_08LessonNamePojo> lessonName;
	private List<Object> teachers;
	private List<Object> students;
	private String day;

	public US_08ControlPojo() {
	}

	public US_08ControlPojo(int lessonProgramId, String startTime, String stopTime, List<US_08LessonNamePojo> lessonName, List<Object> teachers, List<Object> students, String day) {
		this.lessonProgramId = lessonProgramId;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.lessonName = lessonName;
		this.teachers = teachers;
		this.students = students;
		this.day = day;
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

	public void setLessonName(List<US_08LessonNamePojo> lessonName){
		this.lessonName = lessonName;
	}

	public List<US_08LessonNamePojo> getLessonName(){
		return lessonName;
	}

	public void setTeachers(List<Object> teachers){
		this.teachers = teachers;
	}

	public List<Object> getTeachers(){
		return teachers;
	}

	public void setStudents(List<Object> students){
		this.students = students;
	}

	public List<Object> getStudents(){
		return students;
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
			"ControlPojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",teachers = '" + teachers + '\'' + 
			",students = '" + students + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}