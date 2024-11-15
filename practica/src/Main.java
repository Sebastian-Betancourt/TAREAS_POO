class Jugador {
    protected String nombre;
    protected int edad;
    protected String equipo;

    // Constructor
    public Jugador(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    // mostrarInfo
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Equipo: " + equipo);
    }
}

// Subclase Portero
class Portero extends Jugador {
    private int atajadas;
    private int golesRecibidos;

    // Constructor
    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos) {
        super(nombre, edad, equipo);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    // Sobreescritura del método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamada al método de la superclase
        System.out.println("Atajadas: " + atajadas);
        System.out.println("Goles Recibidos: " + golesRecibidos);
    }
}

// Subclase Defensa
class Defensa extends Jugador {
    private int bloqueos;

    // Constructor de la subclase Defensa
    public Defensa(String nombre, int edad, String equipo, int bloqueos) {
        super(nombre, edad, equipo);
        this.bloqueos = bloqueos;
    }

    // Sobreescritura del método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamada al método de la superclase
        System.out.println("Bloqueos: " + bloqueos);
    }
}

// Subclase Delantero
class Delantero extends Jugador {
    // Constructor de la subclase Delantero
    public Delantero(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo);
    }

    // Uso del método mostrarInfo de la superclase
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamada al método de la superclase
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear a los jugadores
        Portero portero = new Portero("Sebastian Betancourt", 30, "FC Barcelona", 60, 10);
        Defensa defensa = new Defensa("Jordan Portilla", 28, "Real Madrid", 75);
        Delantero delantero = new Delantero("Jairo Iza", 25, "Atletico Madrid");

        // Mostrar la informacion
        System.out.println("Información del Portero:");
        portero.mostrarInfo();

        System.out.println("\nInformación del Defensa:");
        defensa.mostrarInfo();

        System.out.println("\nInformación del Delantero:");
        delantero.mostrarInfo();
    }
}
