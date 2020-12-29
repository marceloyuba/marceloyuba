package ar.com.educacionit.clase3;

public class MainHumano {

	public static void main(String[] args) {
		//1-forma
		//padre p = new hija()
		
		Humano padre = new Mujer("Daniela", "Tatangelo", "Argentina");
		//metodos q son de humano
		padre.getApellido();
		padre.getNombre();
		padre.getNacionalidad();
		
		
		//Casteo
		
		Mujer mujer = (Mujer)padre;
		
		//metodos q son de mujer
		
		mujer.setColorDePelo("Negro");
		
		//cambio de referencia interna
		padre = new hombre (mujer.getNombre(), mujer.getApellido(), mujer.getNacionalidad());
        hombre hombre = (hombre) padre;
        hombre.setFutbolero(true);
		
		
		
		
		System.out.println("La humana se llama " + padre.getApellido() + " " + padre.getNombre() + " " + " y es de nacionalidad " + padre.getNacionalidad());
}
}