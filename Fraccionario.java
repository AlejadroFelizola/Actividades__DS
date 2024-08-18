
public class Fraccionario {
    private int numerador;
    private int denominador;

  
    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

   
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El enominador no puede ser cero");

        }
        this.denominador = denominador;
    }

    
    public void mostrarFraccion() {
        System.out.println(numerador + "/" + denominador);
    }
}
