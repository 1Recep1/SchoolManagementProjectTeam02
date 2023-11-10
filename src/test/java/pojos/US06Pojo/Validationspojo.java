package pojos.US06Pojo;

import java.io.Serializable;

public class Validationspojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String password;
	private String phoneNumber;
	private String surname;
	private String name;
	private String username;
	private String ssn;

	public Validationspojo() {
	}

	public Validationspojo(String birthDay, String birthPlace, String password, String phoneNumber, String surname, String name, String username, String ssn) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.surname = surname;
		this.name = name;
		this.username = username;
		this.ssn = ssn;
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

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	@Override
 	public String toString(){
		return 
			"Validationspojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",password = '" + password + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",surname = '" + surname + '\'' + 
			",name = '" + name + '\'' + 
			",username = '" + username + '\'' + 
			",ssn = '" + ssn + '\'' + 
			"}";
		}
}