package pojos.US_05_07_08Pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class US_08CreateLessonResponsePojo implements Serializable {
	private US_08LessonObjectPojo object;
	private String message;
	private String httpStatus;

	public US_08CreateLessonResponsePojo() {
	}

	public US_08CreateLessonResponsePojo(US_08LessonObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US_08LessonObjectPojo object){
		this.object = object;
	}

	public US_08LessonObjectPojo getObject(){
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
			"CreateLessonResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}