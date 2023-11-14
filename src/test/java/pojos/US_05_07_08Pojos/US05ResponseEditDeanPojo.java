package pojos.US_05_07_08Pojos;

import java.io.Serializable;

public class US05ResponseEditDeanPojo implements Serializable {
	private US05ObjectPojo object;
	private String message;
	private String httpStatus;

	public US05ResponseEditDeanPojo() {
	}

	public US05ResponseEditDeanPojo(US05ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(US05ObjectPojo object){
		this.object = object;
	}

	public US05ObjectPojo getObject(){
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
			"ResponseEditDeanPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}