package casoprogramado1;

/**
 *
 * @author Dell
 */
public class Factura {

//Argumentos
    private int item_numero;
    private String nombre;
    private int cantidad;
    private double precio;
    private double costoTotal;

    public Factura(int item_numero, String nombre, int cantidad, double precio, double costoTotal) {
        this.item_numero = item_numero;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.costoTotal = costoTotal;
    }

    Factura(int i, Producto producto1, Cliente cliente1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getItem_numero() {
        return item_numero;
    }

    public void setItem_numero(int item_numero) {
        this.item_numero = item_numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Factura" + "\nitem_numero:" + item_numero + "\nnombre:" + nombre + "\ncantidad" + cantidad + "\nprecio" + precio + "\ncostoTotal" + costoTotal;

    }
}
