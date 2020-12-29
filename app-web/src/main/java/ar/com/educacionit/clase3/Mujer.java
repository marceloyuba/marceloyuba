package ar.com.educacionit.clase3;

//Definir la clase mujer como una clase hija de humano

public class Mujer extends Humano{

	//atributos
	final static int ovarios = 2;
	private String colorDePelo;
	//Constructor de la clase mujer
	public Mujer(String nombre, String apellido, String nacionalidad) {
	
	//invocar al constructor del padre (humano)
	
		super(nombre, apellido, nacionalidad);
		
	}
	//get/set
	public void Colorpelo() {
	}
	public String getColorDePelo() {
		return colorDePelo;
	}
	public void setColorDePelo(String colorDePelo) {
		this.colorDePelo = colorDePelo;
	}
}