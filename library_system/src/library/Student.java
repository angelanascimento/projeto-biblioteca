package library;

import java.util.List;

public class Student extends Users {
	
	private int ra;
	private String year; 
	
	public Student(int ra, String name, String lastName, String dateBirth, String address, String year, String status) {
		super(name, lastName, dateBirth, address, status);
		this.ra = ra;
		this.year = year;
	}
	
	public Student() {
		
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public void view() {
		System.out.println("___________________________________________________");
		System.out.println("");
		System.out.println("	* CADASTRO EFETUADO COM SUCESSO! *");
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("Informações resgitradas:");
		System.out.println("");
		System.out.printf("R.A.: %s\n", getRa());
		System.out.printf("Nome: %s %s\n", getName(), getLastName());
		System.out.printf("Data de Nascimento: %s\n", getDateBirth());
		System.out.printf("Endereço: %s\n", getAddress());
		System.out.printf("Ano/Serie: %s\n", getYear());
		System.out.printf("Status: %s\n", getStatus());
		System.out.println("");
	}
	
	public static int searchUser(List<Student> listStudent, int ra) {
		
		int response = 0;
		
		if(listStudent.isEmpty()) {
			response =  -2; //LISTA VAZIA
		}
		else {
			for(int i = 0; i < listStudent.size(); i++ ) {
				int bookId = listStudent.get(i).getRa();
				if(bookId == ra) {
					response = i;
				}
				else {
					response = -1; // ID NÃO ENCONTRADO
				}
			}
		}
		return response;
	}
	
	/*public static int searchUser(List<Teacher> listTeacher, int rf) {
		return;
	}*/
}
