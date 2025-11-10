package semana09_pedidos;

public class Personal {
    private int idPersonal;
    private String Apellidos;
    private String Nombres;
    private String Fecha_Nacimiento;
    private String Dni;
    private Puesto Puesto; // Relación con Puesto (1:1)

    public Personal() {
    }

    public Personal(int idPersonal, String Apellidos, String Nombres, String Fecha_Nacimiento, String Dni, Puesto Puesto) {
        this.idPersonal = idPersonal;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Dni = Dni;
        this.Puesto = Puesto;
    }

    // Getters y Setters
    public int getIdPersonal()
    {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
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

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
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
        return "Personal{" + "idPersonal= " + idPersonal + ", Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Fecha_Nacimiento="
                + Fecha_Nacimiento + ", Dni=" + Dni + ", Puesto=" + Puesto + '}';
    }

}
