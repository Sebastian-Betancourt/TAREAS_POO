import java.util.Scanner;

class Empleado {
    // Atributos privados
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class Main {
    public static void main(String[] args) {
// Crear un objeto Empleado con datos "quemados"
        Empleado empleado1 = new Empleado("Jordan Portilla", 20, 450);

// Crear Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

// Pedir datos al usuario
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

// Crear segundo objeto Empleado con datos ingresados por el usuario
        Empleado empleado2 = new Empleado(nombre, edad, salario);

// Mostrar información de ambos empleados
        System.out.println("\nEmpleado 1:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: " + empleado1.getSalario());

        System.out.println("\nEmpleado 2:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());

// Cerrar el scanner
        scanner.close();
    }
}