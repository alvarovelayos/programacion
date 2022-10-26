package com.alvaro.dam.tema1.Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
	//3.	Dibuja un ordinograma que calcule el área 
	//de un cuadrado cuyo lado se introduce por teclado.
	
		public static void main(String[] args) {
				
			float areaCuadrado, lado;
				 
				 Scanner entrada = new Scanner(System.in);
				 
				 System.out.print("Introduce el lado: ");
				 
				 lado = entrada.nextFloat();
				 
				 areaCuadrado = lado * lado;
				 
				 System.out.println("El área del cuadrado es " + areaCuadrado);
		}

	}