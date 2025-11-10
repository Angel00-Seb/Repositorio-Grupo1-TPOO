package semana09_pedidos;


public abstract class Cliente {
    private int idCliente; //Identificador de cliente
    private String Direccion;
    private String Telefono;
    private String Email;

    public Cliente() {
    }

    public Cliente(int idCliente, String Direccion, String Telefono, String Email) {
        this.idCliente = idCliente;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }
    //Getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    // Metodos del modelo UML
    public void registrar() {
    }
        public void actualizar() {
    }
    public void obtenerHistorialPedidos() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + idCliente + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Email=" + Email + '}';
    }
    
}
