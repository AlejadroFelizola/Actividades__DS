package ep1;

import java.util.Scanner;

public class FuncionXY {

    public static class Funcion {
        private double x;
        private double y;

        public Funcion(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double calcularValor() {
            return x * x + 2 * x * y + y * y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de y: ");
        double y = scanner.nextDouble();


        Funcion funcion = new Funcion(x, y); 
        double resultado = funcion.calcularValor(); 

        System.out.println("El valor de f(" + x + ", " + y + ") es: " + resultado);

        scanner.close();
    }
}