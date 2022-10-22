package com.alvaro.dam.tema1;

import java.util.Scanner;

public class EntradaTecladoScanner {

	public static void main(String[] args) {
		
		String nombre;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");

		nombre = entrada.nextLine();
		System.out.println("Hola " + nombre);
	}

}
