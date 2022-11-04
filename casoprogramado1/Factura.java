package casoprogramado1;

import javax.swing.JOptionPane;

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

    public void informacion() {
        String item_numerolectura = JOptionPane.showInputDialog("Código de producto/servicio: ");
        item_numero = Integer.parseInt(item_numerolectura);
        nombre = JOptionPane.showInputDialog("Nombre del producto: ");
        String cantidadlectura = JOptionPane.showInputDialog("Cantidad de produto/servicio: ");
        cantidad = Integer.parseInt(cantidadlectura);
        String preciolectura = JOptionPane.showInputDialog("Precio produto/servicio: ");
        precio = Integer.parseInt(preciolectura);
        String costoTotallectura = JOptionPane.showInputDialog("Precio total a pagar: ");
        costoTotal = Integer.parseInt(costoTotallectura);

        System.out.println("Número de código: " + item_numero);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
        System.out.println("Costo Total: " + costoTotal);
    }
}
