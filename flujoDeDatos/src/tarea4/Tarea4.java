package tarea4;
import java.util.Scanner;

public class Tarea4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Hello");
		System.out.println("Enter the value of your radius");
		
		String radius = scanner.nextLine();
		double double_radius = Double.parseDouble(radius);
		
		
		double areaOfaCircle = Math.PI*(double_radius * double_radius);
		
		System.out.println("The area of a circle with radius " + double_radius + " is " + areaOfaCircle);
		
		
		scanner.close();
	 }

}
