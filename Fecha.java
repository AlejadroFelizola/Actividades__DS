
public class Fecha {
	
    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public String mostrarFecha() {
        return String.format("%04d-%02d-%02d", año, mes, dia);
    }
}