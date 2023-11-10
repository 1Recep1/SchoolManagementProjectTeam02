package pojos.US10Pojo;

import java.io.Serializable;

public class US10LessonProgramResponsePojo implements Serializable {
	private US10LessonProgramObjectPojo object;
	private String message;
	private String httpStatus;

	public US10LessonProgramResponsePojo(US10LessonProgramObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public US10LessonProgramResponsePojo() {
	}

	public void setObject(US10LessonProgramObjectPojo object){
		this.object = object;
	}

	public US10LessonProgramObjectPojo getObject(){
		return object;
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
			"US10LessonProgramResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}