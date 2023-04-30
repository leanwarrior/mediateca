import java.util.Date;

public class Revistas extends Material {
    private String titulo;
    private String editorial;
    private String periodicidad;
    private Date fechaPublicacion;
    private int unidadesDisponibles;

    public Revistas(String codigoID, Date fechaIngreso, String titulo, String editorial, String periodicidad, Date fechaPublicacion, int unidadesDisponibles) {
        super(codigoID, fechaIngreso);
        this.titulo = titulo;
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPublicacion = fechaPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirInformacionBasica();
        System.out.println("Titulo: " + titulo);
        System.out.println("Editorial: " + editorial);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("Fecha de Publicacion: " + fechaPublicacion);
        System.out.println("Unidades Disponibles: " + unidadesDisponibles);
    }
}