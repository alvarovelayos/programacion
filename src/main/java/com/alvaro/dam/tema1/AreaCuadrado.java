package com.alvaro.dam.tema1;

import java.util.Scanner;

public class AreaCuadrado {

	public static void main(String[] args) {
		
		double lado;
		double area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el lado del cuadrado");
		lado = entrada.nextDouble();
		entrada.close();
		
		area = lado * lado;
		System.out.println("El area del cuadro es: " + area);
		
		
		
		

	}

}
