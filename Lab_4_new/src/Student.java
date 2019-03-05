import java.util.Objects;

public class Student {
	private String name;
	private String surname;
	private String matricNumber;
	private String street;
	private String ZIP;
	private String city;
	
	public Student(String name, String surname, String matricNumber, String street, String ZIP, String city) {
		this.name = name;
		this.surname = surname;
		this.matricNumber = matricNumber;
		this.street = street;
		this.ZIP = ZIP;
		this.city = city;
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getMatricNumber() {
		return matricNumber;
	}


	public void setMatricNumber(String matricNumber) {
		this.matricNumber = matricNumber;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getZIP() {
		return ZIP;
	}


	public void setZIP(String ZIP) {
		ZIP = ZIP;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public int hashCode() {	 
		       int hash = toString().hashCode();
		       return hash ;
		   }


	@Override
	public boolean equals(Object obj) {
		       if (this == obj) {
		           return true;
		       }
		       if (obj == null) {
		           return false;
		       }
		       if (getClass() != obj.getClass()) {
		           return false;
		       }
		       final Student other = (Student) obj;
		       return Objects.equals(this.matricNumber, other.matricNumber);
		           // just to reduce code complexity i used Matriculation number because of its uniqueness.
		   }

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", matricNumber=" + matricNumber + ", street="
				+ street + ", ZIP=" + ZIP + ", city=" + city + "]";
	}

	
}
