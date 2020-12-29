package ar.com.educacionit.buscador;

public class Buscadorlibro extends Buscador {
public Buscadorlibro(String claveBusqueda) {
	super (claveBusqueda);
}
protected void buscar() {
	String sql="select * from libro where titulo like % " + this.getClaveBusqueda() + "%";
	System.out.println("Ejecutando sql; " + sql);
}
Articulo articulo = new Libro(1L, "Tony", "slott", "dan", 760f);
}
