package semana09_pedidos;


public class PedidoDetalle {
    private double Importe;
    private int Cantidad;
    private Producto Producto; //Relación con Producto (1:n)

    public PedidoDetalle() {
    }

    public PedidoDetalle(double Importe, int Cantidad, Producto Producto) {
        this.Importe = Importe;
        this.Cantidad = Cantidad;
        this.Producto = Producto;
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
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    @Override
    public String toString() {
        return "PedidoDetalle{" + "Importe=" + Importe + ", Cantidad=" + Cantidad + ", Pedido=" + Producto + '}';
    }
    
    //Métodos adicionales
    public double calcularSubtotal() {
        return Importe * Cantidad;
    }
}
