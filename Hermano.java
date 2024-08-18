package ep1;

class Hermano {
	
    String nombre;
    int edad;
    public Hermano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
class Familia {
    private Hermano[] hermanos;

    public Familia(Hermano... hermanos) {
        this.hermanos = hermanos;
    }

    public String getHermanoMayor() {
        Hermano mayor = hermanos[0];
        for (Hermano hermano : hermanos) {
            if (hermano.edad > mayor.edad) {
                mayor = hermano;
            }
        }
        return mayor.nombre;
    }

    public static void main(String[] args) {
        Hermano hermano1 = new Hermano("Juan", 25);
        Hermano hermano2 = new Hermano("Ana", 22);
        Hermano hermano3 = new Hermano("Pedro", 28);

        Familia familia = new Familia(hermano1, hermano2, hermano3);

        String mayor = familia.getHermanoMayor();
        System.out.println("El hermano mayor es: " + mayor);
    }
}
