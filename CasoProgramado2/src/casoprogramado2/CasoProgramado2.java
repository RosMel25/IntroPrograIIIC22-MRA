package casoprogramado2;

import javax.swing.JOptionPane;

public class CasoProgramado2 {

    public static void main(String[] args) {
        AdministrarProductos adminAr = new AdministrarProductos();
        adminAr.llenarArrProductos();
        boolean flag = true;

        do {

            int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Estás en el área de Stock"
                    + "\nIngrese 1: Agregar Producto"
                    + "\nIngrese 2: Mostrar Productos"
                    + "\nIngrese 3: Buscar Productos por ID"
                    + "\nIngrese 4: Calcular valor del stock"
                    + " \nIngrese 0: Salir"));

            switch (opcionMenu) {
                case 1:
                    adminAr.agregarProductos();
                    break;

                case 2:
                    adminAr.mostrarProductos();
                    break;

                case 3:
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del producto a buscar: "));
                    adminAr.extraerProductos(id);
                    break;

                case 4:
                    adminAr.calcularValorStock();
                    break;

                case 0:
                    flag = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opción correcta");

            }

        } while (flag);

    }
}
