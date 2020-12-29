package ar.com.educacionit.clase2;

public class MainClase2 {

	public static void main(String[] args) {
	
		// crear dos objetos de la clase clase2
		
		Auto clioRojo = new Auto("rojo", 123456, 250);
		
		
		//atributo de clase
		clioRojo.arrancar();
		
		while(clioRojo.puedaAcelerar()) {
		clioRojo.acelerar();
		clioRojo.frenar();
		}
		System.out.println(clioRojo.velocidadActual);
	}

}
