package pojos.US_05_07_08Pojos;

import java.io.Serializable;

public class US05DeanPutPojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String gender;
	private String name;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private String username;

	public US05DeanPutPojo() {
	}

	public US05DeanPutPojo(String birthDay, String birthPlace, String gender, String name, String phoneNumber, String ssn, String surname, String username) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"DeanPutPojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",gender = '" + gender + '\'' + 
			",name = '" + name + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' +
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}