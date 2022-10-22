package com.alvaro.dam.tema1;

public class Suma {
	public static void main(String[] args) {
	
		double num1= 25;
		double num2= 5;
		double suma;
		double potencia;
		double raiz;
		
		suma = num1 + num2;
		potencia = Math.pow(num1, num2);
		System.out.println("La suma de " + num1 + " y " + num2 + "es " + suma);
		System.out.println("el numero "+ num1 + " elevado a " + num2 + " es " + potencia);
		raiz = Math.sqrt(num1);
		System.out.println("la raiz cuadrada de el numero "+ num1+ " es "+ raiz);
	}
	
	
}
