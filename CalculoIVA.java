import java.util.Scanner;

public class CalculoIVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double IVA = 0.15; // Tasa 15% Ecuador
        
        // Entrada de datos
        System.out.print("Ingresa el subtotal de la factura: $");
        double subtotal = sc.nextDouble();
        
        // Cálculos
        double valorIVA = subtotal * IVA;
        double total = subtotal + valorIVA;
        
        // Salida formateada
        System.out.println("\n======= FACTURA =======");
        System.out.printf("Subtotal:   $ %.2f%n", subtotal);
        System.out.printf("IVA (15%%):  $ %.2f%n", valorIVA);
        System.out.printf("TOTAL:      $ %.2f%n", total);
        System.out.println("=======================");
        
        sc.close();
    }
}