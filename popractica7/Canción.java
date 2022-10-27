package popractica7;

/**
 *
 * @author Dell
 */
public class Canción {

    //Atributos
    private int idCancion;
    private String titulo;
    private String autor;
    private double duracion;
    private int annioCreacion;

    //Métodos
    //Método Constructor
    public Canción(int idCancion, String titulo, String autor, double duracion, int annioCreacion) {
        //Se asigna el valor
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.annioCreacion = annioCreacion;
    }

    public void mostrarDatos() {
        System.out.println("El ID de la canción es: " + idCancion + ".\nEl título es: " + titulo + ".\nEl autor es: " + autor + ".\nLa duración es de: " + duracion + " minutos.\nEl año de creación es: " + annioCreacion);
    }

    public int getidCancion() {
        return idCancion;
    }

    public void setidCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public double getduracion() {
        return duracion;
    }

    public void setduracion(double duracion) {
        this.duracion = duracion;
    }

    public int getannioCreacion() {
        return annioCreacion;
    }

    public void setannioCreacion(int annioCreacion) {
        this.annioCreacion = annioCreacion;
    }
}
