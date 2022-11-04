package casoprogramado1;

/**
 *
 * @author Dell
 */
public abstract class Producto {

    private String nombre;
    private double precioUnit;
    private int cantidadStock;
    private boolean disponible = false;
    public static int dimesionArray;

    public Producto() {
    }

    public Producto(String nombre, double precioUnit, int cantStock, boolean disponible) {
        this.nombre = nombre;
        this.precioUnit = precioUnit;
        this.cantidadStock = cantStock;
        this.disponible = disponible;

        dimesionArray++;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "n"
                + "Precio unidad: " + this.getPrecioUnit() + " $n"
                + "En Stock: " + this.getCantidadStock() + "n";
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

    public int getCantidadStock() {
        return this.cantidadStock;
    }

    public void setCantStock(int cantStock) {
        this.cantidadStock = cantStock;
    }

    public boolean isDisponible() {
        if (getCantidadStock() > 0) {
            this.disponible = true;
        }
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    void setcantidadStock(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
