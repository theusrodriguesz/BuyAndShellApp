package funciones;

import modelo.Producto;
import output.Output;
import input.Input;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;

    public Venta(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void venderProducto() {
        String referencia = Input.leerString("Ingrese la referencia del producto: ");
        byte cantidad = Input.leerByte("Ingrese la cantidad a vender: ");

        for (Producto p : productos) {
            if (p.getReferencia().equals(referencia)) {
                byte nuevasUnidades = (byte) Math.max(p.getUnidades() - cantidad, 0);
                p.modificarUnidades(nuevasUnidades);
                p.actualizarFechaModificacion(Producto.obtenerFechaActual());
                Output.mostrarMensaje("Venta realizada con éxito.");
                return;
            }
        }
        Output.mostrarMensaje("Producto no encontrado.");
    }
}
