package practicasprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class PracticasProgra03 {

    public static void practica03() {

        /*Ejercicio #2*/
        int cantidadniños = 0;
        int promedioDeEstaturas = 0;
        int n = 0;
        int sumaestatura = 0;

        do {
            System.out.println("Ingrese su estatura: " + n);
            ++n;
        } while (n <= 0);
        String estaturaLectura = null;
        
        int estatura = Integer.parseInt(estaturaLectura);
            sumaestatura = sumaestatura + n;
            
            if (estatura <= 100) {
                cantidadniños = cantidadniños + 1;
            } else if (estatura >= 101 && estatura <= 120) {
                cantidadniños = cantidadniños + 1;
            } else if (estatura >= 121 && estatura <= 130) {
                cantidadniños = cantidadniños + 1;
            } else if (estatura >= 131 && estatura <= 140) {
                cantidadniños = cantidadniños + 1;
            } else if (estatura >= 141) {
                cantidadniños = cantidadniños + 1;
            }
            
            cantidadniños = cantidadniños + 1;
        }
        
        promedioDeEstaturas = sumaestatura/n);
        
        System.out.println("Cantidad de niños que miden menos de 100cm:  ");
        System.out.println("Cantidad de niños que miden entre 101 y 120cm:  ");
        System.out.println("Cantidad de niños que miden entre 121 y 130cm:  ");
        System.out.println("Cantidad de niños que miden entre 131 y 140cm:  ");
        System.out.println("Cantidad de niños que miden más de 140cm:  ");
        System.out.println("El promedio de estaturas es de: " + promedioDeEstaturas / cantidadniños);
        
     
    }
}
