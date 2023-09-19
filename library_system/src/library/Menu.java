package library;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Menu {
	
	public static void main(String[] args) {
		
		int option;
		Scanner input = new Scanner(System.in);
		List<Book> listBooks = new ArrayList<>();
		List<Student> listStudent = new ArrayList<>();
		List<Teacher> listTeacher = new ArrayList<>();
		List<Student> pendenciesStudents = new ArrayList<>();
		List<Teacher> pendenciesTeachers = new ArrayList<>();

		int studentCounter = 0;
		int teacherCounter = 0;
		int bookCounter = 0;
		
		do {
			viewMenu();
			System.out.print("");
			option = input.nextInt();
			
			switch(option) {
			
			case 1: 
				
				int user = -3;
				boolean loop1 = true;

					do {
						
						try {
							
							System.out.println("___________________________________________________");
							System.out.println("");
							System.out.println("	[1] Aluno");
							System.out.println("	[2] Professor");
							System.out.println("	[0] Menu Inicial");
							System.out.println("___________________________________________________");
							System.out.println("");
							System.out.print("Digite uma opção: ");
							user = input.nextInt();

							if(user == 1) {

								String name, lastName, dateBirth, address,  year, status;
								int ra;
								
								System.out.println("___________________________________________________");
								System.out.println("");
								System.out.println("	PREENCHA TODOS OS CAMPOS INFORMADOS!");
								System.out.println("");
								System.out.println("---------------------------------------------------");
								
								System.out.print("Registro do Aluno: ");
								ra = input.nextInt();
								
								System.out.print("Nome: ");
								input.nextLine();
								name = input.nextLine();
								
								System.out.print("Sobrenome: ");
								lastName = input.nextLine();
								
								System.out.print("Data de Nascimento: ");
								dateBirth = input.nextLine();
								
								System.out.print("Endereço: ");
								address = input.nextLine();
								
								System.out.print("Ano/Serie: ");
								year = input.nextLine();
								
								System.out.print("Status da Matrícula: ");
								status = input.nextLine();

								listStudent.add(new Student(ra, name, lastName, dateBirth, address, year, status));
								
								listStudent.get(studentCounter).view();
								studentCounter += 1;

							}
							else if(user == 2) {
								String name, lastName, dateBirth, address, teaches, status;
								int re;
								
								System.out.println("___________________________________________________");
								System.out.println("");
								System.out.println("	PREENCHA TODOS OS CAMPOS INFORMADOS!");
								System.out.println("");
								System.out.println("---------------------------------------------------");
								
								System.out.print("Registro do Professor: ");
								re = input.nextInt();
								
								System.out.print("Nome: ");
								input.nextLine();
								name = input.nextLine();
								
								System.out.print("Sobrenome: ");
								lastName = input.nextLine();
								
								System.out.print("Data de Nascimento: ");
								dateBirth = input.nextLine();
								
								System.out.print("Endereço: ");
								address = input.nextLine();
								
								System.out.print("Matéria: ");
								teaches = input.nextLine();
								
								System.out.print("Status da Contratação: ");
								status = input.nextLine();
								
								listTeacher.add(new Teacher(re, name, lastName, dateBirth, address, teaches, status));
								
								listTeacher.get(teacherCounter).view();
								teacherCounter += 1;
							}
							else if(user == 0) {
								
							}
							loop1 = false;

						} catch (InputMismatchException e ) {
							System.err.println("===================================================");
							System.err.println("	DIGITE APENAS NÚMEROS");
							System.err.println("===================================================");
							input.nextLine();
							
						} catch(Exception e) {
							System.err.println("===================================================");
							System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
							System.err.println("===================================================");
							input.nextLine();
						}
					} while(user != 0 || loop1);

				break;
			case 2: 
				int book = -3;
				boolean loop2 = true;
				
				do {
					try {
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.println("	[1] Novo Registro");
						System.out.println("	[0] Menu Inicial");
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.print("Digite uma opção: ");
						book = input.nextInt();	
						System.out.println("___________________________________________________");
						
						
						if(book == 1) {
							String name, author, publishingCompany, language, description;
							int quantity;
							
							System.out.println("___________________________________________________");
							System.out.println("");
							System.out.println("	PREENCHA TODOS OS CAMPOS INFORMADOS!");
							System.out.println("");
							System.out.println("---------------------------------------------------");
							
							System.out.print("Nome do Livro: ");
							input.nextLine();
							name = input.nextLine();
							System.out.print("Autor: ");
							author = input.nextLine();
							System.out.print("Editora: ");
							publishingCompany = input.nextLine();
							System.out.print("Idioma: ");
							language = input.nextLine();
							System.out.print("Descrição: ");
							description = input.nextLine();
							System.out.print("Quantidade: ");
							quantity = input.nextInt();
						
							listBooks.add(new Book(name, author, publishingCompany, language, description, quantity));
							
							listBooks.get(bookCounter).view();
							
							bookCounter += 1;
						}
						else if(book == 0) {
							
						}
						
						loop2 = false;
					} catch(ArrayIndexOutOfBoundsException e) {
						System.err.println("===================================================");
						System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
						System.err.println("===================================================");
						input.nextLine();
					} catch(IndexOutOfBoundsException e) {
						System.err.println("===================================================");
						System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
						System.err.println("===================================================");
						input.nextLine();
						
					} catch (InputMismatchException e ) {
						System.err.println("===================================================");
						System.err.println("	DIGITE APENAS NÚMEROS");
						System.err.println("===================================================");
						input.nextLine();
					}
				} while(book != 0 || loop2);
				
				break;
			case 3:
				
				int loanBooks = -3;
				boolean loop3 = true;
				do {
					
					try {
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.println("	[1] Novo Registro");
						System.out.println("	[0] Menu Inicial");
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.print("Digite uma opção: ");
						loanBooks = input.nextInt();	
						System.out.println("___________________________________________________");
						
						if(loanBooks == 1) { 
							
							int RAL;
							String bookId;
							int bookIndex;
							
							System.out.println("___________________________________________________");
							System.out.println("");
							System.out.println("	PREENCHA TODOS OS CAMPOS INFORMADOS!");
							System.out.println("");
							System.out.println("---------------------------------------------------");

							System.out.println("");
							System.out.print("R.A do Aluno: ");
							RAL = input.nextInt();
							
							int studentIndex = Student.searchUser(listStudent, RAL);
							Student student = listStudent.get(studentIndex);
							
							if(studentIndex > -1) {
								
								if(student.getPendencies().isEmpty()) {
									
									System.out.print("Id do Livro: ");
									input.nextLine();
									bookId = input.nextLine();
									System.out.println("");
									
									bookIndex = Book.searchBook(listBooks, bookId);
									Book a = listBooks.get(bookIndex);
									
									if(bookIndex != -1) {
										Book.loan(bookIndex, listBooks);
										pendenciesStudents.add(student);
										student.setPendencies(a);
										
									}
									else {
										System.out.println("===================================================");
										System.out.println("	LIVRO NÃO LOCALIZADO!");
										System.out.println("===================================================");
									}
								}
								else {
									System.out.println("===================================================");
									System.out.println("	VOCÊ POSSUI PENDÊNCIAS!");
									System.out.println("===================================================");
									//listBooks.get(bookIndex).view();
								}
							}
							else if(studentIndex == -1 || studentIndex == -2 ) {
								System.out.println("===================================================");
								System.out.println("	O REGISTRO DO ALUNO NÃO FOI LOCALIZADO!");
								System.out.println("===================================================");
							}
						}
						else if(loanBooks == 0) {
							
						}
						
						loop3 = false;
					} catch(ArrayIndexOutOfBoundsException e) {
						System.err.println("===================================================");
						System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
						System.err.println("===================================================");
						input.nextLine();
					} catch(IndexOutOfBoundsException e) {
						System.err.println("===================================================");
						System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
						System.err.println("===================================================");
						input.nextLine();
						
					} catch (InputMismatchException e ) {
						System.err.println("===================================================");
						System.err.println("	DIGITE APENAS NÚMEROS");
						System.err.println("===================================================");
						input.nextLine();
					} 

				} while (loanBooks != 0 || loop3);

				break;
			case 4:
				
				int retBooks = -3;
				boolean loop4 = true;
				
				do {
					
					try {
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.println("	[1] Novo Registro");
						System.out.println("	[0] Menu Inicial");
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.print("Digite uma opção: ");
						retBooks = input.nextInt();	
						System.out.println("___________________________________________________");
						
						if(retBooks == 1) {
							
							if(pendenciesStudents.size() == 0) {
								
								System.out.println("===================================================");
								System.out.println("	NÃO POSSUI PENDÊNCIAS!");
								System.out.println("===================================================");
							}
							else {
								int RAD;
								String bookIdD;
								int bookIndexD;

								System.out.println("___________________________________________________");
								System.out.println("");
								System.out.println("	PREENCHA TODOS OS CAMPOS INFORMADOS!");
								System.out.println("");
								System.out.println("---------------------------------------------------");

								System.out.println("");
								System.out.print("R.A do Aluno: ");
								RAD = input.nextInt();
								
								int studentIndexD = Student.searchUser(listStudent, RAD);
								Student studentD = listStudent.get(studentIndexD);
								
								if(studentIndexD > -1) {
									
									if(studentD.getPendencies().isEmpty()) {
										System.out.println("");
										System.out.println("===================================================");
										System.out.println("	NÃO POSSUI PENDÊNCIAS!");
										System.out.println("===================================================");
									}
									else {
										
										System.out.print("Id do Livro: ");
										input.nextLine();
										bookIdD = input.nextLine();
										System.out.println("");
										
										bookIndexD = Book.searchBook(listBooks, bookIdD);
										Book aD = listBooks.get(bookIndexD);
										
										if(bookIndexD != -1) {
											Book.devolution(bookIndexD, listBooks);
											studentD.getPendencies().remove(aD);
											pendenciesStudents.remove(studentD);
										}
										else {
											System.out.println("===================================================");
											System.out.println("	LIVRO NÃO LOCALIZADO!");
											System.out.println("===================================================");
										}
									}
								}
								else if(studentIndexD == -1 ) {
									System.out.println("===================================================");
									System.out.println("	O REGISTRO DO ALUNO NÃO FOI LOCALIZADO!");
									System.out.println("===================================================");
								}
							}
						}
						else if(retBooks == 0) {
							
						}
						loop4 = false;
					} catch(ArrayIndexOutOfBoundsException e) {
						System.err.println("===================================================");
						System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
						System.err.println("===================================================");
						input.nextLine();
					} catch (InputMismatchException e ) {
						System.err.println("===================================================");
						System.err.println("	DIGITE APENAS NÚMEROS");
						System.err.println("===================================================");
						input.nextLine();
					}

				} while(retBooks != 0 || loop4);

				break;
				
			case 5:
				
				try {
					
					if(pendenciesStudents.isEmpty()) {
						
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.println("===================================================");
						System.out.println("	LISTA VAZIA! SEM DEVOLUÇÕES PENDENTES");
						System.out.println("===================================================");
						System.out.println("");
					}
					else {

						List<Book> books;
						int index;
						
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.println("	DEVOLUÇÕES PENDENTES: ");
						System.out.println("");
						System.out.println("---------------------------------------------------");
						
						for(Student i : pendenciesStudents) {

							System.out.println("Qtd. de itens: " + pendenciesStudents.size());
							System.out.println("");
							System.out.println("R.A: " + i.getRa());
							System.out.println("Nome do Usuário: " + i.getName());
							books = i.getPendencies();
							
							for(Book c : listBooks) {
								index = books.indexOf(c);
								
								System.out.println("Id do Livro: " + books.get(index).getId());
								System.out.println("Nome do Livro: " + books.get(index).getName());
								System.out.println("");
							}
						}
					}

				} catch(ArrayIndexOutOfBoundsException e) {
					System.err.println("===================================================");
					System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
					System.err.println("===================================================");
					input.nextLine();
					
				} catch (Exception e ) {
					System.err.println("===================================================");
					System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
					System.err.println("===================================================");
					input.nextLine();
				}

				break;
				
			case 6:
				
					try {
						
						System.out.println("___________________________________________________");
						System.out.println("");
						System.out.println("	LIVROS CADASTRADOS: ");
						System.out.println("");
						System.out.println("---------------------------------------------------");
						System.out.println("");
						System.out.println("Qtd. de itens: " + listBooks.size());
						
						for(Book i : listBooks) {
							
							System.out.println("");
							System.out.println("Id do Livro: " + i.getId());
							System.out.println("Nome: " +i.getName());
							System.out.println("Autor: " +i.getAuthor());
							System.out.println("Editora: " +i.getPublishingCompany());
							System.out.println("Idioma: " +i.getLanguage());
							System.out.println("Descrição: " +i.getDescription());
							System.out.println("Quantidade: " +i.getQuantity());
							System.out.println("");
						}
						
					} catch(ArrayIndexOutOfBoundsException e) {
						System.err.println("===================================================");
						System.err.println("ALGO OCORREU ERRADO! TENTE NOVAMENTE MAIS TARDE");
						System.err.println("===================================================");
						input.nextLine();
						
					} catch (InputMismatchException e ) {
						System.err.println("===================================================");
						System.err.println("	DIGITE APENAS NÚMEROS");
						System.err.println("===================================================");
						input.nextLine();
					}

				break;
			case 0:
				System.out.println("___________________________________________________");
				System.out.println("");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				System.out.println("");
				System.out.println("	SISTEMA ENCERRANDO... Até mais!");
				System.out.println("");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				break;
			default:
				System.out.println("===================================================");
				System.out.println("		OPÇÃO INVÁLIDA!");
				System.out.println("===================================================");
				System.out.println("");
				System.out.println("Por favor, digite uma das opções indicadas no menu");
				System.out.println("");
				break;
			}
		} while(option != 0);

	}
	
	public static void viewMenu() {
		System.out.println(" ");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("");
		System.out.println("	BIBLIOTECA PROFª SELMA");
		System.out.println("");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println(" ");
		System.out.println("Bem vindo(a) + data e hora");
		System.out.println("");
		System.out.println("	[1] Cadastro de Usuário ");
		System.out.println("	[2] Cadastro de Livros ");
		System.out.println("	[3] Emprestimo de Livros ");
		System.out.println("	[4] Devolução de Livros ");
		System.out.println("	[5] Devoluções Pendentes ");
		System.out.println("	[6] Livros Cadastrados ");
		System.out.println("	[0] Sair ");
		System.out.println("___________________________________________________");
		System.out.println("");
		System.out.print("Digite umas das opções acima: ");
	}	
}
