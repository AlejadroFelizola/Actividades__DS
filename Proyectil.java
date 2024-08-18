
public class Proyectil {
	
    private double velocidad;
    private double angulo; 

    public Proyectil(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public double getAngulo() {
        return angulo;
    }
    public void setAngulo(double angulo) {
        this.angulo= angulo;
    }
    public double calcularDistanciaHorizontal(double tiempo) {
        double distancia = velocidad * Math.cos(angulo) * tiempo;
        return distancia;
    }
}