package com.alvaro.dam.tema1.Ejercicios;

public class Ejercicio8b {

	public static void main (String[] args) {
	//El operador condicional ternario es ?:
	//funciona como un if else
	// https://decodigo.com/java-operador-ternario
	int i = 1;
	 int j = 2;
	 int numeroMayor = 0;
	 /*if (i > j) {
	 numeroMayor = i;
	 } else {
	 numeroMayor = j;
	 }
	 System.out.println("numeroMayor: " + numeroMayor);*/
	 
	 //Es lo mismo que
	 System.out.println("Utilizando el operador ternario ?:");
	 numeroMayor = i > j ? i : j;
	 System.out.println("numeroMayor: " + numeroMayor);
	}
}
