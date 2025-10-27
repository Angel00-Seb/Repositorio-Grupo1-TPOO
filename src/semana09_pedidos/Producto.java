package semana09_pedidos;


public class Producto {
    private double Precio;
    private String Estado;
    private Categoria Categoria; //Relación con Categoria (1:n)

    public Producto() {
    }

    public Producto(double Precio, String Estado, Categoria Categoria) {
        this.Precio = Precio;
        this.Estado = Estado;
        this.Categoria = Categoria;
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
        return "Producto{" + "Precio=" + Precio + ", Estado=" + Estado + ", Categoria=" + Categoria + '}';
    }
    
}
