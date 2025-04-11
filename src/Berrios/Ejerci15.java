package Berrios;

import java.util.Scanner;

public class Ejerci15 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		System.out.println("elegi entre las siguentes opciones");
		System.out.println("A: talle S");
		System.out.println("B: talle M");
		System.out.println("C: talle L");
		
		char opcSalir = datos.next().charAt(0);
		switch (opcSalir) {
		case 'a':
		case 'A':
			System.out.println("elegiste Talle S.");
			break;
		case 'b':
		case 'B':
			System.out.println("elegiste Talle M.");
			break;
		case 'c':
		case 'C':
			System.out.println("elegiste Talle L.");
			break;
			
		}
		
	}
	

}
