package Facturacion;

/**
 *
 * @author Dell
 */
public class Factura {

    private int item_numero;
    private String nombreFACT;
    private int cantidad;
    private float precioFACT;
    private int costoTotal;

    public Factura(int item_numero, String nombreFACT, int cantidad, float precioFACT, int costoTotal) {
        this.item_numero = item_numero;
        this.nombreFACT = nombreFACT;
        this.cantidad = cantidad;
        this.precioFACT = precioFACT;
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Factura{" + "item_numero=" + item_numero + ", nombreFACT=" + nombreFACT + ", cantidad=" + cantidad + ", precioFACT=" + precioFACT + ", costoTotal=" + costoTotal + '}';
    }

    public int getItem_numero() {
        return item_numero;
    }

    public void setItem_numero(int item_numero) {
        this.item_numero = item_numero;
    }

    public String getNombreFACT() {
        return nombreFACT;
    }

    public void setNombreFACT(String nombreFACT) {
        this.nombreFACT = nombreFACT;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioFACT() {
        return precioFACT;
    }

    public void setPrecioFACT(float precioFACT) {
        this.precioFACT = precioFACT;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

}
