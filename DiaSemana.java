package ep1;


import java.util.Scanner;

public class DiaSemana {
    private String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
    private int indice;

    public DiaSemana(String dia) {
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(dia)) {
                this.indice = i;
                return;
            }
        }
        throw new IllegalArgumentException("Día inválido");
    }

    public String obtenerDiaSiguiente() {
        indice = (indice + 1) % dias.length;
        return dias[indice];
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un día de la semana: ");
        String diaIngresado = scanner.nextLine();

        try {
            DiaSemana dia = new DiaSemana(diaIngresado);
            String diaSiguiente = dia.obtenerDiaSiguiente();
            System.out.println("El día siguiente es: " + diaSiguiente);
        } catch (IllegalArgumentException e) {
            System.out.println("Día inválido. Los días válidos son: lunes, martes, miércoles, jueves, viernes, sábado, domingo.");
            
            scanner.close();
        }
    }
}