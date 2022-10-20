package PracticaProgra05;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class BancoElCirquito {

    public static void main(String[] args) {
       
        ElCirquito elcirquito = new ElCirquito();
        elcirquito.leerATRIBUTOS();
        elcirquito.tasaInteresMes();
        elcirquito.retiro();
        elcirquito.deposito();
        elcirquito.MOSTRAR();
    }

    public void MOSTRAR() {
        String numeroCuenta = null;
        JOptionPane.showInternalMessageDialog(null, "El número de su cuenta es: " + numeroCuenta);
        String identificacionCliente = null;
        JOptionPane.showMessageDialog(null, "Su número de identificación es: " + identificacionCliente);
        String capitalActual = null;
        JOptionPane.showMessageDialog(null, "El saldo de su cuenta es: " + capitalActual);
        String tasaInteresMes = null;
        JOptionPane.showMessageDialog(null, "La tasa de interés es de: " + tasaInteresMes);
        String fondoActual1 = null;
        JOptionPane.showMessageDialog(null, "Retiro realizado, el saldo de su cuenta es: " + fondoActual1);
        String fondoActual2 = null;
        JOptionPane.showMessageDialog(null, "Al realizar el depósito, el saldo de su cuenta es: " + fondoActual2);
    }
}
