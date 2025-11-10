package semana09_pedidos;


public class Puesto {
    private String Nombre;
    private double Sueldo;

    public Puesto() {
    }

    public Puesto(String Nombre, double Sueldo) {
        this.Nombre = Nombre;
        this.Sueldo = Sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Puesto{" + "Nombre=" + Nombre + ", Sueldo=" + Sueldo + '}';
    }
    
}
