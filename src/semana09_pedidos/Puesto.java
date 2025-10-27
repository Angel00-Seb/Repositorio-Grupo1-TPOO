package semana09_pedidos;


public class Puesto {
    private String Descripcion;
    private double Sueldo;

    public Puesto() {
    }

    public Puesto(String Descripcion, double Sueldo) {
        this.Descripcion = Descripcion;
        this.Sueldo = Sueldo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Puesto{" + "Descripcion=" + Descripcion + ", Sueldo=" + Sueldo + '}';
    }
    
}
