import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la clase Equipo
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        Equipo equipo = new Equipo(nombreEquipo);

        // Inscribir un jugador
        System.out.print("Ingrese el nombre del jugador: ");
        String nombreJugador = scanner.nextLine();

        System.out.print("Ingrese el año de nacimiento del jugador: ");
        int anioNacimiento = scanner.nextInt();

        System.out.print("Ingrese el número de camiseta del jugador: ");
        int numeroCamiseta = scanner.nextInt();

        equipo.inscribirJugador(nombreJugador, anioNacimiento, numeroCamiseta);

        // Mostrar información del jugador inscrito
        System.out.println("\nInformación del jugador inscrito:");
        equipo.mostrarJugador();

        // Modificar el número de camiseta
        System.out.print("\n¿Desea modificar el número de camiseta? (si/no): ");
        scanner.nextLine(); // Limpiar el buffer
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el nuevo número de camiseta: ");
            int nuevoNumeroCamiseta = scanner.nextInt();
            equipo.obtenerJugador().setNumeroCamiseta(nuevoNumeroCamiseta);
            System.out.println("Número de camiseta actualizado.");
            equipo.mostrarJugador(); // Mostrar la información actualizada
        }

        // Calcular total de venta de camisetas
        System.out.print("\nIngrese la cantidad de camisetas a vender: ");
        int cantidadVenta = scanner.nextInt();

        double totalVenta = equipo.obtenerJugador().calcularVenta(cantidadVenta);

        System.out.printf("Total de la venta: $%.2f\n", totalVenta);

        scanner.close();
    }
}