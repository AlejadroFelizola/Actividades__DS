package ep1;

import java.util.Scanner;

public class Terreno {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Terreno(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calcularAreaRectangulo() {
        return ladoA * ladoB;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(ladoA * ladoA + ladoB * ladoB);
    }

    public double calcularAreaTriangulo() {
        double hipotenusa = calcularHipotenusa();
        double altura = Math.sqrt(hipotenusa * hipotenusa - ladoB * ladoB);
        return 0.5 * ladoB * altura;
    }

    public double calcularAreaTotal() {
        return calcularAreaRectangulo() + calcularAreaTriangulo();
    }

    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC + calcularHipotenusa();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese el lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese el lado C: ");
        double ladoC = scanner.nextDouble();

        Terreno terreno = new Terreno(ladoA, ladoB, ladoC);

        System.out.println("El área total del terreno es: " + terreno.calcularAreaTotal());
        System.out.println("El perímetro del terreno es: " + terreno.calcularPerimetro());

        scanner.close();
    }
}