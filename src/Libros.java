import java.util.Date;

public class Libros extends Material {
    private String titulo;
    private String autor;
    private int numPaginas;
    private String ISBN;
    private String editorial;
    private int anioPublicacion;
    private int unidadesDisponibles;

    public Libros(String codigoID, Date fechaIngreso, String titulo, String autor, int numPaginas, String ISBN,
                 String editorial, int anioPublicacion, int unidadesDisponibles) {
        super(codigoID, fechaIngreso);
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Código ID: " + getCodigoID());
        System.out.println("Fecha de ingreso: " + getFechaIngreso());
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Editorial: " + editorial);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Unidades disponibles: " + unidadesDisponibles);
        super.imprimirInformacionBasica();
    }
}