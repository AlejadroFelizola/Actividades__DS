
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private LocalDateTime horaEntrada;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = LocalDateTime.now();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}


class Automovil extends Vehiculo {
    private String tipoCombustible;

    public Automovil(String placa, String marca, String modelo, String tipoCombustible) {
        super(placa, marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}


class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int cilindraje) {
        super(placa, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}


class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, String modelo, double capacidadCarga) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}


class Parqueadero {
    private List<Vehiculo> vehiculos;

    public Parqueadero() {
        this.vehiculos = new ArrayList<>();
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double registrarSalida(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                LocalDateTime horaSalida = LocalDateTime.now();
                long minutos = ChronoUnit.MINUTES.between(vehiculo.getHoraEntrada(), horaSalida);
                double costo = minutos * 0.1; 
                vehiculos.remove(vehiculo);
                return costo;
            }
        }
        return -1; 
    }

    public List<Vehiculo> consultarEstado() {
        return vehiculos;
    }
}



public class VentanaPrincipal extends JFrame {
    private Parqueadero parqueadero;
    private JTextField txtPlaca;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JComboBox<String> cmbTipoVehiculo;
    private JTextField txtTipoCombustible;
    private JTextField txtCilindraje;
    private JTextField txtCapacidadCarga;
    private JButton btnIngresar;
    private JButton btnSalir;
    private JButton btnConsultar;
    private JTextArea txtEstado;

    public VentanaPrincipal() {
        parqueadero = new Parqueadero();
        crearComponentes();
        agregarComponentes();
        agregarEventos();
    }

    private void crearComponentes() {
        txtPlaca = new JTextField(10);
        txtMarca = new JTextField(10);
        txtModelo = new JTextField(10);
        cmbTipoVehiculo = new JComboBox<>(new String[]{"Automóvil", "Motocicleta", "Camión"});
        txtTipoCombustible = new JTextField(10);
        txtCilindraje = new JTextField(10);
        txtCapacidadCarga = new JTextField(10);
        btnIngresar = new JButton("Ingresar");
        btnSalir = new JButton("Salir");
        btnConsultar = new JButton("Consultar");
        txtEstado = new JTextArea(10, 20);
    }

    private void agregarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

        panel.add(new JLabel("Placa:"));
        panel.add(txtPlaca);

        panel.add(new JLabel("Marca:"));
        panel.add(txtMarca);

        panel.add(new JLabel("Modelo:"));
        panel.add(txtModelo);

        panel.add(new JLabel("Tipo de vehículo:"));
        panel.add(cmbTipoVehiculo);

        panel.add(new JLabel("Tipo de combustible:"));
        panel.add(txtTipoCombustible);

        panel.add(new JLabel("Cilindraje:"));
        panel.add(txtCilindraje);

        panel.add(new JLabel("Capacidad de carga:"));
        panel.add(txtCapacidadCarga);

        panel.add(btnIngresar);
        panel.add(btnConsultar);

        panel.add(new JLabel("Estado del parqueadero:"));
        panel.add(new JScrollPane(txtEstado));

        panel.add(btnSalir);

        add(panel, BorderLayout.CENTER);
    }

    private void agregarEventos() {
        btnIngresar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String placa = txtPlaca.getText();
                String marca = txtMarca.getText();
                String modelo = txtModelo.getText();
                String tipoVehiculo = (String) cmbTipoVehiculo.getSelectedItem();

                Vehiculo vehiculo = null;
                if (tipoVehiculo.equals("Automóvil")) {
                    String tipoCombustible = txtTipoCombustible.getText();
                    vehiculo = new Automovil(placa, marca, modelo, tipoCombustible);
                } else if (tipoVehiculo.equals("Motocicleta")) {
                    int cilindraje = Integer.parseInt(txtCilindraje.getText());
                    vehiculo = new Motocicleta(placa, marca, modelo, cilindraje);
                } else if (tipoVehiculo.equals("Camión")) {
                    double capacidadCarga = Double.parseDouble(txtCapacidadCarga.getText());
                    vehiculo = new Camion(placa, marca, modelo, capacidadCarga);
                }

                parqueadero.registrarEntrada(vehiculo);
                txtEstado.setText("Vehículo ingresado correctamente");
            }
        });

        btnConsultar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                List<Vehiculo> vehiculos = parqueadero.consultarEstado();
                String estado = "";
                for (Vehiculo vehiculo : vehiculos) {
                    estado += vehiculo.getPlaca() + " - " + vehiculo.getMarca() + " - " + vehiculo.getModelo() + "\n";
                }
                txtEstado.setText(estado);
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }
}


