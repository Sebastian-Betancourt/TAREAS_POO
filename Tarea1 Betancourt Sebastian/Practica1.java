class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Practica1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Sebas", 20, "Masculino");
        Persona persona2 = new Persona("Justin", 20, "Masculino");
        persona1.presentarse();
        persona2.presentarse();
    }
}
