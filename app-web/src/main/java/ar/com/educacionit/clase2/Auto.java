package ar.com.educacionit.clase2;

public class Auto {
	
	//atributos
	int anio;
	String color;
	long chasis;
	String patente;
	boolean encedido;
	float velocidadActual;
	float velocidadMaxima;
	
	// constructor
	Auto(String color, long chasis){
		this.color = color;
		this.chasis = chasis;
		
	}
	Auto(String color, long chasis, float velocidadMaxima){
		this.color = color;
		this.chasis = chasis;
		this.velocidadActual  = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
	// metodos
	
		void patentar(String nuevaPatente){
			this.patente = nuevaPatente;
			System.out.println("Se ha patentado el auto");
		}
		
		void arrancar() {
			if(!this.encedido) {
				this.encedido = true;
			}
				else {
				System.out.println("El auto esta encendido");
			}
		this.encedido = true;
		}
		void acelerar() {
			if(this.encedido) {
				if(this.velocidadActual < this.velocidadMaxima) {
					this.velocidadActual++;
				}
				else {
					System.out.println("Velocidad maxima, no se puede acelerar");
				}
			}
}
		void apagar() {
			if(this.encedido) {
				this.velocidadActual =0;
				this.encedido = false;
				
		}
			else {
				System.out.println("El auto se encuentra apagado");
			}
		}
		
		boolean puedaAcelerar() {
			boolean puedeAcelerar = false;
			if(this.encedido) {
			puedeAcelerar = this.velocidadActual < this.velocidadMaxima;
			}
			return puedeAcelerar;
			
		}
		
		boolean frenar();
		
		
		
		
		
		
		
		
}