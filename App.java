package E1;

import java.util.Scanner;

public class App {

	private static Scanner llagir;

	public static void main(String[] args) {
		int nombre1, nombre2, patit, gran;
		
		System.out.println ("Escriu 5 numeros");
		llagir = new Scanner(System.in);
		nombre1 = llagir.nextInt();
		patit = nombre1;
		gran = nombre1;
		for (int i=1; i<10; i++){
			nombre2 = llagir.nextInt();
				if (patit>nombre2){
					patit = nombre2;
				}
				if (gran<nombre2) {
					gran = nombre2;
				}
		}
		System.out.println ("El numero mes patit es: " + patit);
		System.out.println ("El numero mes gran es: " + gran);
	}

}
//hola
