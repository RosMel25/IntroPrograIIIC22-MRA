package RUTINA;

import RegistroDEspecies.EspeciesdePez;
import java.util.Scanner;

public class Rutina {

    Scanner entrada = new Scanner(System.in);
    int EspeciesdePez = teclado.nextInt();
    EspeciesdePez especies[] = new EspeciesdePez[10];
    EspeciesdePez p = null;
    for(int i = 0; i< especies.length ;i++)
    private int[] precios1;

    {

        System.out.println("Ingrese el nombre de la especie de pez");
        String nombre;
        nombre = teclado.nextString();
        System.out.println("Ingrese la cantidad de peces");
        int cantidad = teclado.nextInt();
        System.out.println("Ingrese TROPICAL u ORIENTAL en la que pertenece el pez");
        String categoria;
        categoria = teclado.nextString();
        System.out.println("Ingrese el precio del pez");
        int precio = teclado.nextInt();
        p = new EspeciesdePez(nombre, cantidad, categoria, precio);
        especies[i] = p;

    }

    int precioMenor = precios1[0];
    int precioMayor = 0;
    for (int a = 0;a< precios1.length; a++) {
            if (precios1[a] > precioMayor) {
            precioMayor = precios1[a];
        }
        if (precios1[a] <= precioMenor) {
            precioMenor = precios1[a];
        }

        System.out.println("Número Mayor es: " + precioMayor);
        System.out.print("Número Menor es: " + precioMenor);
        System.out.println("");
    }
}
