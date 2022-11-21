package casoprogramadoNo1;

import Facturacion.Factura;
import Pesonas.Cliente;
import Pesonas.Colaborador;
import ProductosServicios.Producto;
import ProductosServicios.Servicio;
import Proveedores.Proveedor;
import Solicitudes.Pedido;
import javax.swing.JOptionPane;

public class CasoProgramado1 {

    public static void main(String[] args) {

        Producto producto1 = new Producto(001, "Camisa blanca para estampar", 4500);
        Producto producto2 = new Producto(002, "Camisa negra para estampar", 5000);
        Producto producto3 = new Producto(003, "Rollo de 100 etiquetas blancas para diseñar", 10000);
        Agregar agregar = new Agregar();
        Producto productoNuevo = null;
        Pedido pedidoNuevo = null;
        Colaborador colabNuevo = null;
        Factura facturaNueva = null;
        Servicico servicioNuevo = null;
        Servicio servicio1 = new Servicio(001, "Diseño de logo", 3500);
        Servicio servicio2 = new Servicio(002, "Diseño de etiqueta", 7000);
        Servicio servicio3 = new Servicio(003, "Fotografía", 10000);

        int intentos = 0;
        while (intentos < 3) {
            String usuario = JOptionPane.showInputDialog("Ingrese el usuario");
            String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña");

            if (usuario.equals("ADMINISTRADOR") && contraseña.equals("Admi001")) {
                System.out.println("Bienvenido al sistema estimado administrador");

                int contadorMenu = 1;

                while (contadorMenu != 0) {
                    int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para agregar un producto"
                            + "\nIngrese 2 para ver los productos" + "\nIngrese 3 para agregar un cliente" + "\nIngrese 4 para agregar el colaborador" + "\nIngrese 5 para realizar la factura"));

                    switch (opcionMenu) {

                        case 1:
                            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto"));
                            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del producto");
                            float precio = Float.valueOf(JOptionPane.showInputDialog("Ingrese el precio"));
                            agregar.agregarproducto(codigo, descripcion, precio);

                            JOptionPane.showMessageDialog(null, "Producto guardado con éxito");
                            break;

                        case 2:

                            System.out.println(productoNuevo);
                            System.out.println(producto1);
                            System.out.println(producto2);
                            System.out.println(producto3);
                            break;

                        case 3:
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del cliente");
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente"));
                            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente");
                            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del cliente"));
                            String correo = JOptionPane.showInputDialog("Ingrese el correo del cliente");

                            Cliente clienteNuev = new Cliente(nombre, cedula, direccion, telefono, correo);

                            JOptionPane.showMessageDialog(null, "Ingrese los datos del pedido");

                            String descripcio = JOptionPane.showInputDialog("Ingrese la descripcion del pedido");
                            int codigo1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del pedido"));

                            pedidoNuevo = agregar.agregarPedido(descripcio, codigo1, producto2, clienteNuev);

                            System.out.println(pedidoNuevo);
                            break;

                        case 4:
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del colaborador");
                            String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del colaborador");
                            int cedula1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del colaborador"));
                            String direccion1 = JOptionPane.showInputDialog("Ingrese la direccion del colaborador");
                            int telefono1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del colaborador"));
                            String correo1 = JOptionPane.showInputDialog("Ingrese el correo del colaborador");

                            colabNuevo = agregar.agregarColaborador(nombre1, cedula1, direccion1, telefono1, correo1);

                            System.out.println(colabNuevo);

                            JOptionPane.showMessageDialog(null, "Colaborador guardado con éxito");

                            break;

                        case 5:
                            JOptionPane.showMessageDialog(null, "Ingrese los datos correspondientes para la factura");
                            int item_numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la factura"));
                            String nombreFACT = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de producto"));
                            int precioFACT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                            int costoTotal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo total"));

                            facturaNueva = agregar.agregarFactura(item_numero, nombreFACT, cantidad, precioFACT, costoTotal);

                            System.out.println(facturaNueva);

                            JOptionPane.showMessageDialog(null, "Factura realizada con éxito");

                            break;

                        case 0:
                            contadorMenu = opcionMenu;

                    }

                }

                intentos = 3;

            } else if (usuario.equals("COLABORADOR") && contraseña.equals("Colab001")) {
                System.out.println("Bienvenido al sistema estimado colaborador");

                int contadorMenu = 1;

                while (contadorMenu != 0) {
                    int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para agregar un proveedor" + "\nIngrese 2 para agregar un servicio"
                            + "\nIngrese 3 para ver los servicios"));

                    switch (opcionMenu) {

                        case 1:
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del proveedor");
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
                            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del proveedor"));
                            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del proveedor");
                            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del proveedor"));
                            String correo = JOptionPane.showInputDialog("Ingrese el correo del proveedor");

                            Proveedor proveedorNuevo = agregar.agregarProveedor(nombre, cedula, direccion, telefono, correo);

                            System.out.println(proveedorNuevo);
                            
                            JOptionPane.showMessageDialog(null, "Proveedor guardado con éxito");

                            break;

                        case 2:
                            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del servicio"));
                            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del servicio");
                            float precio = Float.valueOf(JOptionPane.showInputDialog("Ingrese el precio"));
                            agregar.agregarproducto(codigo, descripcion, precio);

                            JOptionPane.showMessageDialog(null, "Servicio guardado con éxito");
                            break;

                        case 3:

                            System.out.println(servicioNuevo);
                            System.out.println(servicio1);
                            System.out.println(servicio2);
                            System.out.println(servicio3);
                            break;

                        case 0:
                            contadorMenu = opcionMenu;

                    }

                }

                intentos = 3;

            } else {
                System.out.println("Eror, usuario o contraseña incorrectos, intente más tarde");
                intentos += 1;
            }
        }

    }
}
