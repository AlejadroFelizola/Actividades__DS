package ep1;

import java.util.Scanner;

public class EdificioUniversitario {

    public static int calcularNumSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    public static int calcularNumPisos(int numSalonesNecesarios, int salonesPorPiso) {
        return (int) Math.ceil((double) numSalonesNecesarios / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();


        int numSalones = calcularNumSalones(numEstudiantes, capacidadSalon);
        int numPisos = calcularNumPisos(numSalones, salonesPorPiso);

        System.out.println("Se necesitan " + numSalones + " salones.");
        System.out.println("El edificio tendrá " + numPisos + " pisos.");

        scanner.close();
    }
}
