package practicaprogramada7;

import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class PracticaProgramada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //EJERCICIO 1//
        Scanner entrada = new Scanner(System.in);
        int numeros[], numero;
        numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.print("Digite el número a buscar: ");
        int buscar = entrada.nextInt();
        int i = 0;
        boolean encontrado = false;
        while (i < numeros.length && encontrado == false) {
            if (numeros[i] == buscar) {
                encontrado = true;
            }
            i++;
        }
        if (encontrado == false) {
            System.out.println("\nNúmero no encontrado.");
        } else {
            System.out.println("\nNúmero encontrado, en la posición " + i);
        }
        //EJERCICIO 2//
        int numeros2[] = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int a = 0; a < numeros2.length; a++) {
            System.out.println("Ingrese un número para la posición " + a + " del arreglo: ");
            numeros2[a] = sc.nextInt();
        }
        System.out.println("Contenido del arreglo:");
        for (int o = 0; o < numeros2.length; o++) {
            System.out.println("Arreglo[" + o + "] = " + numeros2[o]);
        }
        int numeroMenor = numeros2[0];
        int numeroMayor = 0;
        int Par = numeros2[0];
        int Impar = 0;
        for (int a = 0; a < numeros2.length; a++) {
            if (numeros2[a] > numeroMayor) {
                numeroMayor = numeros2[a];
            }
            if (numeros2[a] <= numeroMenor) {
                numeroMenor = numeros2[a];
            }

            for (int e = 0; e < numeros2.length; e++) {
                if (numeros2[e] % 2 == 0) {
                    System.out.println("El número que se encuentra en la posición " + e + " es par" + numeros2[e]);
                } else {
                    System.out.println("El número que se encuentra en la posición " + e + " es impar " + numeros2[e]);
                }
            }
            System.out.println("Número Mayor es: " + numeroMayor);
            System.out.print("Número Menor es: " + numeroMenor);
            System.out.println("");
        }

        //EJERCICIO3
        int positivosNegativos[][] = new int[2][10];
        for (int m = 0; m < positivosNegativos.length; m++) {
            for (int n = 0; n < positivosNegativos[m].length; n++) {
                positivosNegativos[2][10] = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
            }
            System.out.print("\t" + positivosNegativos[2][10]);
        }
        System.out.println("");

        int sumapositiva = 0;
        int sumanegativa = 0;
        for (int m = 0; m < positivosNegativos.length; m++) {
            for (int n = 0; n < positivosNegativos[m].length; n++) {
                if (positivosNegativos[2][10] >= 0) {
                    sumapositiva = positivosNegativos.length + positivosNegativos[m].length;
                }
                if (positivosNegativos[2][10] < 0) {
                    sumanegativa = positivosNegativos.length + positivosNegativos[m].length;
                }
                System.out.println("La suma de los números positivos es de: " + sumapositiva);
                System.out.println("La suma de los números negativos es de: " + sumanegativa);
            }
        }
    }
}
