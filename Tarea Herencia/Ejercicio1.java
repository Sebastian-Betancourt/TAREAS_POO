// Clase Base Animal
class Animal {
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*Método hacer Sonido*/
    public String hacerSonido() {
        return "Sonido de animal.";
    }
}

// Subclase Perro
class Perro extends Animal {
    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribe el método hacerSonido
    @Override
    public String hacerSonido() {
        return "El perro ladra: ¡Guau, guau!";
    }
}

// Subclase Gato
class Gato extends Animal {
    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescribe el método hacerSonido
    @Override
    public String hacerSonido() {
        return "El gato maúlla: ¡Miau!";
    }
}

// Clase principal
public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro miPerro = new Perro("Rex", 3);
        Gato miGato = new Gato("Bonny", 2);

        // Mostrar nombre, edad y sonido del perro
        System.out.println("Perro:");
        System.out.println("Nombre: " + miPerro.getNombre());
        System.out.println("Edad: " + miPerro.getEdad() + " años");
        System.out.println(miPerro.hacerSonido());

        // Mostrar nombre, edad y sonido del gato
        System.out.println("\nGato:");
        System.out.println("Nombre: " + miGato.getNombre());
        System.out.println("Edad: " + miGato.getEdad() + " años");
        System.out.println(miGato.hacerSonido());
    }
}
