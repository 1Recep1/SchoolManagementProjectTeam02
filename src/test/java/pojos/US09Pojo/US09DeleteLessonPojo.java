package pojos.US09Pojo;

import java.io.Serializable;

public class US09DeleteLessonPojo implements Serializable {
	private String message;
	private String httpStatus;

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	public US09DeleteLessonPojo(String message, String httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public US09DeleteLessonPojo() {
	}

	@Override
 	public String toString(){
		return 
			"USDeleteLessonPojo{" + 
			"message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}