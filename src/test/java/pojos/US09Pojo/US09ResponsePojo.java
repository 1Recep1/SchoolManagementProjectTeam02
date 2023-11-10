package pojos.US09Pojo;

import java.io.Serializable;

public class US09ResponsePojo implements Serializable {
	private US09ObjectPojo object;
	private String message;
	private String httpStatus;

	public US09ResponsePojo() {
	}

	public US09ResponsePojo(US09ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US09ObjectPojo object){
		this.object = object;
	}

	public US09ObjectPojo getObject(){
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
			"US09ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}