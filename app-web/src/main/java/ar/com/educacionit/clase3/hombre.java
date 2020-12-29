package ar.com.educacionit.clase3;

public class hombre extends Humano {
		
	public static boolean nuez = true;
	private boolean futbolero;

	public boolean isFutbolero() {
		return futbolero;
	}

	public void setFutbolero(boolean futbolero) {
		this.futbolero = futbolero;
	}

	public hombre(String nombre, String apellido, String nacionalidad) {
		super(nombre, apellido, nacionalidad);
		
		
	}

}
