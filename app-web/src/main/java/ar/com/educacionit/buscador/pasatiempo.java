package ar.com.educacionit.buscador;

public class pasatiempo extends Articulo {
	private String pasatiempo;

	public String getPasatiempo() {
		return pasatiempo;
	}

	public void setPasatiempo(String pasatiempo) {
		this.pasatiempo = pasatiempo;
	}

	public pasatiempo(String pasatiempo) {
		super();
		this.pasatiempo = pasatiempo;
	}
}
