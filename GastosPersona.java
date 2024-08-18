package ep1;

import java.util.Scanner;

public class GastosPersona {

    public static class Persona {
        private double sueldo;

        public Persona(double sueldo) {
            this.sueldo = sueldo;
        }

        public double calcularGastoArriendo() {
            return sueldo * 0.40;
        }

        public double calcularGastoComida() {
            return sueldo * 0.15;
        }

        public double calcularDineroRestante() {
            return sueldo - calcularGastoArriendo() - calcularGastoComida();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldoPedro= scanner.nextDouble();

        Persona pedro=new Persona(sueldoPedro);
 
        System.out.println("Gasto en arriendo: $" + pedro.calcularGastoArriendo());
        System.out.println("Gasto en comida: $" + pedro.calcularGastoComida());
        System.out.println("Dinero restante: $" + pedro.calcularDineroRestante());

        scanner.close();
    }
}