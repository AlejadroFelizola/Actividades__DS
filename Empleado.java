package ep1;


class Empleado {
	
    private double sueldoActual;
   
    public Empleado(double sueldoActual) {
        this.sueldoActual = sueldoActual;
    }
   
    public double calcularAumento() {
        double porcentajeAumento;

        if (sueldoActual <= 800000) {
            porcentajeAumento = 0.10;
        } else if (sueldoActual > 800000 && sueldoActual <= 1200000) {
            porcentajeAumento = 0.08;
        } else {
            porcentajeAumento = 0.05;
        }

        return sueldoActual * porcentajeAumento;
    }

    public double calcularNuevoSalario() {
        return sueldoActual + calcularAumento();
    }

    public double getSueldoActual() {
        return sueldoActual;
    }




    public static void main(String[] args) {
        
        Empleado empleado = new Empleado(850000);

        
        double aumento = empleado.calcularAumento();
        double nuevoSalario = empleado.calcularNuevoSalario();

        
        System.out.println("Sueldo Actual: $" + empleado.getSueldoActual());
        System.out.println("Aumento: $" + aumento);
        System.out.println("Nuevo Salario: $" + nuevoSalario);
        
       
    }
}
