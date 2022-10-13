package PracticaProgra04;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ObjectPago {

    public String nombreEncargadoCuenta;
    public String apellidos;
    public String correoElectronico;
    public String credito;
    public String contado;
    public int numCedula;
    public int telMovil;
    public int montoRecibo;
    public int numRecibo;
    public int fechaEmisionFactura;

    public ObjectPago() {
        this.nombreEncargadoCuenta = "";
        this.apellidos = "";
        this.correoElectronico = "";
        this.credito = "";
        this.contado = "";
        this.numCedula = 0;
        this.telMovil = 0;
        this.montoRecibo = 0;
        this.numRecibo = 0;
        this.fechaEmisionFactura = 0;
    }

    public void AgregarEncargadoDeLaCuenta() {
        nombreEncargadoCuenta = JOptionPane.showInputDialog("Ingrese el nombre del encargado de la cuenta:");
        mostrar(nombreEncargadoCuenta);
        apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del encargado de la cuenta:");
        mostrar(apellidos);
        correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electrónico:");
        mostrar(correoElectronico);
        String numCedulalectura = JOptionPane.showInputDialog("Ingrese el número de cédula: ");
        numCedula = Integer.parseInt(numCedulalectura);
        String telMovillectura = JOptionPane.showInputDialog("Ingrese el número móvil: ");
        telMovil = Integer.parseInt(telMovillectura);
        String montoRecibolectura = JOptionPane.showInputDialog("El monto del recibo es: ");
        montoRecibo = Integer.parseInt(montoRecibolectura);
        String numRecibolectura = JOptionPane.showInputDialog("El número de recibo es: ");
        numRecibo = Integer.parseInt(numRecibolectura);
        String fechaEmisionFacturalectura = JOptionPane.showInputDialog("La fecha de emisión de la factura es: ");
        fechaEmisionFactura = Integer.parseInt(fechaEmisionFacturalectura);
    }

    private void mostrar(String nombreEncargadoCuenta) {
        JOptionPane.showMessageDialog(null, "" + nombreEncargadoCuenta);
        JOptionPane.showMessageDialog(null, "" + apellidos);
        JOptionPane.showMessageDialog(null, "" + correoElectronico);
        JOptionPane.showMessageDialog(null, "" + credito);
        JOptionPane.showMessageDialog(null, "" + contado);
        JOptionPane.showMessageDialog(null, "" + numCedula);
        JOptionPane.showMessageDialog(null, "" + telMovil);
        JOptionPane.showMessageDialog(null, "" + montoRecibo);
        JOptionPane.showMessageDialog(null, "" + numRecibo);
        JOptionPane.showMessageDialog(null, "" + fechaEmisionFactura);
    }

    public void DefinirContadoCredito() {
        credito = JOptionPane.showInputDialog("Ingrese si el pago es a crédito: ");
        mostrar(credito);
        contado = JOptionPane.showInputDialog("Ingrese si el pago es a contado: ");
        mostrar(contado);
    }

    public void IngresarNumDeCuenta() {

    }

    public void IngresarFechaVencimiento() {
    }

    public void IngresarCodigoSeguridad() {

    }

    public void RealizarFactura() {

    }

    public void EnviarMontoAFacturar() {

    }

    public void EnviarNumeroRecibo() {

    }

    public void CancelarFactura() {

    }

    public void EnviarFactura() {
        
    }
}
