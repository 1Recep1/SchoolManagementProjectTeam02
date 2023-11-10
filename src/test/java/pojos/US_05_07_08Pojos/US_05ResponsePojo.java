package pojos.US_05_07_08Pojos;

import java.io.Serializable;

public class US_05ResponsePojo implements Serializable {
	private US_05ObjectPojo object;
	private String message;
	private String httpStatus;

	public US_05ResponsePojo() {
	}

	public US_05ResponsePojo(US_05ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US_05ObjectPojo object){
		this.object = object;
	}

	public US_05ObjectPojo getObject(){
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
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}