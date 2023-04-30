import java.util.Date;

public class DVD extends Material {

    private String director;
    private int duracion;
    private String genero;
    private int unidades_disponibles;

    public DVD(String codigoID, Date fechaIngreso, String director, int duracion, String genero, int unidades_disponibles) {
        super(codigoID, fechaIngreso);
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.unidades_disponibles = unidades_disponibles;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getUnidades_disponibles() {
        return unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades_disponibles) {
        this.unidades_disponibles = unidades_disponibles;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirInformacionBasica();
        System.out.println("Código ID: " + getCodigoID());
        System.out.println("Fecha de ingreso: " + getFechaIngreso());
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion);
        System.out.println("Género: " + genero);
        System.out.println("Unidades disponibles: " + unidades_disponibles);
    }
}