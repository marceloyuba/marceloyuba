package ar.com.educacionit.buscador;

public class Libro extends Articulo {
	private String isbn;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}

}
