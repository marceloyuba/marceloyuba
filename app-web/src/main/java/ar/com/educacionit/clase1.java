package ar.com.educacionit;

public class clase1 {
	
	public static void main(String[] args) {
		
		// variables
		//numericas
		//byte < short < int < long < float < double
		
		//boolean : true o false
		// char "a"
		
		//String nombre = "carlos"
		
		/* operadores 
		++ -- *= -=
		logicos: and &&; or ||; xor , nor !
		aritmeticos: + - * / 
		=
		relacionales == != <>
		*/
		
		//Estructuras if, for, while, do while
		
		// 3 notas menor, mayor, pmin, pmay, promedio
		// suma de los menores
	
	int nota1;
	int nota2;
	int nota3;
	int sumaMenores=0;
	int restaMayores;
	boolean iguales;
	byte pMenor;
	byte pMayor;
	float promedio;
	int menor = 0;
	int mayor = 0;
	nota1 = 5;
	nota2 = 8;
	nota3 = 9;
	
	
	if((nota1 < nota2) && (nota1 < nota3)) {
		menor=nota1;
		pMenor = 1;
		
	}
	if(nota2< nota1 && nota2 < nota3) {
		menor = nota2;
		pMenor = 2;
	}
	if(nota3 < nota1 && nota3<nota2) {
		menor = nota3;
		pMenor = 3;
	}
	if((nota1 < nota2) && (nota1 < nota3)) {
		mayor=nota1;
		pMayor = 1;
	}
	if(nota2< nota1 && nota2 < nota3) {
		menor = nota2;
		pMayor = 2;
	}
	if(nota3 < nota1 && nota3<nota2) {
		menor = nota3;
		pMayor = 3;
	}
	promedio = nota1+nota2+nota3 / 3;
	sumaMenores = menor;
	restaMayores = mayor;
		
	iguales = (sumaMenores == restaMayores);

		System.err.println(menor);
		System.out.println(menor);
		System.err.println(mayor);	
		System.out.println(mayor);
		System.err.println(promedio);
		System.out.println(promedio);
		System.err.println(iguales);
		System.out.println(iguales);
	}

}
