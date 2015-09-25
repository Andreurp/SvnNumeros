package E1;

import java.util.Scanner;

public class App {

	private static Scanner llagir;

	public static void main(String[] args) {
		int nombre1, nombre2, patit=0;
		System.out.println ("Escriu 5 numeros");
		llagir = new Scanner(System.in);
		nombre1 = llagir.nextInt();
		
		for (int i=1; i<5; i++){
			nombre2 = llagir.nextInt();
				if (nombre1>nombre2){
					patit = nombre2;
					nombre1 = patit;
				}
		}
		System.out.println ("El numero mes patit es: " + patit);
		
	}

}
