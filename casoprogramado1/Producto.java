package casoprogramado1;

/**
 *
 * @author Dell
 */
public class Producto {

    private String nombre;
    private int codigoProducto;
    private double precioUnit;
    private int cantidad;

    public Producto(String nombre, int codigoProducto, double precioUnit, int cantidad) {
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.precioUnit = precioUnit;
        this.cantidad = cantidad;
    }

    Producto(String camisa_estampada, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getcodigoProducto() {
        return codigoProducto;
    }

    public void setcodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnit() {
        return this.precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getcantidad() {
        return this.cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto" + "\nnombre:" + nombre + "\ncodigoProducto:" + codigoProducto + "\ncantidad" + cantidad + "\nprecioUnit" + precioUnit;
    }
}
