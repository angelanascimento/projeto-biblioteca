package library;

import java.util.List;
import java.util.UUID;

public class Book {
	
	private UUID id = UUID.randomUUID();
	private String name;
	private String author;
	private String publishingCompany;
	private String language;
	private String description;
	private int quantity;

	public Book(String name, String author, String publishingCompany, String language, String description, int quantity) {
		this.name = name;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.language = language;
		this.description = description;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book() {
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void view() {
		System.out.println("___________________________________________________");
		System.out.println("");
		System.out.println("	CADASTRO EFETUADO COM SUCESSO!");
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("Informações resgitradas:");
		System.out.println("");
		System.out.printf("Id: %s\n", getId());
		System.out.printf("Nome do Livro: %s\n", getName());
		System.out.printf("Autor: %s\n", getAuthor());
		System.out.printf("Editora: %s\n", getPublishingCompany());
		System.out.printf("Idioma: %s\n", getLanguage());
		System.out.printf("Descrição: %s\n", getDescription());
		System.out.println("");
	}
	
	public static void loan(int bookIndex, List<Book> listBooks) {

		Book book = listBooks.get(bookIndex);
		System.out.println("===================================================");
		System.out.println("	EMPRESTIMO REGISTRADO EM SISTEMA!");
		System.out.println("===================================================");
		//DATA DO EMPRESTIMO
		book.setQuantity(book.quantity - 1);
		//INSERIR NA LISTA DE LIVROS EMPRESTADOS
		//E INSERIR O LIVRO NA LISTA DE PENDÊNCIA DO USUARIO
	}
	
	public static void devolution(int bookIndex, List<Book> listBooks) {
		
		Book book = listBooks.get(bookIndex);
		
		System.out.println("===================================================");
		System.out.println("	DEVOLUÇÃO REGISTRADA EM SISTEMA!");
		System.out.println("===================================================");
		//DATA DA DEVOLUÇÃO
		book.setQuantity(book.quantity + 1);
	}
	
	public static int searchBook(List<Book> listBooks, String id) {
		
		int response = 0;
		
		if(listBooks.isEmpty()) {
			response =  -2; //LISTA VAZIA
		}
		else {
			for(int i = 0; i < listBooks.size(); i++ ) {
				
				String bookId = listBooks.get(i).getId().toString();
				if(bookId.equals(id)) {
					response = i;
				}
				else {
					response = -1; // ID NÃO ENCONTRADO
				}
			}
		}
		return response;
	}

}
