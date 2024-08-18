package ep1;

import java.util.Scanner;

public class Calculadora {

    public static double realizarOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return (double) num1 / num2; 
            case "%":
                return num1 % num2;
            case "**":
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Operador no válido");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = scanner.next();

        try {
            double resultado = realizarOperacion(num1, num2, operador);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Operador no válido");
        }

        scanner.close();
    }
}


