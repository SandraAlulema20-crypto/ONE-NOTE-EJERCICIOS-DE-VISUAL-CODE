import java.util.Scanner;

public class  cafeteria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir productos y precios
        String[] productos = {"Café americano", "Latte", "Capuchino", "Té", "Sandwich", "Pastel"};
        double[] precios = {2.50, 3.00, 3.50, 2.00, 4.50, 3.00};

        // Mostrar menú
        System.out.println("===== MENÚ CAFETERÍA UNIVERSITARIA =====");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, productos[i], precios[i]);
        }
        System.out.println("========================================");

        // Selección del producto
        System.out.print("Seleccione el número de producto: ");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > productos.length) {
            System.out.println("Opción inválida.");
            return;
        }

        // Cantidad
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a cero.");
            return;
        }

        // Cálculo del total
        double subtotal = precios[opcion - 1] * cantidad;
        double descuento = 0.0;

        if (subtotal >= 10.0) {
            descuento = subtotal * 0.10; // 10% de descuento
        }

        double total = subtotal - descuento;

        // Mostrar resumen
        System.out.println("\n--- RESUMEN DE COMPRA ---");
        System.out.printf("Producto: %s%n", productos[opcion - 1]);
        System.out.printf("Cantidad: %d%n", cantidad);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        if (descuento > 0) {
            System.out.printf("Descuento (10%%): -$%.2f%n", descuento);
        }
        System.out.printf("Total a pagar: $%.2f%n", total);

        scanner.close();
    }
}
