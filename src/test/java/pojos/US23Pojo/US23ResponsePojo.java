package pojos.US23Pojo;

import java.io.Serializable;

public class US23ResponsePojo implements Serializable {
	private US23ObjectPojo object;
	private String message;
	private String httpStatus;

	public void setObject(US23ObjectPojo object){
		this.object = object;
	}

	public US23ObjectPojo getObject(){
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

	public US23ResponsePojo() {
	}

	public US23ResponsePojo(US23ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ViceDeanInfoPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}