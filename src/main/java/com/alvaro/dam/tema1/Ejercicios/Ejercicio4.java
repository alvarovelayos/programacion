package com.alvaro.dam.tema1.Ejercicios;
import java.util.Scanner;

//4.	Dibuja un ordinograma que lea dos números, calcule y muestre 
//el valor de sus suma, resta, producto y división.
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		int solucion;
		
		//utilizamos la clase Scanner, y lo primero es Instanciar la clase
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce el primer número:"); 
		//Para leer los numeros utilizamos el metodo .nextInt(),
		//es el metodo que nos devuelve lo que recoje de teclado en formato
		//de numero entero. Si no puede convertilo devuelve un error.
		num1 = numero.nextInt();
		 
		System.out.println("Introduce el segundo número:");
		num2 = numero.nextInt();
		System.out.println("Escribe suma resta y multiplicaion \n");
		solucion = num1 + num2;
		System.out.println("la suma de "+num1+" más " + num2+ " es: " + solucion);
		solucion = num1 - num2;
		System.out.println("la resta de "+num1+" menos " + num2+ " es: " + 
		solucion);
		solucion = num1 * num2;
		System.out.println("la multiplicación de " +num1 + " y "+ num2 +" es: " + solucion);
		solucion = num1 / num2;
		System.out.println("la división de " +num1 + " y "+ num2 +" es: " + solucion);


	}
}
