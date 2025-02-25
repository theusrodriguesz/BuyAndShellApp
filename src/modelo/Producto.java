package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import output.Output;

public class Producto {
    private String id;
    private String referencia;
    private String nombre;
    private byte unidades;
    private String creadoEl;
    private String modificadoEl;

    public Producto(String referencia, String nombre, byte unidades, String creadoEl) {
        this.id = UUID.randomUUID().toString();
        this.referencia = referencia;
        this.nombre = nombre;
        this.unidades = unidades;
        this.creadoEl = creadoEl;
        this.modificadoEl = "<Sin información>";
    }

    public String getReferencia() { return referencia; }
    public String getNombre() { return nombre; }
    public byte getUnidades() { return unidades; }
    public String getCreadoEl() { return creadoEl; }
    public String getModificadoEl() { return modificadoEl; }

    public void actualizarFechaModificacion(String nuevaFecha) {
        this.modificadoEl = nuevaFecha;
    }

    public void modificarUnidades(byte nuevasUnidades) {
        this.unidades = nuevasUnidades;
    }

    public static String obtenerFechaActual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HH:mm");
        return LocalDateTime.now().format(formatter);
    }

    @Override
    public String toString() {
        return referencia + " | " + nombre + " | " + unidades + " unidades | Creado: " + creadoEl + " | Modificado: " + modificadoEl;
    }
}
