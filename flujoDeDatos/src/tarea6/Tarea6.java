package tarea6;

import java.util.Scanner;

public class Tarea6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el precio del producto en $");
		
		int price = scanner.nextInt();
		double IVA = 21.0;
		
		double final_price = price + (price * (IVA / 100));
		
		System.out.println("El precio final con IVA es " + final_price + "$");
		
		scanner.close();
				
	 }
}
