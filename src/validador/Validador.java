package validador;

public class Validador {
    public static boolean validarReferencia(String referencia) {
        return referencia.matches("^[A-Za-z0-9]{7}$"); // 7 caracteres alfanuméricos
    }

    public static boolean validarUnidades(byte unidades) {
        return unidades >= 0 && unidades <= 127;
    }
}
