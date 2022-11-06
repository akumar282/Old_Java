import java.util.ArrayList;


public class Person {
	public String address;
	public String typ;
	static ArrayList<Person> stor = new ArrayList<>();
	
	public Person(String address, String typ) {
		this.address = address;
		this.typ = typ;
	}
	public Person() {
		address = "";
		typ = "";
	}
	public Person(String address) {
		this.address = address;
		typ = "";
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getAddress() {
		return address;
	}
	public String getTyp() {
		return typ;
	}
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person) obj;
			if(this.address.equals(temp.address) && this.typ.equals(temp.typ)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (this.address.hashCode() + this.typ.hashCode());
	}

	
	
	public String toString() {
		return address+" "+typ;
	}

	
	
}
