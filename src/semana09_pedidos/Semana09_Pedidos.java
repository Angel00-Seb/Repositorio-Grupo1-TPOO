package semana09_pedidos;


public class Semana09_Pedidos {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE PEDIDOS ===");
        
        // 1. Categorías
        Categoria catPan = new Categoria(100, "Panes");
        Categoria catPastel = new Categoria(200, "Pasteles");
        
        // 2. Productos
        Producto producto1 = new Producto(101, "Pan De Trigo", 0.20, "Disponible", catPan);
        Producto producto2 = new Producto(201, "Pastel De Fresas",40.90, "Disponible", catPastel);
        Producto producto3 = new Producto(102, "Pan De Torta", 0.20, "Disponible", catPan);
        
        System.out.println("PRODUCTOS CREADOS:");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println();
        
        // 3. Cliente Natural
        Natural clienteNatural = new Natural(
            201,
            "Perez Garcia", 
            "Juan Carlos", 
            "01-08-2005",
            "12345678", 
            "M",
            "Av. Arequipa 1234", 
            "987654321", 
            "juan.perez@email.com"
        );
        
        // 4. Cliente Jurídico
        Juridico clienteJuridico = new Juridico(
            202,
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
        
        // 5. Puesto y Personal
        Puesto puestoVendedor = new Puesto("Vendedor", 1500.00);
        Personal vendedor = new Personal(
            301,
            "Ramirez", 
            "Carlos",
            "1990-05-10", 
            "87654321",
            puestoVendedor
        );
        
        System.out.println("PERSONAL CREADO:");
        System.out.println(vendedor);
        System.out.println();
        
        // 6. Crear pedido
        Pedido pedido1 = new Pedido(
            401,
            "15-05-2025",
            false, // estado
            clienteNatural,
            vendedor,
            0.0
        );        
        // 7. Agregar detalles al pedido
        PedidoDetalle detalle1 = new PedidoDetalle(1, 2, producto1);
        PedidoDetalle detalle2 = new PedidoDetalle(2, 3, producto2);
        
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
        Pedido pedido2 = new Pedido(
            402,
            "16-05-2025",
            false, // pendiente
            clienteJuridico,    
            vendedor,
            0.0
        );
        // Detalle del pedido (idDetalle, cantidad, producto)
        PedidoDetalle detalle3 = new PedidoDetalle(3, 5, producto3);

        // Agregar el detalle al pedido
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
