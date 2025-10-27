package semana09_pedidos;
import java.util.Date;


public class Semana09_Pedidos {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE PEDIDOS ===");
        
        // 1. Crear categorías
        Categoria catElectronica = new Categoria("Electronica");
        Categoria catRopa = new Categoria("Ropa");
        
        // 2. Crear productos
        Producto producto1 = new Producto(1500.50, "Disponible", catElectronica);
        Producto producto2 = new Producto(89.90, "Disponible", catRopa);
        Producto producto3 = new Producto(2500.00, "Disponible", catElectronica);
        
        System.out.println("PRODUCTOS CREADOS:");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println();
        
        // 3. Crear cliente natural
        Natural clienteNatural = new Natural(
            "Perez Garcia", 
            "Juan Carlos", 
            new Date(), 
            "12345678", 
            "M",
            "Av. Arequipa 1234", 
            "987654321", 
            "juan.perez@email.com"
        );
        
        // 4. Crear cliente jurídico
        Juridico clienteJuridico = new Juridico(
            "20123456789",
            "Empresa SAC",
            "014567891",
            "Maria Lopez",
            "Jr. Lampa 456",
            "014567890",
            "ventas@empresa.com"
        );
        
        System.out.println("CLIENTES CREADOS:");
        System.out.println(clienteNatural);
        System.out.println(clienteJuridico);
        System.out.println();
        
        // 5. Crear puesto y personal
        Puesto puestoVendedor = new Puesto("Vendedor", 1500.00);
        Personal vendedor = new Personal(
            "Ramirez", 
            "Carlos",
            new Date(), 
            "87654321",
            puestoVendedor
        );
        
        System.out.println("PERSONAL CREADO:");
        System.out.println(vendedor);
        System.out.println(puestoVendedor);
        System.out.println();
        
        // 6. Crear pedido
        Pedido pedido1 = new Pedido(new Date(), true, clienteNatural, vendedor);
        
        // 7. Agregar detalles al pedido
        PedidoDetalle detalle1 = new PedidoDetalle(1500.50, 2, producto1);
        PedidoDetalle detalle2 = new PedidoDetalle(89.90, 3, producto2);
        
        pedido1.agregarDetalle(detalle1);
        pedido1.agregarDetalle(detalle2);
        
        System.out.println("PEDIDO CREADO:");
        System.out.println(pedido1);
        System.out.println("\nDETALLES DEL PEDIDO:");
        for (PedidoDetalle detalle : pedido1.getDetalle()) {
            System.out.println(detalle);
        }
        System.out.println("\nTOTAL DEL PEDIDO: S/ " + pedido1.calcularTotal());
        System.out.println();
        
        // 8. Crear otro pedido con cliente jurídico
        Pedido pedido2 = new Pedido(new Date(), true, clienteJuridico, vendedor);
        PedidoDetalle detalle3 = new PedidoDetalle(2500.00, 5, producto3);
        pedido2.agregarDetalle(detalle3);
        
        System.out.println("\nSEGUNDO PEDIDO:");
        System.out.println(pedido2);
        System.out.println("\nDETALLES:");
        for (PedidoDetalle detalle : pedido2.getDetalle()) {
            System.out.println(detalle);
        }
        System.out.println("\nTOTAL DEL PEDIDO: S/ " + pedido2.calcularTotal());
    }
    
}
