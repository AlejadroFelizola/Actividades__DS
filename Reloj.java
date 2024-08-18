
public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    public Reloj(int hora, int minutos, int segundos){
        
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Hora inválida");
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void aumentarSegundos(int segundos) {
        this.segundos += segundos;
        ajustarTiempo();
    }

    private void ajustarTiempo() {
        while (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }
        while (minutos >= 60) {
            minutos -= 60;
            hora++;
        }
        hora %= 24;
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}