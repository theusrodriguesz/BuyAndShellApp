import funciones.Compra;
import funciones.Venta;
import funciones.Bajas;
import funciones.Listado;
import modelo.Producto;
import output.Output;
import input.Input;

import java.util.ArrayList;

public class SistemaApp {


    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Compra compra = new Compra(productos);
        Venta venta = new Venta(productos);
        Bajas bajas = new Bajas(productos);
        Listado listado = new Listado(productos);

        while (true) {
            Output.mostrarMenu();
            String opcion = Input.leerString("");

            switch (opcion) {
                case "1":
                    Output.mostrarTitulo("ALTA DE PRODUCTOS");
                    String referencia = Input.leerString("Ingrese la referencia del producto (7 caracteres): ");
                    String nombre = Input.leerString("Ingrese el nombre del producto: ");
                    byte unidades = Input.leerByte("Ingrese la cantidad de unidades: ");
                    String fechaCreacion = Producto.obtenerFechaActual();
                    productos.add(new Producto(referencia, nombre, unidades, fechaCreacion));
                    Output.mostrarMensaje("Producto agregado con éxito.");
                    break;
                case "2":
                    Output.mostrarTitulo("VENTA DE PRODUCTOS");
                    venta.venderProducto();
                    break;
                case "3":
                    Output.mostrarTitulo("COMPRA DE PRODUCTOS");
                    compra.comprarProducto();
                    break;
                case "4":
                    Output.mostrarTitulo("BAJA DE PRODUCTOS");
                    bajas.eliminarProducto();
                    break;
                case "5":
                    Output.mostrarTitulo("LISTADO DE PRODUCTOS");
                    listado.mostrarProductos();
                    break;
                case "6":
                    Output.mostrarTitulo("SALIENDO DEL SISTEMA");
                    Output.mostrarMensaje("Hasta luego.");
                    return;
                default:
                    Output.mostrarMensaje("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
