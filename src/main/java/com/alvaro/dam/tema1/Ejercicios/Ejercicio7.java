package com.alvaro.dam.tema1.Ejercicios;
import java.util.Scanner;

//7.	Dibuja un ordinograma que lea un valor correspondiente a una distancia en millas marinas 
//y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.

public class Ejercicio7 {
	public static void main(String[] args) {
	
		double millas = 1852;
		double metros;
		double distancia;
		
		System.out.println("Introduce una distancia en millas marinas");
		Scanner entrada = new Scanner(System.in);
		
		distancia = entrada.nextDouble();
		entrada.close();
		
		metros = distancia * millas;
		
		System.out.println("La distancia en metros de " + distancia + " millas " + " es igual " + metros + " metros ");
	}
	
	
	
}
