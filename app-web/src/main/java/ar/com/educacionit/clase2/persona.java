package ar.com.educacionit.clase2;

public class persona {
	//atributos de clase
	static int cantidadOjos = 2;
	
	//atributos de instancia
	String nombre;
	
	//constructor x defecto
	
	persona(){
		
	}

	//Constructor String
	
	persona(String nombre){
		this.nombre = nombre;
				
	}
	
	// metodos
	
	String saludar() {
		String saludo = "hola soy " + this.nombre + " mucho gusto";
		return saludo;
	
}
}