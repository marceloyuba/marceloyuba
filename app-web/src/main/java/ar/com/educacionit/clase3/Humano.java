package ar.com.educacionit.clase3;

public class Humano {

	protected String nombre;	
	protected String apellido;
	protected String nacionalidad;
	//si una clase tiene un constructor q no es por defecto
	//entonces las clases hijas deberan implementar minimamente ese dicho constructor
	public Humano(String nombre, String apellido, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	private void ladrar() {
		//syso + ctrl + space
		System.out.println("un humano ladrando??");
	}
	
	public void caminar() {
		System.out.println("Camina el humano");
	}
	protected void cantar() {
		System.out.println("Canta el humano");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
