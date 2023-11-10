package pojos.US10Pojo;

import java.io.Serializable;

public class US10LessonProgramDeleteResponsePojo implements Serializable {
	private String message;
	private String httpStatus;

	public US10LessonProgramDeleteResponsePojo(String message, String httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public US10LessonProgramDeleteResponsePojo() {
	}

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

	@Override
 	public String toString(){
		return 
			"US10LessonProgramDeleteResponsePojo{" + 
			"message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}