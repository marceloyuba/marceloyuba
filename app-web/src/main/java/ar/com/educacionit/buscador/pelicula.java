package ar.com.educacionit.buscador;

public class pelicula extends Articulo {
	//alt+shift+s
private String productora;

	public pelicula(String productora) {
		super(String autor);
		this.productora = productora;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

}
