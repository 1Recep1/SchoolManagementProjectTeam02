package pojos.US06Pojo;

import java.io.Serializable;

public class US06ResponseValidationpojo implements Serializable {
	private String message;
	private int statusCode;
	private String path;
	private long timeStamp;
	private Validationspojo validations;

	public US06ResponseValidationpojo() {
	}

	public US06ResponseValidationpojo(String message, int statusCode, String path, long timeStamp, Validationspojo validations) {
		this.message = message;
		this.statusCode = statusCode;
		this.path = path;
		this.timeStamp = timeStamp;
		this.validations = validations;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	public int getStatusCode(){
		return statusCode;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setTimeStamp(long timeStamp){
		this.timeStamp = timeStamp;
	}

	public long getTimeStamp(){
		return timeStamp;
	}

	public void setValidations(Validationspojo validations){
		this.validations = validations;
	}

	public Validationspojo getValidations(){
		return validations;
	}

	@Override
 	public String toString(){
		return 
			"US06ResponseValidationpojo{" + 
			"message = '" + message + '\'' + 
			",statusCode = '" + statusCode + '\'' + 
			",path = '" + path + '\'' + 
			",timeStamp = '" + timeStamp + '\'' + 
			",validations = '" + validations + '\'' + 
			"}";
		}
}