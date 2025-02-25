package input;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static byte leerByte(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextByte()) {
            System.out.print("Ingrese un número válido: ");
            scanner.next();
        }
        byte valor = scanner.nextByte();
        scanner.nextLine();
        return valor;
    }
}
