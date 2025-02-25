package funciones;

import modelo.Producto;
import output.Output;
import input.Input;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Producto> productos;

    public Compra(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void comprarProducto() {
        String referencia = Input.leerString("Ingrese la referencia del producto: ");
        byte cantidad = Input.leerByte("Ingrese la cantidad a comprar: ");

        for (Producto p : productos) {
            if (p.getReferencia().equals(referencia)) {
                byte nuevasUnidades = (byte) Math.min(p.getUnidades() + cantidad, 127);
                p.modificarUnidades(nuevasUnidades);
                p.actualizarFechaModificacion(Producto.obtenerFechaActual());
                Output.mostrarMensaje("Compra realizada con éxito.");
                return;
            }
        }
        Output.mostrarMensaje("Producto no encontrado.");
    }
}
