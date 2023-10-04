package tarea11;
import java.util.Scanner;

public class Tarea11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Es un dia laboral? Escribe el dia para saberlo");
		
		String introduced_day = scanner.nextLine().toLowerCase();
		
		boolean esDiaLaboral;
		
		switch (introduced_day) {
        case "lunes":
        case "martes":
        case "miércoles":
        case "miercoles":
        case "jueves":
        case "viernes":
        	esDiaLaboral = true;
            break;
        case "sábado":
        case "sabado":
        case "domingo":
        	esDiaLaboral = false;
            break;
        default:
        	esDiaLaboral = false; 
            break;
    }
		if(esDiaLaboral == true) {
			System.out.println("Siii, es un dia laboral");
		}
		else {System.out.println("Noo, no es un dia laboral");}
		
		scanner.close();
	 }

}
