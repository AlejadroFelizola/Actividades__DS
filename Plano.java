package ep1;

import java.util.Scanner;

public class Plano {

    public static class Punto {
        double x;
        double y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static double calcularDistancia(Punto punto1, Punto punto2) {
        return Math.sqrt(Math.pow(punto2.y - punto1.y, 2) + Math.pow(punto2.x - punto1.x, 2));
    }

    public static double calcularPendiente(Punto punto1, Punto punto2) {
        if (punto2.x - punto1.x == 0) {
            
            return Double.POSITIVE_INFINITY;
        } else {
            return (punto2.y - punto1.y) / (punto2.x - punto1.x);
        }
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        Punto punto1 = new Punto(x1, y1);
        Punto punto2 = new Punto(x2, y2);

        double distancia = calcularDistancia(punto1, punto2);
        double pendiente = calcularPendiente(punto1, punto2);

        System.out.println("La distancia entre los puntos es: " + distancia);
        System.out.println("La pendiente de la recta es: " + pendiente);

        scanner.close();

    }
}