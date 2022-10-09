package PracticaProgra04;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ObjectEncargado {

    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public int numCedula;
    public String genero;
    public int fechaNacimiento;
    public String parentesco;
    public String correoElectronico;
    public int telMovil;
    public String trabajoActual;

    public ObjectEncargado() {
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.numCedula = 0;
        this.genero = "";
        this.fechaNacimiento = 0;
        this.parentesco = "";
        this.correoElectronico = "";
        this.telMovil = 0;
        this.trabajoActual = "";

    }

    public void IngresarEncargado() {

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        mostrar(nombre);
        primerApellido = JOptionPane.showInputDialog("Ingrese su primer apellido:");
        mostrar(primerApellido);
        segundoApellido = JOptionPane.showInputDialog("Ingrese su segundo apellido:");
        mostrar(segundoApellido);
        genero = JOptionPane.showInputDialog("Ingrese su género:");
        mostrar(genero);
        String fechaNacimientolectura = JOptionPane.showInputDialog("Ingrse su fecha de nacimiento: ");
        fechaNacimiento = Integer.parseInt(fechaNacimientolectura);
    }

    public void mostrar(String nombre) {
        JOptionPane.showMessageDialog(null, "" + nombre);
        JOptionPane.showMessageDialog(null, "" + primerApellido);
        JOptionPane.showMessageDialog(null, "" + segundoApellido);
        JOptionPane.showMessageDialog(null, "" + numCedula);
        JOptionPane.showMessageDialog(null, "" + genero);
        JOptionPane.showMessageDialog(null, "" + parentesco);
        JOptionPane.showMessageDialog(null, "" + correoElectronico);
        JOptionPane.showMessageDialog(null, "" + telMovil);
        JOptionPane.showMessageDialog(null, "" + trabajoActual);
    }

    public void IngresarParentesco() {
        parentesco = JOptionPane.showInputDialog("Ingrese su parentesco con el estudiante:");
        mostrar(parentesco);
    }

    public void IngresarNumCedula() {
        String numCedulalectura = JOptionPane.showInputDialog("Ingrese su número de cédula: ");
        numCedula = Integer.parseInt(numCedulalectura);
        mostrar(numCedulalectura);
    }

    public void IngresarTelMovil() {
        String telMovillectura = JOptionPane.showInputDialog("Ingrese el número de teléfono: ");
        telMovil = Integer.parseInt(telMovillectura);
        mostrar(telMovillectura);
    }

    public void IngresarcorreoElectronico() {
        correoElectronico = JOptionPane.showInputDialog("Ingrese su correo electrónico: ");
        mostrar(correoElectronico);
    }

    public void IngresartrabajoActual() {
        trabajoActual = JOptionPane.showInputDialog("Ingrese su trabajo actual: ");
        mostrar(trabajoActual);
    }

    public void IngresarEstudioRealizado() {

    }

    public void IngresarSalario() {

    }

    public void AgregarBienes() {

    }

    public void CalcularSalarioNeto() {

    }
}
