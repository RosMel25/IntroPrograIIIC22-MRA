package prácticaprogra2;

import javax.swing.JOptionPane;

public class PrácticaProgra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Ejecicio 2
 String  edadLectura ;
 int edad;
 
 edadLectura = JOptionPane . showInputDialog ( "Ingrese su Edad" );
        int edad = Entero.parseInt ( edadLectura );

        if ( edad <= 5  ) {
            System_out_println ( "Se encuentra dentro de PRIMERA INFANCIA" );
        }
            if ( edad >= 12 ) {
                System_out_println ( "Se encuentra dentro de INFANCIA" );
            }
            if (edad >= 19 ) {
                System_out_println ("Se encuentra dentro de JUVENTUD")
            }
            if (edad >= 30 ) {
                System_out_println ("Se encuentra dentro de ADULTEZ")
            }
            if (edad >= 60 ) {
                System_out_println ("Se encuentra dentro de PERSONA MAYOR")
            }
    }
}
