package casoprogramado2;

import javax.swing.JOptionPane;

public class AdministrarProductos {

    Productos arrProductos[] = new Productos[10];

    public void agregarProductos() {

        int posicion = 0;
        boolean agregado = false;

        while (posicion < 10 && agregado == false) {

            if (arrProductos[posicion] == null) {
                System.out.println("Agregar producto");

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto: "));
                float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
                arrProductos[posicion] = new Productos(codigo, nombre, precio, cantidad);
                agregado = true;

                System.out.println("Producto agregardo con éxito");
            }

            posicion++;

        }

    }

    public void extraerProductos(int id) {
        boolean encontrado = false;
        int contador = 0;
        Productos product = null;
        while (contador < arrProductos.length && encontrado == false) {
            if (arrProductos[contador] == null) {
                contador = 11;
            } else {
                if (arrProductos[contador].getCodigo() == id) {
                    product = arrProductos[contador];
                    encontrado = true;
                }
                contador++;

            }

        }

        if (product == null) {
            System.out.println("No se encontró el producto");
        } else {
            System.out.println(product);
        }

    }

    public void llenarArrProductos() {
        arrProductos[0] = new Productos(001, "Vendas", 1000, 5);
        arrProductos[1] = new Productos(002, "Botiquin", 12000, 3);
        arrProductos[2] = new Productos(003, "Curitas", 100, 2);
        arrProductos[3] = new Productos(004, "Crema de rosas", 2500, 4);

    }

    public void mostrarProductos() {

        for (Productos arrProducto : arrProductos) {
            if (arrProducto != null) {
                System.out.println(arrProducto);
            }
        }

    }

    public void calcularValorStock() {
        float[][] mat;
        mat = new float[arrProductos.length][3];
        System.out.println(arrProductos.length);

        for (int i = 0; i < arrProductos.length; i++) {
            if (arrProductos[i] != null) {
                mat[i][0] = arrProductos[i].getCodigo();
                mat[i][1] = arrProductos[i].getCantidad();
                mat[i][2] = arrProductos[i].getPrecio();
            }

        }

        for (float[] mat1 : mat) {
            System.out.print("|");
            for (int y = 0; y < mat1.length; y++) {
                System.out.print(mat1[y]);
                if (y != mat1.length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        float sumatoria = 0;
        for (int x = 0; x < mat.length; x++) {
            if (arrProductos[x] != null) {
                sumatoria += mat[x][1] * mat[x][2];
            }
        }

        System.out.println("La sumatoria del stock de tienda es de: " + sumatoria);

    }
}
