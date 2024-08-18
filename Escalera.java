package ep1;

import java.util.Scanner;

public class Escalera {

    public static class InformacionEscalera {
        private double altura;
        private double angulo;

        public InformacionEscalera(double altura, double angulo) {
            this.altura = altura;
            this.angulo = angulo;
        }

        public double getAltura() {
            return altura;
        }

        public double getAngulo() {
            return angulo;
        }

        public double calcularLongitud() { // Method to calculate length within the class
            double anguloRadianes = Math.toRadians(angulo);
            return altura / Math.sin(anguloRadianes);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura que alcanza la escalera en la pared (x): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el ángulo de inclinación de la escalera (en grados): ");
        double angulo = scanner.nextDouble();

        InformacionEscalera escalera = new InformacionEscalera(altura, angulo); // Create an object

        double longitudEscalera = escalera.calcularLongitud(); // Call method from the object

        System.out.println("La longitud de la escalera es: " + longitudEscalera);

        scanner.close();
    }
}