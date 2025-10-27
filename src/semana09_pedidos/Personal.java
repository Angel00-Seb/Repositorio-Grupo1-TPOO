package semana09_pedidos;
import java.util.Date;


public class Personal {
    private String Apellidos;
    private String Nombres;
    private Date Fecha_Nacimiento;
    private String Dni;
    private Puesto Puesto; //Relación con Puesto (1:1)

    public Personal() {
    }

    public Personal(String Apellidos, String Nombres, Date Fecha_Nacimiento, String Dni, Puesto Puesto) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Dni = Dni;
        this.Puesto = Puesto;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public Puesto getPuesto() {
        return Puesto;
    }

    public void setPuesto(Puesto Puesto) {
        this.Puesto = Puesto;
    }

    @Override
    public String toString() {
        return "Personal{" + "Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Dni=" + Dni + ", Puesto=" + Puesto + '}';
    }
    
}
