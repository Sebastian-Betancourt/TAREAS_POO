public class Equipo {
    private String nombreEquipo;
    private Jugador jugadorInscrito;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void inscribirJugador(String nombre, int anioNacimiento, int numeroCamiseta) {
        jugadorInscrito = new Jugador(nombre, anioNacimiento, numeroCamiseta);
    }

    public void mostrarJugador() {
        if (jugadorInscrito != null) {
            jugadorInscrito.mostrarInfo();
        } else {
            System.out.println("No hay jugador inscrito.");
        }
    }

    public Jugador obtenerJugador() {
        return jugadorInscrito;
    }
}