package casoprogramado1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author DellCOLAB
 */
public class CasoProgramado1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // Login

        int intentos = 0;
        while (intentos < 3) {
            String usuario = JOptionPane.showInputDialog("Ingrese el usuario");
            String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña");

            if (usuario.equals("ADMINISTRADOR") && contraseña.equals("Admi001")) {
                System.out.println("Bienvenido al sistema estimado administrador");
                intentos = 3;
                // Reservado aquí es donde se deja espacio para las deiversas clsaes

            } else if (usuario.equals("COLABORADOR") && contraseña.equals("Colab001")) {
                System.out.println("Bienvenido al sistema estimado colaborador");
                intentos = 3;

            } else {
                System.out.println("Eror, usuario o contraseña incorrectos, intente más tarde");
                intentos += 1;
            }
        }

        Producto producto1 = new Producto("Camisa estampada", 0123, 50, 4500);
        Factura factura1 = new Factura(03456, "Camisa estampada", 50, 4500, 225000);
        System.out.println(factura1);
        Trabajadores trabajadores1 = new Trabajadores() {
            @Override
            public String imprimirBoletaPago() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int horasExtras() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int cant_horas_extras() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double sueldoBruto() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double sueldoNeto() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Planilla planilla1 = new Planilla("INFORME DEL TRABAJADOR" + "\n"
                + "---------------------" + "\n"
                + "                       " + "\n"
                + "Datos del Empleado" + "\n"
                + "Nombres: " + "Juan" + "\n"
                + "Apellidos: " + "Arias" + "\n"
                + "Identificación: " + 11928302 + "\n"
                + "Edad: " + 26 + "\n"
                + "Dirección: " + "Heredia, San Francisco" + "\n"
                + "Formación Academica: " + "Bachillerato" + "\n"
                + "Años de experiencia: " + 5 + "\n"
                + "                        " + "\n"
                + "Resumen de Pago" + "\n"
                + "                       " + "\n"
                + "Sueldo Bruto: S/ " + 350000 + "\n"
                + "Horas Extras: " + 5 + "\n"
                + "Pago por horas Extras: S/ " + 5 + "\n"
                + "Bono por hijos: S/ " + 400 + "\n"
                + "Sueldo Neto: S/ " + 300000);
        Recibo recibo1 = new Recibo();

    }

}
