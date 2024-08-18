package ep1;

import java.util.Scanner;

public class PaseoEscolar {

    public static class Viaje {
        private int numSillasPorBus;
        private int numEstudiantesGordos;
        private int numEstudiantesFlacos;

        public Viaje(int numSillasPorBus, int numEstudiantesGordos, int numEstudiantesFlacos) {
            this.numSillasPorBus = numSillasPorBus;
            this.numEstudiantesGordos = numEstudiantesGordos;
            this.numEstudiantesFlacos = numEstudiantesFlacos;
        }

        public int calcularBusesNecesarios() {
            int totalAsientos = 2 * numEstudiantesGordos + numEstudiantesFlacos;
            double busesNecesariosDouble = (double) totalAsientos / numSillasPorBus;
            return (int) Math.ceil(busesNecesariosDouble);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de sillas por bus: ");
        int numSillasPorBus = scanner.nextInt();

        System.out.print("Ingrese el número de estudiantes gordos: ");
        int numEstudiantesGordos = scanner.nextInt();

        System.out.print("Ingrese el número de estudiantes flacos: ");
        int numEstudiantesFlacos = scanner.nextInt();

        Viaje viaje = new Viaje(numSillasPorBus, numEstudiantesGordos, numEstudiantesFlacos);
        int busesNecesarios = viaje.calcularBusesNecesarios();

        System.out.println("Se necesitan " + busesNecesarios + " buses para el paseo.");

        scanner.close();
    }
}
