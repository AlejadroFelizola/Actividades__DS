package ep1;

import java.util.Scanner;

public class NumeroRomanos {
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    public static String unidadARomano(int unidad) {
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return romanos[unidad];
    }

    public static String decenaARomano(int decena) {
        String[] romanos = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        return romanos[decena];
    }

    public static String convertirARomano(int numero) {
        if (numero < 1 || numero > 99) {
            return "Número fuera de rango (1-99)";
        }

        int decenas = obtenerDecenas(numero);
        int unidades = obtenerUnidades(numero);

        return decenaARomano(decenas) + unidadARomano(unidades);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        String numeroRomano = convertirARomano(numero);
        System.out.println("El número romano equivalente es: " + numeroRomano);

        scanner.close();
    }
}

