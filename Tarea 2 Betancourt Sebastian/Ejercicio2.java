import java.util.Scanner;

class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
    private String fechaIngreso;

    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado[] empleados = new Empleado[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Fecha de Ingreso (dd/mm/aaaa): ");
            String fechaIngreso = scanner.nextLine();

            empleados[i] = new Empleado(nombre, cargo, salario, fechaIngreso);
            System.out.println(); // Línea en blanco para mejor legibilidad
        }

        System.out.println("Información de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println(); // Línea en blanco para mejor legibilidad
        }
        scanner.close();
    }
}
