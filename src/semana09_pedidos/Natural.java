package semana09_pedidos;


public class Natural extends Cliente{
    private String Apellidos;
    private String Nombres;
    private String Fecha_Nacimiento; // cambiar por string
    private String Dni;
    private String Sexo;

    public Natural() {
    }

    public Natural(int idCliente, String Apellidos, String Nombres, String Fecha_Nacimiento, String Dni, String Sexo, String Direccion, String Telefono, String Email) {
        super(idCliente, Direccion, Telefono, Email);
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Dni = Dni;
        this.Sexo = Sexo;
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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "'NATURAL' " + "APELLIDOS: " + Apellidos + ", NOMBRES: " + Nombres + ", FECHA_NACIMIENTO: " + Fecha_Nacimiento + ", DNI: " + Dni + ", SEXO: " + Sexo + super.toString();
    }
    
}
