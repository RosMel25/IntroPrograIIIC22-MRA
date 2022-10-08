package practicasprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class PracticasProgra03 {

    @SuppressWarnings("empty-statement")
    public static void practica03() {
        //Ejerciio 1//

        int promVuelta = 0;
        for (int i = 0; i < 10; i++) {//maximo 10 vueltas

            long start = System.nanoTime();//punto inicial

            long finish = System.nanoTime();// punto final
            long timeElapsed = finish - start;
            promVuelta += timeElapsed;

            System.out.println("tiempo por lap: " + (timeElapsed));

        }
        System.out.println("Promedio por vuelta: " + (promVuelta / 10));

        /*Ejercicio2*/
        
        int cantidadNinos = 0;
        int promedioEstaturas = 0;
        int i = 1;
        String estaturaLectrura;

        while (i >= 0);
        String estaturaLectura = JOptionPane.showInputDialog("Ingrese la estatrura: ");
        int estatura = Integer.parseInt(estaturaLectura);
        promedioEstaturas = promedioEstaturas + estatura;

        if (i >= 100) {

        }

    }
}
