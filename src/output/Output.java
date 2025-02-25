package output;

public class Output {
    public static void mostrarTitulo(String titulo) {
        System.out.println("\n========================");
        System.out.println(titulo);
        System.out.println("========================");
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarMenu() {
        System.out.println("\n---------------------------------");
        System.out.println("|      GESTIÓN DE INVENTARIO      |");
        System.out.println("|       COMPRA Y VENTA DE STOCK      |");
        System.out.println("---------------------------------");
        System.out.println("1 - Alta de productos");
        System.out.println("2 - Venta de productos");
        System.out.println("3 - Compra de productos");
        System.out.println("4 - Baja de productos");
        System.out.println("5 - Listar productos");
        System.out.println("6 - Salir");
        System.out.print("Seleccione una opción: ");
    }
}
