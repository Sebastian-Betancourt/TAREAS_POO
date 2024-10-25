public class Personaje {
    private String nombre;
    private int añoNacimiento;
    private String telefono;

    // Constructor
    public Personaje(String nombre, int añoNacimiento, String telefono) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setter
    public void setTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Personaje
        Personaje personaje = new Personaje("Juan Pérez", 1990, "123-456-7890");

        // Mostrar los valores usando getters
        System.out.println("Nombre: " + personaje.getNombre());
        System.out.println("Año de Nacimiento: " + personaje.getAñoNacimiento());
        System.out.println("Teléfono: " + personaje.getTelefono());

        // Cambiar el número de teléfono usando el setter
        personaje.setTelefono("098-765-4321");

        // Mostrar el teléfono actualizado
        System.out.println("Teléfono actualizado: " + personaje.getTelefono());
    }
}
