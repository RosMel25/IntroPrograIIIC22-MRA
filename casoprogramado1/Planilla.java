package casoprogramado1;

public class Planilla extends Trabajadores {

    //atributos
    int cantidadHijos;
    private int cant_hijos;

    public Planilla() {

    }

    public Planilla(String nombre, String apellido, int identificacion, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas,
            int pago_horas, int cant_hijos) {
        super(nombre, apellido, identificacion, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pago_horas);
        this.cant_hijos = cant_hijos;
    }

    Planilla(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    @Override
    public double sueldoBruto() {
        return getHoras_trabajadas() * getPagoPorHora();
    }

    @Override
    public int horasExtras() {
        int horaExtras = getHoras_trabajadas() - 40;
        if (getHoras_trabajadas() > 40) {
            return getPagoPorHora() * 2 * horaExtras;
        } else {
            return 0;
        }
    }

    @Override
    public int cant_horas_extras() {
        int horasExtras = getHoras_trabajadas() - 40;
        if (getHoras_trabajadas() > 40) {
            return horasExtras;
        } else {
            return 0;
        }
    }

    private double bonoHijos() {
        if (getCant_hijos() > 0 && getCant_hijos() <= 2) {
            return sueldoBruto() * 0.032;
        } else if (getCant_hijos() > 2 && getCant_hijos() <= 4) {
            return sueldoBruto() * 0.05;
        } else if (getCant_hijos() > 4 && getCant_hijos() <= 6) {
            return sueldoBruto() * 0.075;
        } else {
            return 0.0;
        }
    }

    @Override
    public double sueldoNeto() {
        return sueldoBruto() + horasExtras() + bonoHijos();
    }

    @Override
    public String imprimirBoletaPago() {

        return "INFORME DEL TRABAJADOR" + "\n"
                + "---------------------" + "\n"
                + "                       " + "\n"
                + "Datos del Empleado" + "\n"
                + "Nombres: " + super.getNombre() + "\n"
                + "Apellidos: " + super.getApellido() + "\n"
                + "Identificación: " + super.getidentificacion() + "\n"
                + "Edad: " + super.getEdad() + "\n"
                + "Dirección: " + super.getDireccion() + "\n"
                + "Formación Academica: " + super.getFormacionAcademica() + "\n"
                + "Años de experiencia: " + super.getAñosExperiencia() + "\n"
                + "                        " + "\n"
                + "Resumen de Pago" + "\n"
                + "                       " + "\n"
                + "Sueldo Bruto: S/ " + this.sueldoBruto() + "\n"
                + "Horas Extras: " + cant_horas_extras() + "\n"
                + "Pago por horas Extras: S/ " + horasExtras() + "\n"
                + "Bono por hijos: S/ " + bonoHijos() + "\n"
                + "Sueldo Neto: S/ " + sueldoNeto();
    }

}
