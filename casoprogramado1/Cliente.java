package casoprogramado1;

/**
 *
 * @author Dell
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private int cedula;
    private String nombreEmpresa;

    public Cliente(String nombre, String apellido, int cedula, String nombreEmpresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.nombreEmpresa = nombreEmpresa;
    }

    Cliente(String Antonio, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", nombreEmpresa=" + nombreEmpresa;
    }

}
