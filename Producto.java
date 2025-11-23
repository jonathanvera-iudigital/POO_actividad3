public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private boolean disponible;

    public Producto(String nombre, String categoria, double precio, int stock, boolean disponible) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.disponible = disponible;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.printf("Precio: $%,.2f\n", precio);
        System.out.println("Stock: " + stock);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("-------------------------");
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            precio = precio - (precio * porcentaje / 100);
            System.out.printf("Nuevo precio tras %.2f%% de descuento: $%,.2f\n", porcentaje, precio);
        } else {
            System.out.println("Porcentaje de descuento inválido.");
        }
    }

    public void registrarCompra(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println(cantidad + " unidades añadidas al stock. Nuevo stock: " + stock);
        } else {
            System.out.println("Cantidad inválida para compra.");
        }
    }

    public void marcarComoDisponible() {
        disponible = true;
        System.out.println("Producto marcado como disponible.");
    }

    public void registrarVenta(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println(cantidad + " unidades vendidas. Stock restante: " + stock);
            if (stock == 0) {
                disponible = false;
                System.out.println("Producto agotado, marcado como no disponible.");
            }
        } else {
            System.out.println("Cantidad inválida para venta o stock insuficiente.");
        }
    }
}
