package popractica7;

/**
 *
 * @author Dell
 */
public class POPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canción cancion1 = new Canción(2983, "November Rain", "Guns N\' Roses", 9.27, 2012);

        cancion1.mostrarDatos();

        cancion1.setidCancion(452);
        int idCancion = cancion1.getidCancion();
        cancion1.settitulo("Bejeweled");
        String titulo = cancion1.gettitulo();
        cancion1.setautor("Taylor Swift");
        String autor = cancion1.getautor();
        cancion1.setduracion(5.88);
        double duracion = cancion1.getduracion();
        cancion1.setannioCreacion(2022);
        int annioCreacion = cancion1.getannioCreacion();
        System.out.println("El ID de la canción es: " + idCancion + ".\nEl título es: " + titulo + ".\nEl autor es: " + autor + ".\nLa duración es de: " + duracion + " minutos.\nEl año de creación es: " + annioCreacion);
    }

}
