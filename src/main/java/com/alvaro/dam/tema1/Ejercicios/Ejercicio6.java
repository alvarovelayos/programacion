package com.alvaro.dam.tema1.Ejercicios;
import java.util.Scanner;
//6.	Dibuja un ordinograma que dado el precio de un artículo 
//y el precio de venta real nos muestre el porcentaje de descuento realizado.
public class Ejercicio6 {

	public static void main(String[] args) {
	
		double precioArticulo;
		double precioVentaReal;
		double descuento;
		double porcentaje;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el precio del articulo");
		precioArticulo = entrada.nextDouble();
		System.out.println("Introduce el precio con descuento");
		precioVentaReal = entrada.nextDouble();
		
		descuento = precioArticulo - precioVentaReal;
		porcentaje = (descuento * 100) / precioArticulo; 
		
		System.out.println("Precio articulo sin descuentro: " + precioArticulo);
		System.out.println("Precio articulo con descuento: " + precioVentaReal);
		System.out.println("El porcentaje del articulo es: " + porcentaje + " % ");
		
	}
}
