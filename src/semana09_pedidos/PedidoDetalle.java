package semana09_pedidos;


public class PedidoDetalle {
    private int idDetalle; // agregado
    private double Importe;
    private int Cantidad;
    private Producto Producto; //Relación con Producto (1:n)

    public PedidoDetalle() {
    }

    public PedidoDetalle(int idDetalle, int Cantidad, Producto Producto) {
        this.idDetalle = idDetalle;
        this.Cantidad = Cantidad;
        this.Producto = Producto;
        this.Importe = calcularSubtotal(); // Calcula el importe automáticamente 
    }

    // Get y set
    public int getIdDetalle()
    {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
        this.Importe = calcularSubtotal(); //recalcula el importe si cambia la cantidad
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
        this.Importe = calcularSubtotal(); //Recalcula si cambia el producto
    }

    @Override
    public String toString() {
        return "PedidoDetalle{" + "idDetalle=" + idDetalle + ", Importe=" + Importe + ", Cantidad=" + Cantidad + ", Producto=" + Producto + '}';
}
    
    //Métodos adicionales
    public double calcularSubtotal() {
        return (Producto != null ? Producto.getPrecio() : 0) * Cantidad;//Calcula el importe multiplicando el precio del producto por la cantidad
    }
}
