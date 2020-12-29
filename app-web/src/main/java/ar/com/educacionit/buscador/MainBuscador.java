package ar.com.educacionit.buscador;

public class MainBuscador {

	public static void main(String[] args) {
		
		String claveBusquedaUsuario = "iron man";
		Buscador[] buscadores = new Buscador[2];
		Buscador buscadorlibro;
		buscadores[0] = buscadorlibro;
		buscadores[1] = new BuscadorPelicula(claveBusquedaUsuario);
		for(Buscador buscador:buscadores) {
			buscador.buscar();
			Articulo[] resulatados = buscador.getCantidadResultados();
			
			
		}

	}

}
