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

        Tasas tasas = new Tasas("Tasas", 18.53, 1000, true, "Blanca");

        Producto catalogo[] = new Producto[Producto.dimesionArray];
        Gestion gestion = new Gestion();

        catalogo[0] = tasas;
        boolean continuar = false;

        do {
            System.out.println("nnIntroduzca la opción que desea realizar:n"
                    + "1. Mostrar productosn"
                    + "2. Vender productosn"
                    + "3. Mostrar cajan"
                    + "SALIR --> Pulse cualquier otro númeron"
            );
            switch (Leer.datoInt()) {
                case 1:
                    gestion.mostrarProductos(catalogo);
                    break;
                case 2:
                    System.out.println("¿Que producto desea comprar?");
                    gestion.mostrarNombreProductos(catalogo);
                    int lecturaProducto = Leer.datoInt();
                    System.out.println("¿Cuánta cantidad desea comprar?");
                    int lecturaCantidad = Leer.datoInt();
                    gestion.comprarProducto(catalogo, lecturaProducto, lecturaCantidad);
                    break;
                case 3:
                    System.out.println(gestion.mostrarCaja() + " $");
                    break;
                default:
                    continuar = false;
            }

        } while (continuar);

        System.out.println("---- Gracias. ----");

    }

}
