package PracticaProgra05;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ElCriquito {

    public int numeroCuenta;
    public int identificacionCliente;
    public int saldoActual;
    public int tasaInteres;
    int tasaInteresMes;
    int mes;
    int capitalActual;
    int retiro;
    int deposito;
    int fondoActual1;
    int fondoActual2;

    public void leerATRIBUTOS() {
        numeroCuenta = Interger.parseInt(JOptionPane.showInputDialog("Ingrese su número de cuenta: "));
        identificacionCliente = Interger.parseInt(JOptionPane.showInputDialog("Ingrese su número de identificación: "));
        saldoActual = Interger.parseInt(JOptionPane.showInputDialog("Introduzca su saldo actual: "));
        tasaInteres = Interger.parseInt(JOptionPane.showInputDialog("Introduzca la tasa de interés (%): "));
        mes = Interger.parseInt(JOptionPane.showInputDialog("Ingrese la tasa de interés del mes actual: "));
    }

    public void tasaInteresMes() {
        tasaInteresMes = saldoActual + tasaInteres / 100 * mes / 12;
        capitalActual = tasaInteresMes + saldoActual;
    }

    public void retiro() {
        String retirolectura = JOptionPane.showInputDialog("Ingrese el monto a retirar: ");
        retiro = Interger.parseInt(retirolectura);
        if (retiro <= capitalActual) {
            fondoActual1 = capitalActual - retiro;
        }   
        
    public int deposito() {
        String depositolectura = JOptionPane.showInputDialog("Ingrese el monto a depositar: ");
        deposito = Interger.parseInt(depositolectura);
        if (deposito >= 0) {
            fondoActual2 = capitalActual + deposito;
        }

    public void MOSTRAR() {
        JOptionPane.showInternalMessageDialog(null, "El número de su cuenta es: " + numeroCuenta);
        JOptionPane.showMessageDialog(null, "Su número de identificación es: " + identificacionCliente);
        JOptionPane.showMessageDialog(null, "El saldo de su cuenta es: " + capitalActual);
        JOptionPane.showMessageDialog(null, "La tasa de interés es de: " + tasaInteresMes);
        JOptionPane.showMessageDialog(null, "Retiro realizado, el saldo de su cuenta es: " + fondoActual1);
        JOptionPane.showMessageDialog(null, "Al realizar el depósito, el saldo de su cuenta es: " + fondoActual2);
    }

}
