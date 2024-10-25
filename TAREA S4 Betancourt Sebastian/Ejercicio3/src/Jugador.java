public class Jugador {
    private String nombre;
    private int anioNacimiento;
    private int numeroCamiseta;

    public Jugador(String nombre, int anioNacimiento, int numeroCamiseta) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de Nacimiento: " + anioNacimiento);
        System.out.println("Número de Camiseta: " + numeroCamiseta);
    }

    public double calcularVenta(int cantidad) {
        return cantidad * 25.00; // Cada camiseta cuesta $25.00
    }
}