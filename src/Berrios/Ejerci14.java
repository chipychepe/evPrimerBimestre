package Berrios;

import java.util.Scanner;

public class Ejerci14 {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);

		boolean pagoEntrada = false;
		int edad;

		System.out.println("ingrese su edad");
		edad = ingreso.nextInt();

		if (edad >= 18) {

			if (pagoEntrada) {
				System.out.println("Podés ingresar");
			} else {
				System.err.println("No pagaste. No podes ingresar");
			}

		} else {
			System.out.println("Sos menor. No podes ingresar");
		}

	}

}
