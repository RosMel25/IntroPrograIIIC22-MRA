/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnomundopráctica;

/**
 *
 * @author Dell
 */
public class RegistroProductos {

    static String[] productos = new String[10];
    static String[] descripcion = new String[10];
    static int[] codigo = new int[10];
    static int[] stock = new int[10];
    static int[] precio = new int[10];
    static int[]precioMayor = new int[10];
    static int []precioMenor = new int[10];
    static int indice = 0;

    static int productoExistente(String producto) {
        for (int i = 0; i < indice; i++) {
            if (productos[i].equals(producto))
                return i;
        }
        return -1;
    }
}
