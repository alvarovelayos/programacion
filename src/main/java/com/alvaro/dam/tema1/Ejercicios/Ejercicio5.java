package com.alvaro.dam.tema1.Ejercicios;

import java.util.Scanner;
//5.	Dibuja un ordinograma que toma como dato de entrada un número que corresponde 
//a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo 
//y el volumen de la esfera que corresponden con dicho radio.
public class Ejercicio5 {

	public static void main(String[] args) {
	
		double radio;
		double longitudCircunferencia;
		double area;
		double volumen;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el radio de la circunferencia");
		
		radio = entrada.nextDouble();
		entrada.close();
		longitudCircunferencia = 2 * Math.PI * radio;
		System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
		
		area = Math.PI * Math.pow(radio,2 );
		System.out.println("El area del circulo es: " + area);
		
		volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
		System.out.println("El volumen de la esfera es: " + volumen);
	}

}

