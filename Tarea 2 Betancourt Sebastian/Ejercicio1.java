import java.util.Scanner;
class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    private int numeroCamiseta;

    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 37, 10);
        Jugador jugador2 = new Jugador("Cristiano Ronaldo", "Delantero", 39, 7);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del tercer jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la posición: ");
        String posicion = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el número de camiseta: ");
        int numeroCamiseta = scanner.nextInt();

        Jugador jugador3 = new Jugador(nombre, posicion, edad, numeroCamiseta);

        System.out.println("\nInformación de los jugadores:");
        jugador1.mostrarInformacion();
        System.out.println();
        jugador2.mostrarInformacion();
        System.out.println();
        jugador3.mostrarInformacion();


        scanner.close();
    }
}