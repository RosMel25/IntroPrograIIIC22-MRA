package casoprogramado1;

/**
 *
 * @author Dell
 */
public class Tasas extends Producto {

    private String cliente;

    public Tasas() {
    }

    public Tasas(String nombre, double precioUnit, int cantidadStock, boolean disponible, String cliente) {
        super(nombre, precioUnit, cantidadStock, disponible);
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ARTÍCULO DE COMPRA"
                + super.toString()
                + "Cliente: " + this.cliente;
    }

    public String getcliente() {
        return cliente;
    }

    public void setcliente(String cliente) {
        this.cliente = cliente;
    }
}
