package ar.com.educacionit.clase3;

public class casteo {

	public static void main(String [] args) {
	
	
	//byte <short<int<long<float<double
	
	double altura = 175.62;
	
	//widening casting.....perdida de datos!!!
	
	float alturaF = (float)altura;
	
	long alturaL = (long)alturaF;
	
	int alturaI = (int)alturaL;
	
	short alturaS = (short)alturaI;
	
	byte alturaB = (byte)alturaS;
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
