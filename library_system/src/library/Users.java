package library;

import java.util.ArrayList;

public abstract class Users {
	
	private String name;
	private String lastName;
	private String dateBirth;
	private String address;
	private String status;
	private ArrayList<Book> pendencies = new ArrayList<>();
	
	public Users(String name, String lastName, String dateBirth, String address, String status) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
		this.address = address;
		this.status = status;
	}
	
	public Users() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public ArrayList<Book> getPendencies() {
		return pendencies;
	}

	public void setPendencies(Book pendencies) {
		this.pendencies.add(pendencies);
	}

	public abstract void view();
}
