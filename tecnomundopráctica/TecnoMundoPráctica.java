package tecnomundopráctica;

import java.io.PrintStream;
import java.util.Scanner;
import static tecnomundopráctica.RegistroProductos.indice;
import static tecnomundopráctica.RegistroProductos.productos;
import static tecnomundopráctica.RegistroProductos.descripcion;
import static tecnomundopráctica.RegistroProductos.codigo;
import static tecnomundopráctica.RegistroProductos.stock;
import static tecnomundopráctica.RegistroProductos.precio;
import static tecnomundopráctica.RegistroProductos.precioMayor;
import static tecnomundopráctica.RegistroProductos.precioMenor;
import static tecnomundopráctica.RegistroProductos.productoExistente;

/**
 *
 * @author Dell
 */
public class TecnoMundoPráctica {

    private static int precioAlto;
    private static int precioBajo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            char continuar = 's';

            do {
                System.out.print("\nNombre del producto: ");
                String producto = teclado.nextLine();
                System.out.print("\nDescripción del producto: ");
                String description = teclado.nextLine();
                System.out.print("\nCódigo del producto: ");
                int codig = Integer.parseInt(teclado.nextLine());
                System.out.print("\nCantidad de stock: ");
                int cantidad = Integer.parseInt(teclado.nextLine());
                System.out.print("\nPrecio del producto: ");
                int price = Integer.parseInt(teclado.nextLine());

                int posicion = productoExistente(producto);
                if (posicion == -1) {
                    if (indice < 10) {
                        productos[indice] = producto;
                        descripcion[indice] = description;
                        codigo[indice] = codig;
                        stock[indice] = cantidad;
                        precio[indice] = price;
                        precioMayor[indice] = precioAlto;
                        precioMenor[indice] = precioBajo;
                        indice++;
                        System.out.print("Producto registrado.\n");
                    } else {
                        System.out.print("No hay espacio para nuevos productos\n");
                    }
                } else {
                    System.out.print("Producto existente.\n");
                }
                System.out.print("¿Continuar?(S/N):");
                continuar = teclado.nextLine().toLowerCase().charAt(0);
            } while (continuar == 's');

            System.out.print("\n\t\t\tDatos Registrados \n\t\t\t --------- --------\n");
            for (int i = 0; i < indice; i++) {
                System.out.printf("\tProducto: %-20s\tStock: %04d\n", productos[i], stock[i]);
                for (int a = 0; a < precio.length; a++) {
                    int precioMayor = 0;
                    if (precio[a] > precioMayor) {
                        precioMayor = precio[a];
                    }
                    int precioMenor = 0;
                    if (precio[a] <= precioMenor) {
                        precioMenor = precio[a];
                    }
                    System.out.printf("\tPrecio más alto: %04d\n", precioAlto[i]);
                    System.out.printf("\tPrecio más bajo: %04d\n", precioBajo[i]);
                }

                System.out.println("\n\tTotal Registros: " + indice);

                System.out.println("\n\n\t\t\tFIN DEL PROGRAMA");
            }
        }

    }
