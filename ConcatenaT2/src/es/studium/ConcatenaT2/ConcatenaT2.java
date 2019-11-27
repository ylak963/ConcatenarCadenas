package es.studium.ConcatenaT2;

import java.util.Scanner;

public class ConcatenaT2 {
	
	public static void main(String[] args) {
		
		String cadena1;
		String cadena2;
		String union;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una cadena:");
		cadena1=teclado.next();
		System.out.println("Introduce otra cadena:");
		cadena2=teclado.next();
		
		union=cadena1+" "+cadena2;
		System.out.println(union);
		// Otra forma--> System.out.println(String.format("La cadena \"%s\" concatenada con la cadena \"%s\" resulta
		//\"%s\"",cadena1,cadena2,cadena3));
		teclado.close();
		
	}

}
