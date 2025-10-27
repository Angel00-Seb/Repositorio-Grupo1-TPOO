package semana09_pedidos;
import java.util.ArrayList;
import java.util.Date;


public class Pedido {
    private Date Fecha;
    private boolean Estado;
    private Cliente Cliente; //Relación con Cliente (1:n)
    private Personal Personal; //Relación con Personal (1:n)
    private ArrayList<PedidoDetalle> Detalle; //Relación con PedidoDetalle (1:n)

    public Pedido() {
    }

    public Pedido(Date Fecha, boolean Estado, Cliente Cliente, Personal Personal) {
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.Cliente = Cliente;
        this.Personal = Personal;
        this.Detalle = new ArrayList<>();
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
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

    public void setDetalle(ArrayList<PedidoDetalle> Detalle) {
        this.Detalle = Detalle;
    }

    @Override
    public String toString() {
        return "Pedido{" + "Fecha=" + Fecha + ", Estado=" + Estado + ", Cliente=" + Cliente + ", Personal=" + Personal + ", Detalle=" + Detalle + '}';
    }
    
    // Métodos adicionales
    public void agregarDetalle(PedidoDetalle detalle) {
        this.Detalle.add(detalle);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (PedidoDetalle detalle : Detalle) {
            total += detalle.calcularSubtotal();
        }
        return total;
    }
}
