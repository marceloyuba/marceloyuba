package ar.com.educacionit.buscador;

public abstract class Buscador {

	private String claveBusqueda;
	private int cantidadResultados;
	private Articulo[] resultados;
	
	public Articulo[] getResultados() {
		return resultados;
	}

	protected abstract void buscar();
	
	public Articulo buscarId(Long id) {
		Articulo Articulo = new Articulo (100L, "generico", "generico", 150f);
		return Articulo;
	}
	
	public String getClaveBusqueda() {
		return claveBusqueda;
	}
	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	public int getCantidadResultados() {
		return cantidadResultados;
	}
	public void setCantidadResultados(int cantidadResultados) {
		this.cantidadResultados = cantidadResultados;
	}
	
	
}
