package funciones;

import modelo.Producto;
import input.Input;
import output.Output;
import validador.Validador;
import java.util.ArrayList;

public class Altas {
    private ArrayList<Producto> productos;

    public Altas(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto() {
        String referencia;
        do {
            referencia = Input.leerString("Ingrese referencia (7 caracteres): ");
            if (!Validador.validarReferencia(referencia)) {
                Output.mostrarError("Referencia inválida.");
            }
        } while (!Validador.validarReferencia(referencia));

        byte unidades;
        do {
            unidades = Input.leerByte("Ingrese número de unidades (máx 127): ");
            if (!Validador.validarUnidades(unidades)) {
                Output.mostrarError("Número inválido.");
            }
        } while (!Validador.validarUnidades(unidades));

        productos.add(new Producto(referencia, unidades));
        Output.mostrarMensaje("Producto agregado.");
    }
}
