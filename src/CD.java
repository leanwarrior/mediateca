import java.util.Date;

public class CD extends Material {
    private String artista;
    private String genero;
    private int duracion;
    private int num_canciones;
    private int unidades_disponibles;

    public CD(String codigoID, Date fechaIngreso, String artista, String genero, int duracion, int num_canciones, int unidades_disponibles) {
        super(codigoID, fechaIngreso);
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.num_canciones = num_canciones;
        this.unidades_disponibles = unidades_disponibles;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumCanciones() {
        return num_canciones;
    }

    public void setNumCanciones(int num_canciones) {
        this.num_canciones = num_canciones;
    }

    public int getUnidadesDisponibles() {
        return unidades_disponibles;
    }

    public void setUnidadesDisponibles(int unidades_disponibles) {
        this.unidades_disponibles = unidades_disponibles;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirInformacionBasica();
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Duracion: " + duracion);
        System.out.println("Numero de canciones: " + num_canciones);
        System.out.println("Unidades disponibles: " + unidades_disponibles);
    }
}