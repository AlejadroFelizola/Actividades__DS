import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Producto> productos;

    public Tienda(String nombre, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public Producto buscarProductoPorCodigo(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null; 
    }
}

class Producto {
    private int codigo;
    private String nombre;
    private TipoProducto tipo;
    private LocalDate fechaExpiracion;
    private String fabricante;
    private int cantidad;
    private double precioUnitario;

    public Producto(int codigo, String nombre, TipoProducto tipo, LocalDate fechaExpiracion, String fabricante, int cantidad, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.fabricante = fabricante;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", fechaExpiracion=" + fechaExpiracion +
                ", fabricante='" + fabricante + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }

    public enum TipoProducto {
        LACTEO, CARNICO, FRUTA, ENLATADO
    }
}
