package com.alvaro.dam.tema1.Ejercicios;
import java.util.Scanner;

//4.	Dibuja un ordinograma que lea dos números, calcule y muestre 
//el valor de sus suma, resta, producto y división.
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		double solucion;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Introduce el primer numero");
		num2 = entrada.nextInt();
		entrada.close();
		solucion = num1 + num2;
		System.out.println("La suma de " + num1 + " + " + num2 + " = " + solucion);
		solucion = num1 - num2;
		System.out.println("La resta de " + num1 + " - " + num2 + " = " + solucion);
		solucion = num1 * num2;
		System.out.println("El producto es " + num1 + " * " + num2 + " = " + solucion);
		solucion = num1 / num2;
		System.out.println("La divisoin de " + num1 + " / " + num2 + " = " + solucion);
	}

}
