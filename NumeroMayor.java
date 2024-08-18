package ep1;

import java.util.Scanner;

public class NumeroMayor {

    public static int obtenerMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mayor = obtenerMayor(numero1, numero2);

        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}