package ar.com.educacionit.buscador;

public class Articulo {

		
		public Articulo(long id, String titulo, String autor, Float precio) {
			this.id = id;
			this.titulo = titulo;
			this.autor = autor;
			this.precio = precio;
		}
		private long id;
		private String titulo;
		private String autor;
		private Float precio;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public Float getPrecio() {
			return precio;
		}
		public void setPrecio(Float precio) {
			this.precio = precio;
		}
		
		
}
