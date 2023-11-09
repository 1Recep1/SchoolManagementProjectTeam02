package pojos.US22_admin_management;

import java.io.Serializable;

public class US22_ResponsePojo implements Serializable {
	private US22_ObjectPojo object;
	private String message;
	private String httpStatus;

	public void setObject(US22_ObjectPojo object){
		this.object = object;
	}

	public US22_ObjectPojo getObject(){
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

	public US22_ResponsePojo() {
	}

	public US22_ResponsePojo(US22_ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
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