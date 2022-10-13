package PracticaProgra04;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ObjectDomicilio {
    public String direccionResidencia;
    public String canton;
    public String distrito;
    public String provincia;
    public String pais;
    public int codigoPostal;
    public int telMovil;
    public int telHabitacion;
    public int numCasa;
    public String colorCasa;
    
    public ObjectDomicilio() {
        this.direccionResidencia = "";
        this.canton = "";
        this.distrito = "";
        this.provincia = "";
        this.pais = "";
        this.codigoPostal = 0;
        this.telMovil = 0;
        this.telHabitacion= 0;
        this.numCasa = 0;
        this.colorCasa = "";
    }
    
    public void IngresarDomicilio(){
        canton = JOptionPane.showInputDialog("Ingrese el cantón:");
        mostrar(canton);
        distrito = JOptionPane.showInputDialog("Ingrese el distrito:");
        mostrar(distrito);
        provincia = JOptionPane.showInputDialog("Ingrese la provincia:");
        mostrar(provincia);
        pais = JOptionPane.showInputDialog("Ingrese el país: ");
        mostrar(pais);
    }

    public void mostrar(String direccionResidencia) {
        JOptionPane.showMessageDialog(null, "" + direccionResidencia);
        JOptionPane.showMessageDialog(null, "" + canton);
        JOptionPane.showMessageDialog(null, "" + distrito);
        JOptionPane.showMessageDialog(null, "" + provincia);
        JOptionPane.showMessageDialog(null, "" + pais);
        JOptionPane.showMessageDialog(null, "" + codigoPostal);
        JOptionPane.showMessageDialog(null, "" + telMovil);
        JOptionPane.showMessageDialog(null, "" + telHabitacion);
        JOptionPane.showMessageDialog(null, "" + numCasa);
        JOptionPane.showMessageDialog(null, "" + colorCasa);
    }
    
    public void IngresarUbicacion(){
        direccionResidencia = JOptionPane.showInputDialog("Ingrese la dirección de residencia: ");
        mostrar(direccionResidencia);
    }
    
    public void IngresarCantidadDeFamiliaresDeLaVivienda(){
        
    }
    
    public void AgregartelHabitacion(){
        String telHabitacionlectura = JOptionPane.showInputDialog("Ingrese el teléfono de habitación: ");
        telHabitacion = Integer.parseInt(telHabitacionlectura);
    }
    
    public void AgregarnumCasa(){
        String numCasalectura = JOptionPane.showInputDialog("Ingrese el número de casa: ");
        numCasa = Integer.parseInt(numCasalectura);
    }
    
    public void IngresarcodigoPostal(){
        String codigoPostallectura = JOptionPane.showInputDialog("Ingrese el código Postal: ");
        codigoPostal = Integer.parseInt(codigoPostallectura);
    }
    
    public void AgregarDatosEspeciales(){
        String telMovillectura = JOptionPane.showInputDialog("Ingrese el número de teléfono móvil: ");
        telMovil = Integer.parseInt(telMovillectura);
        colorCasa = JOptionPane.showInputDialog("Ingrese el color de casa: ");
        mostrar(colorCasa);
    }
    
    public void IngresarMontoAlquiler(){
        
    }
    
    public void CalcularMontoDeServiciosPublicos(){
        
    }
    
    public void IngresarAccesoInternet(){
        
    }
}
