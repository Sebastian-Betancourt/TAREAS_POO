import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del plato: ");
        String nombrePlato = scanner.nextLine();

        System.out.print("Ingrese el precio del plato: ");
        double precioPlato = scanner.nextDouble();

        System.out.print("Ingrese la cantidad deseada: ");
        int cantidad = scanner.nextInt();

        // Crear una instancia de la clase Factura
        Factura factura = new Factura(nombrePlato, precioPlato, cantidad);

        // Mostrar la factura
        factura.mostrarFactura();

        // Cerrar el scanner
        scanner.close();
    }
}