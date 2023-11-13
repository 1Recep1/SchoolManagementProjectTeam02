package pojos.US10Pojo;

import pojos.US09Pojo.*;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

public class US11LessonProgramGetResponsePojo implements Serializable {
	private int lessonProgramId;
	private String startTime;
	private String stopTime;
	private List<LessonNamePojo> lessonName;
	private List<Object> teachers;
	private List<Object> students;
	private String day;

	public US11LessonProgramGetResponsePojo() {
	}

	public US11LessonProgramGetResponsePojo(int lessonProgramId, String startTime, String stopTime, List<US10LessonProgramLessonNamePojo> lessonNameList, Object teachers, Object students, String day) {
		this.lessonProgramId = lessonProgramId;
		this.startTime = startTime;
		this.stopTime = stopTime;

		// Bu kısmı güncelledik
		this.lessonName = lessonNameList.stream()
				.map(pojo -> new LessonNamePojo(pojo.getLessonId(),pojo.getLessonName(),pojo.getCreditScore(),pojo.isCompulsory()))

				.collect(Collectors.toList());
		this.teachers = (List<Object>) teachers;
		this.students = (List<Object>) students;
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

	public void setLessonName(List<LessonNamePojo> lessonName){
		this.lessonName = lessonName;
	}

	public List<LessonNamePojo> getLessonName(){
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
			"US11LessonProgramGetResponsePojo{" + 
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