package com.alvaro.dam.tema1.Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
	//3.	Dibuja un ordinograma que calcule el área 
	//de un cuadrado cuyo lado se introduce por teclado.
	
		public static void main(String[] args) {
			
			int lado;
			int area;
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el lado del cuadrado");
			lado = entrada.nextInt();
			entrada.close();
			area = (int) Math.pow(lado, 2);
			System.out.println("El area del cuadro es:" + area);

		}

	}