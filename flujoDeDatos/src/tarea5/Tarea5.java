package tarea5;
import java.util.Scanner;

public class Tarea5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero para determinar si es divisible por 2(un numero par)");
		
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Es un numero par!");
		}
		else{
			System.out.println("No es un numero par!");
		}
		scanner.close();
				
	 }

}
