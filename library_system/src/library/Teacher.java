package library;

import java.util.List;

public class Teacher extends Users implements Register {
	
	private int rf;
	private String teaches;
	
	public Teacher(int re, String name, String lastName, String dateBirth, String address, String teaches, String status) {
		super(name, lastName, dateBirth, address, status);
		this.rf = re;
		this.teaches = teaches;
	}

	public Teacher() {
		
	}

	public int getRf() {
		return rf;
	}

	public void setRf(int re) {
		this.rf = re;
	}

	public String getTeaches() {
		return teaches;
	}

	public void setTeaches(String teaches) {
		this.teaches = teaches;
	}

	@Override
	public void view() {
		System.out.println("___________________________________________________");
		System.out.println("");
		System.out.println("	CADASTRO EFETUADO COM SUCESSO!");
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("Informações resgitradas:");
		System.out.println("");
		System.out.printf("R.F.: %s\n", getRf());
		System.out.printf("Nome: %s %s\n", getName(), getLastName());
		System.out.printf("Data de Nascimento: %s\n", getDateBirth());
		System.out.printf("Endereço: %s\n", getAddress());
		System.out.printf("Ano/Serie: %s\n", getTeaches());
		System.out.printf("Status: %s\n", getStatus());
		System.out.println("");
	}
	
	public static int searchUser(List<Teacher> listTeacher, int rf) {
		
		int response = 0;
		
		if(listTeacher.isEmpty()) {
			response =  -2; //LISTA VAZIA
		}
		else {
			for(int i = 0; i < listTeacher.size(); i++ ) {
				int bookId = listTeacher.get(i).getRf();
				if(bookId == rf) {
					response = i;
				}
				else {
					response = -1; // ID NÃO ENCONTRADO
				}
			}
		}
		return response;
	}

	@Override
	public void updateRegister() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRegister() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
