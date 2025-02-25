package funciones;

import modelo.Producto;
import output.Output;
import input.Input;

import java.util.ArrayList;

public class Bajas {
    private ArrayList<Producto> productos;

    public Bajas(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void eliminarProducto() {
        String referencia = Input.leerString("Ingrese la referencia del producto a eliminar: ");
        productos.removeIf(p -> p.getReferencia().equals(referencia));
        Output.mostrarMensaje("Producto eliminado si existía.");
    }
}
