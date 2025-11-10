package semana09_pedidos;
import java.util.ArrayList;

public class Pedido {
    private int idPedido; // agregado
    private String Fecha; // cambiarlo por String, estaba en Date
    private boolean Estado;
    private double Total; // agregado
    private Cliente Cliente; // Relación con Cliente (1:n)
    private Personal Personal; // Relación con Personal (1:n)
    private ArrayList<PedidoDetalle> Detalle; // Relación con PedidoDetalle (1:n)

    public Pedido() {
        this.Detalle = new ArrayList<>(); //agregado, solo crea la lista vacía al construir el objeto
    }

    public Pedido(int idPedido, String Fecha, boolean Estado, Cliente Cliente, Personal Personal,  double Total) {
        this.idPedido = idPedido;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.Total = Total;
        this.Cliente = Cliente;
        this.Personal = Personal;
        this.Detalle = new ArrayList<>();
    }
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Personal getPersonal() {
        return Personal;
    }

    public void setPersonal(Personal Personal) {
        this.Personal = Personal;
    }

    public ArrayList<PedidoDetalle> getDetalle() {
        return Detalle;
    }

    public void setDetalle(ArrayList<PedidoDetalle> Detalle) { // Si se reemplaza la lista, considerar recalcular
        this.Detalle = Detalle;
    }

    @Override
    public String toString() {
        return "ID_PEDIDO: " + idPedido + ", FECHA: " + Fecha + ", ESTADO: " + Estado + ", TOTAL: " + Total + ", CLIENTE: " + Cliente + ", PERSONAL: " + Personal + ", DETALLE: " + Detalle;
    }

    // Métodos adicionales
    public void agregarDetalle(PedidoDetalle detalle) {
        this.Detalle.add(detalle);
        this.Total = calcularTotal();
    }

    public double calcularTotal() {
        double total = 0;
        for (PedidoDetalle detalle : Detalle) {
            total += detalle.calcularSubtotal();
        }
        return total;
    }

    public void marcarComoFinalizado() { // Cambia el estado del pedido a "finalizado" (entregado o completado)
    this.Estado = true;
    }

    public void marcarComoPendiente() { // Cambia el estado del pedido a "pendiente" (aún en proceso o sin entregar)
    this.Estado = false;
    }

}
