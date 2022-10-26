package com.alvaro.dam.tema1.Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
	int mayor;
	Scanner edad=new Scanner(System.in);
	System.out.println("Introduce tu edad");
	mayor=edad.nextInt();
	//si mayor o igual a 18 escribir eres mayor
	//Realizado con el operador ternario ?:
	System.out.println(mayor >= 18 ?"Eres mayor de edad" :"Eres menor de edad");
	}
}
