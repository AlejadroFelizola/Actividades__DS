package ep1;

import java.util.Scanner;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        final double PI = Math.PI;
        return PI * radio * radio;
    }
}

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio mayor: ");
        double radioMayor = scanner.nextDouble();

        System.out.print("Ingrese el radio menor: ");
        double radioMenor = scanner.nextDouble();

        Circulo circuloMayor = new Circulo(radioMayor);
        Circulo circuloMenor = new Circulo(radioMenor);

        double areaCorona = circuloMayor.calcularArea() - circuloMenor.calcularArea();

        System.out.println("El área de la corona circular es: " + areaCorona);

        scanner.close();
    }
}
