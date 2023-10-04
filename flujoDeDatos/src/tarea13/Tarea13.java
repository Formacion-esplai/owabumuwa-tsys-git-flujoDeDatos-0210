package tarea13;
import java.util.Scanner;

public class Tarea13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola! Vamos a introducir 2 numeros y un signo para hacer una operacion matematica");
        
        System.out.println("Introduce el primer número");
        double first_number = scanner.nextInt();

        System.out.println("Introduce el signo");
        char math_sign = scanner.next().charAt(0);

        System.out.println("Introduce el segundo numero");
        double second_number = scanner.nextInt();

        double resultado_function = doTheMath(first_number, math_sign, second_number);
        System.out.println(first_number + " " + math_sign + " " + second_number + " = " +  resultado_function);
        
        scanner.close();
    }

    public static double doTheMath(double num1, char operator, double num2) {
        double resultado = 0;
        switch (operator) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':              
                resultado = num1 / num2;
                break;
            case '^':
                resultado = (double) Math.pow(num1, num2); 
                break;
            case '%':
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operador no válido.");
        }
        return resultado;
    }
}

