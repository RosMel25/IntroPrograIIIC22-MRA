package practicasprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class PracticasProgra02 {

    public static void practica02() {

        /*Ejercicio #1*/
        int mes;

        String mesLectura;

        mesLectura = JOptionPane.showInputDialog("Para verificar el mes y cuatrimestre, ingrese un número del 1 - 12");
        mes = Integer.parseInt(mesLectura);

        switch (mes) {
            case 1:
                System.out.println("Se encuentra en el mes de ENERO - PRIMER CUATRIMESTRE");
                break;
            case 2:
                System.out.println("Se encuentra en el mes de FEBRERO - PRIMER CUATRIMESTRE.");
                break;
            case 3:
                System.out.println("Se encuentra en el mes de MARZO - PRIMER CUATRIMESTRE.");
                break;
            case 4:
                System.out.println("Se encuentra en el mes de ABRIL - PRIMER CUATRIMESTRE.");
                break;
            case 5:
                System.out.println("Se encuentra en el mes de MAYO - SEGUNDO CUATRIMESTRE.");
                break;
            case 6:
                System.out.println("Se encuentra en el mes de JUNIO - SEGUNDO CUATRIMESTRE.");
                break;
            case 7:
                System.out.println("Se encuentra en el mes de JULIO - SEGUNDO CUATRIMESTRE.");
                break;
            case 8:
                System.out.println("Se encuentra en el mes de AGOSTO - SEGUNDO CUATRIMESTRE.");
                break;
            case 9:
                System.out.println("Se encuentra en el mes de SEPTIEMBRE - TERCER CUATRIMESTRE.");
                break;
            case 10:
                System.out.println("Se encuentra en el mes de OCTUBRE - TERCER CUATRIMESTRE.");
                break;
            case 11:
                System.out.println("Se encuentra en el mes de NOVIEMBRE - TERCER CUATRIMESTRE.");
                break;
            case 12:
                System.out.println("Se encuentra en el mes de DICIEMBRE - TERCER CUATRIMESTRE.");
                break;
            default:
                System.out.println("Número incorrecto.");
                break;
        }

        /*Ejercicio #2*/
        int edad;
        String edadLectura;

        edadLectura = JOptionPane.showInputDialog("Ingrese la edad para determinar la etapa a la que pertenece");
        edad = Integer.parseInt(edadLectura);
        
        if (edad <= 5) System.out.println("Pertenece a PRIMER INFANCIA");
        else if (edad >=6 && edad <=11) System.out.println("Pertenece a INFANCIA");
        else if (edad >=12 && edad <=18) System.out.println("Pertenece a ADOLESCENCIA");
        else if (edad >=19 && edad <=29) System.out.println("Pertenece a JUVENTUD");
        else if (edad >=30 && edad <=59) System.out.println("Pertence a ADULTEZ");
        else if (edad >= 60) System.out.println("Pertenece a PERSONA MAYOR");
        }
    }
