package semana09_pedidos;


public class Producto {
    private int idProducto;
    private String Nombre;
    private double Precio;
    private String Estado;
    private Categoria Categoria; //Relación con Categoria (1:n)

    public Producto() {
    }

    public Producto(int idProducto, String Nombre, double Precio, String Estado, Categoria Categoria) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Estado = Estado;
        this.Categoria = Categoria;
    }
    // Get y set
    public int getidProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", Nombre= " + Nombre + ", Precio=" + Precio + ", Estado=" + Estado + ", Categoria=" + Categoria + '}';
    }
    
}
