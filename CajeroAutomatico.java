import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00; // Saldo inicial
        
        System.out.println("=== CAJERO AUTOMÁTICO ===");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                // Depositar
                System.out.print("Ingrese el monto a depositar: $");
                double deposito = scanner.nextDouble();
                if (deposito > 0) {
                    saldo += deposito;
                    System.out.printf("Depósito exitoso. Nuevo saldo: $%.2f\n", saldo);
                } else {
                    System.out.println("El monto debe ser mayor a cero.");
                }
                break;
                
            case 2:
                // Retirar
                System.out.print("Ingrese el monto a retirar: $");
                double retiro = scanner.nextDouble();
                if (retiro > 0 && retiro <= saldo) {
                    saldo -= retiro;
                    System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f\n", saldo);
                } else if (retiro > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    System.out.println("El monto debe ser mayor a cero.");
                }
                break;
                
            case 3:
                // Consultar saldo
                System.out.printf("Su saldo actual es: $%.2f\n", saldo);
                break;
                
            case 4:
                // Salir
                System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                break;
                
            default:
                System.out.println("Opción inválida. Por favor seleccione una opción del 1 al 4.");
                break;
        }
        
        scanner.close();
    }
}