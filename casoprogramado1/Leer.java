package casoprogramado1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class Leer {

    public static String dato() throws IOException {
        String sdato = " ";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        sdato = flujoE.readLine();
        return sdato;

    }

    public static int datoInt() throws IOException {
        return Integer.parseInt(dato());
    }

    public static float datoFloat() throws IOException {
        return Float.parseFloat(dato());
    }

    // Leer un char por teclado
    public static char datoChar() {
        char c = ' ';
        try {
            java.io.BufferedInputStream b = new BufferedInputStream(System.in);
            c = (char) b.read();
        } catch (IOException e) {
            System.out.println("Error al leer");
        }
        return c;
    }

    public static long datoLong() throws IOException {
        return Long.parseLong(dato());
    }
}
