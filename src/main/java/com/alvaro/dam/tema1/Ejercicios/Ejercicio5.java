package com.alvaro.dam.tema1.Ejercicios;

import java.util.Scanner;
//5.	Dibuja un ordinograma que toma como dato de entrada un número que corresponde 
//a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo 
//y el volumen de la esfera que corresponden con dicho radio.
public class Ejercicio5 {

	public static void main(String[] args) {
		//Para hallar la circunferencia C=2*pi*r
		//oel área A=pi(r^2)
		// volumen de una esfera es V = 4/3 πr³
		double radio, area, circunferencia, volumen1;
		int volumen2;
		//Creamos un objeto de la clase Scanner
		//Scanner -> es la clase.
		//entrada -> es el nombre de la variable a la que le asignamos el objeto.
		//new -> palabra reservada que instancia un objeto de la clase Scanner.
		//System.in -> parámetro que indica de donde proceden los datos, en este caso del teclado.
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el radio: ");
		radio = entrada.nextDouble();
		//Hacemos uso de la librería Math para usar la constante PI
		area =Math.round (Math.PI * Math.pow(radio, 2));
		circunferencia = Math.round (2 * Math.PI * radio);
		volumen1 = ((4/3)*Math.PI*Math.pow(radio, 3));
		//cast un valor, la variable volumen es de tipo int, y el resultado de la operacion
		//es de tipo double, entonces convertimos el valor a int poniendo delante entre parentesis
		//int
		volumen2 = (int)((4/3)*Math.PI*Math.pow(radio, 3));
		System.out.println("El area es: " + area);
		System.out.println("La circunferencia es: "+ circunferencia);
		System.out.println("El volumen de la circunferencia es: "+ volumen1);
		System.out.println("El volumen de la circunferencia casteado es: "+ 
		volumen2);
	}
}

