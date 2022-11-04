package casoprogramado1;

/**
 *
 * @author Dell
 */
public abstract class Trabajadores {

    // atributos
    private String nombre;
    private String apellido;
    private int identificacion;
    private String direccion;
    private int edad;
    private String formacionAcademica;
    private int añosExperiencia;
    private int horas_trabajadas;
    private int pagoPorHora;

    public Trabajadores() {

    }

    public Trabajadores(String nombre, String apellido, int identificacion, String direccion, int edad, String formacionAcademica,
            int añosExperiencia, int horas_trabajadas, int pago_horas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
        this.añosExperiencia = añosExperiencia;
        this.horas_trabajadas = horas_trabajadas;
        this.pagoPorHora = pago_horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getidentificacion() {
        return identificacion;
    }

    public void setidentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    
    

    public abstract String imprimirBoletaPago();

    public abstract int horasExtras();

    public abstract int cant_horas_extras();

    public abstract double sueldoBruto();

    public abstract double sueldoNeto();

}
