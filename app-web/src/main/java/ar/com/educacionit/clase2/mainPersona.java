package ar.com.educacionit.clase2;

public class mainPersona {

	public static void main(String[] args) {
		
		//creo un objeto de la clase persona usando el constructor por defecto(sin argumentos)
		persona carlos = new persona();
		persona ana = new persona("Ana");
		
		//asignar un valor al atributo nombre del objeto carlos de la clase persona
		
		carlos.nombre ="Carlos";
		
		//Ejecutar/invocar un metodo del objeto carlos
		String saludoDeCarlos = carlos.saludar();
		System.out.println(saludoDeCarlos);
		System.out.println(ana.saludar());
		//invocar el atributo cantidad de ojos de la clase persona
		System.out.println(carlos.nombre + " - tiene " + persona.cantidadOjos + " ojos");
		//invocar el atributo de instancia cantidad ojos del objeto carlos
		System.out.println(ana.nombre + " - tiene " + ana.cantidadOjos + " ojos");
	}

}
