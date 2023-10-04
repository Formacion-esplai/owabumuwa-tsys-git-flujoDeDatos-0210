package tarea12;
import java.util.Scanner;

public class Tarea12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hola! introduce la cotraseña");
		
		
		
		for(int i=0; i<3; i++) {
			String password = scanner.nextLine();
			
			if(password.equals("mypass")) {
				System.out.println("Enhorabuena");
				break;
			}
		
			else if((password != "mypass") && (i<2)){
				System.out.println("No! Intentar otra vez");
			}
			else {System.out.println("Lo siento, ya no puedes intentar");}
			
		}
		scanner.close();
	 }


}
