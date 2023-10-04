package tarea10;

import java.util.Scanner;

public class Tarea10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double sum_de_ventas = 0.0;
		
		System.out.println("Inroduce el numero de ventas");
		int numero_de_ventas = scanner.nextInt();
		System.out.println("el numero de ventas que has hecho es " + numero_de_ventas);
		
		for(int i = 1; i <= numero_de_ventas; i++) {
			
			System.out.println("Introduce el precio de cada venta");
			double precio_de_ventas = scanner.nextDouble();
			
			double total_ventas = sum_de_ventas+=precio_de_ventas;
			System.out.println("el total de todas las ventas es " + total_ventas);
			
		}
		
        scanner.close();
	 }

}
