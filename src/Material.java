import java.util.Date;

public abstract class Material {
    private String codigoID;
    private Date fechaIngreso;

    public Material(String codigoID, Date fechaIngreso) {
        this.codigoID = codigoID;
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // Método abstracto
    public abstract void imprimirDatos();

    // Implementación predeterminada para imprimir el ID y la fecha de ingreso
    public void imprimirInformacionBasica() {
        System.out.println("Codigo ID: " + codigoID);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }
}