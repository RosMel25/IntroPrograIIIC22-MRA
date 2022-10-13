package PracticaProgra04;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ObjectEstudiante {

    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public int numCedula;
    public String genero;
    public int fechaNacimiento;
    public String nombreEncargados;
    public String apellidosEncargados;
    public int telEncargados;
    public int annioCursar;

    public ObjectEstudiante() {
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.numCedula = 0;
        this.genero = "";
        this.fechaNacimiento = 0;
        this.nombreEncargados = "";
        this.apellidosEncargados = "";
        this.telEncargados = 0;
        this.annioCursar = 0;
    }

    public void IngresarEstudiante() {

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        mostrar(nombre);
        primerApellido = JOptionPane.showInputDialog("Ingrese su primer apellido:");
        mostrar(primerApellido);
        segundoApellido = JOptionPane.showInputDialog("Ingrese su segundo apellido:");
        mostrar(segundoApellido);
        String numCedulalectura = JOptionPane.showInputDialog("Ingrese su número de cédula: ");
        numCedula = Integer.parseInt(numCedulalectura);
        mostrar(numCedulalectura);
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
        JOptionPane.showMessageDialog(null, "" + nombreEncargados);
        JOptionPane.showMessageDialog(null, "" + apellidosEncargados);
        JOptionPane.showMessageDialog(null, "" + telEncargados);
        JOptionPane.showMessageDialog(null, "" + annioCursar);

    }

    public void IngresarEncargados() {
        nombreEncargados = JOptionPane.showInputDialog("Ingrese el nombre del encargado: ");
        mostrar(nombreEncargados);
        apellidosEncargados = JOptionPane.showInputDialog("Ingrese los apellidos de los encargados:");
        mostrar(apellidosEncargados);
        String telEncargadoslectura = JOptionPane.showInputDialog("Ingrese el número de teléfono de los encargados:");
        telEncargados = Integer.parseInt(telEncargadoslectura);
        mostrar(telEncargadoslectura);
    }

    public void IngresarAnnioCursar() {
        String annioCursarlectura = JOptionPane.showInputDialog("Ingrese el año a cursar: ");
        annioCursar = Integer.parseInt(annioCursarlectura);
        mostrar(annioCursarlectura);
    }

    public void AgregarCertificadoDeNotas() {
    }

    public void AgregarNivelAMatricula() {
    }

    public void GenerarNumeroDeMatricula() {
    }
    
    public void GenerarNumeroDeCarnet() {
    }
    
    public void GenerarCantidadDeCupos() {
    }
    
    public void EnviarPlanCursoLectivo() {
    }
    
    public void EnviarListaDeUtiles() {
    }
}
