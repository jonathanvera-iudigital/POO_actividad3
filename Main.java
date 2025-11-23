public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Auriculares Bluetooth", "Electrónica", 120000, 15, true);
        Producto p2 = new Producto("Smartphone", "Electrónica", 900000, 8, true);
        Producto p3 = new Producto("Libro de Algoritmos", "Libros", 45000, 30, true);
        Producto p4 = new Producto("Camiseta Deportiva", "Ropa", 70000, 20, true);
        Producto p5 = new Producto("Mouse Inalámbrico", "Accesorios", 85000, 10, true);

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        p4.mostrarInformacion();
        p5.mostrarInformacion();

        // Aplico descuento
        System.out.println("Aplicando descuentos:");
        p1.aplicarDescuento(10);
        p3.aplicarDescuento(5);

        // Registro compra
        System.out.println("\nRegistrando compras:");
        p3.registrarCompra(20);
        p5.registrarCompra(5);

        // Marco como disponible
        System.out.println("\nMarcando productos como disponibles:");
        p4.marcarComoDisponible();

        // Registro venta
        System.out.println("\nRegistrando ventas:");
        p2.registrarVenta(3);
        p5.registrarVenta(15); // Intento de venta mayor al stock para mostrar manejo

        // Muestro información final para ver los cambios
        System.out.println("\nInformación final de productos:");
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        p4.mostrarInformacion();
        p5.mostrarInformacion();
    }
}
