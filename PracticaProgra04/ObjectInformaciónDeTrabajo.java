package PracticaProgra04;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ObjectInformaciÃ³nDeTrabajo {

    public String nombreEmpresa;
    public String direccion;
    public String canton;
    public String distrito;
    public String provincia;
    public String pais;
    public int codigoPostal;
    public int telTrabajo;
    public String areaTrabajo;
    public int extensionTelefonica;

    public ObjectInformaciÃ³nDeTrabajo() {
        this.nombreEmpresa = "";
        this.direccion = "";
        this.canton = "";
        this.distrito = "";
        this.provincia = "";
        this.pais = "";
        this.codigoPostal = 0;
        this.telTrabajo = 0;
        this.extensionTelefonica = 0;
        this.areaTrabajo = "";
    }

    public void IngresarNombreEmpresa() {

        nombreEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de empresa: ");
        mostrar(nombreEmpresa);
    }

    public void mostrar(String nombreEmpresa) {
        JOptionPane.showMessageDialog(null, "" + nombreEmpresa);
        JOptionPane.showMessageDialog(null, "" + canton);
        JOptionPane.showMessageDialog(null, "" + distrito);
        JOptionPane.showMessageDialog(null, "" + provincia);
        JOptionPane.showMessageDialog(null, "" + pais);
        JOptionPane.showMessageDialog(null, "" + direccion);
        JOptionPane.showMessageDialog(null, "" + telTrabajo);
        JOptionPane.showMessageDialog(null, "" + extensionTelefonica);
        JOptionPane.showMessageDialog(null, "" + areaTrabajo);
        JOptionPane.showMessageDialog(null, "" + codigoPostal);
    }

    public void AgregarUbicacion() {
        canton = JOptionPane.showInputDialog("Ingrese el cantÃ³n:");
        mostrar(canton);
        distrito = JOptionPane.showInputDialog("Ingrese el distrito:");
        mostrar(distrito);
        provincia = JOptionPane.showInputDialog("Ingrese la provincia:");
        mostrar(provincia);
        pais = JOptionPane.showInputDialog("Ingrese el paÃ­s: ");
        mostrar(pais);
        direccion = JOptionPane.showInputDialog("Ingrese la direcciÃ³n: ");
        mostrar(direccion);
    }

    public void IngresarTelTrabajo() {
        String telTrabajolectura = JOptionPane.showInputDialog("Ingrese el telÃ©fono de trabajo: ");
        telTrabajo = Integer.parseInt(telTrabajolectura);
    }

    public void IngresarExtensionTelefonica() {
        String extensionTelefonicalectura = JOptionPane.showInputDialog("Ingrese la extensiÃ³n telefÃ³nica: ");
        extensionTelefonica = Integer.parseInt(extensionTelefonicalectura);
    }

    public void IngresarAreaTrabajo() {
        areaTrabajo = JOptionPane.showInputDialog("Ingrse su Ã¡rea de desempeÃ±o: ");
        mostrar(areaTrabajo);
    }

    public void IngresarCodigoPostal() {
        String codigoPostallectura = JOptionPane.showInputDialog("Ingrese el cÃ³digo postal: ");
        codigoPostal = Integer.parseInt(codigoPostallectura);
    }

    public void CalcularHorarioDeTrabajo() {

    }

    public void IngregarAccesoInternet() {
    }
}
