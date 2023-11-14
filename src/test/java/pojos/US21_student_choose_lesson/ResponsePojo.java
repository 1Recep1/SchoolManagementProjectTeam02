package pojos.US21_student_choose_lesson;

import java.util.List;
import java.io.Serializable;

public class ResponsePojo implements Serializable {
	private int lessonProgramId;
	private String startTime;
	private String stopTime;
	private List<LessonNamePojo> lessonName;
	private List<TeachersPojo> teachers;
	private List<StudentsPojo> students;
	private String day;

	public ResponsePojo() {
	}

	public ResponsePojo(String startTime, String stopTime, List<LessonNamePojo> lessonName, List<TeachersPojo> teachers, String day) {
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.lessonName = lessonName;
		this.teachers = teachers;
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

	public void setTeachers(List<TeachersPojo> teachers){
		this.teachers = teachers;
	}

	public List<TeachersPojo> getTeachers(){
		return teachers;
	}

	public void setStudents(List<StudentsPojo> students){
		this.students = students;
	}

	public List<StudentsPojo> getStudents(){
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
			"ResponsePojo{" + 
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