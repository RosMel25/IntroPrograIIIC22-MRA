package casoprogramadoNo1;

import Facturacion.Factura;
import Pesonas.Cliente;
import Pesonas.Colaborador;
import ProductosServicios.Producto;
import Solicitudes.Pedido;

public class Agregar {

    public Producto agregarproducto(int codigo, String descripcion, float precio) {
        Producto productoNuevo = new Producto(codigo, descripcion, precio);
        System.out.println(productoNuevo);

        return productoNuevo;
    }

    public Pedido agregarPedido(String descripcion, int codigo, Producto producto, Cliente cliente) {

        Pedido pedidoNuevo = new Pedido(descripcion, codigo, producto, cliente);

        return pedidoNuevo;
    }

    public Cliente agregarCliente(String nombre, int cedula, String direccion, int telefono, String correo) {

        Cliente clienteNuevo = new Cliente(nombre, cedula, direccion, telefono, correo);

        return clienteNuevo;
    }

    public Colaborador agregarColaborador(String nombre, int cedula, String direccion, int telefono, String correo) {

        Colaborador colabNuevo = new Colaborador(nombre, cedula, direccion, telefono, correo);

        return colabNuevo;

    }

    public Factura agregarFactura(int item_numero, String nombreFACT, int cantidad, int precioFACT, int costoTotal) {

        Factura facturaNueva = new Factura(item_numero, nombreFACT, cantidad, precioFACT, costoTotal);

        return facturaNueva;

    }

}
