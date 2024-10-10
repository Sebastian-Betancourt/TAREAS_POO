class Libro {
    private String titulo;
    private String autor;
    private int paginaCount;

    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    public String infoLibro() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginaCount;
    }
}

public class Practica2 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("El túnel", "Ernesto Sabato", 288);

        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());
    }
}
