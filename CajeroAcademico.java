import java.util.Scanner;
public class CajeroAcademico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 100.00;
        double totalDepositado = 0;
        double totalRetirado = 0;
        double monto;
        int contadorDepositos = 0;
        int contadorRetiros = 0;
        int opcion;
        do {
            System.out.println("\n=========================");
            System.out.println("     CAJERO ACADÉMICO");
            System.out.println("=========================");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar movimientos");
            System.out.println("5. Salir");
            System.out.println("=========================");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo disponible: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el depósito: $");
                    monto = sc.nextDouble();
                    while (monto < 0) {
                        System.out.println("Error: no se permiten depósitos negativos.");
                        System.out.print("Ingrese nuevamente: $");
                        monto = sc.nextDouble();
                    }
                    saldo += monto;
                    totalDepositado += monto;
                    contadorDepositos++;
                    System.out.println("Depósito realizado correctamente.");
                    break;
                case 3:
                    System.out.print("Ingrese el retiro: $");
                    monto = sc.nextDouble();
                    while (monto < 0 || monto > saldo) {
                        if (monto < 0) {
                            System.out.println("Error: no se permiten retiros negativos.");
                        } else {
                            System.out.println("Error: saldo insuficiente.");
                        }
                        System.out.print("Ingrese nuevamente: $");
                        monto = sc.nextDouble();
                    }
                    saldo -= monto;
                    totalRetirado += monto;
                    contadorRetiros++;
                    System.out.println("Retiro realizado correctamente.");
                    break;
                case 4:
                    System.out.println("\n===== MOVIMIENTOS =====");
                    System.out.println("Depósitos realizados: " + contadorDepositos);
                    System.out.println("Retiros realizados: " + contadorRetiros);
                    System.out.printf("Total depositado: $%.2f%n", totalDepositado);
                    System.out.printf("Total retirado: $%.2f%n", totalRetirado);
                    break;
                case 5:
                    System.out.println("\n===== RESUMEN FINAL =====");
                    System.out.println("Depósitos realizados: " + contadorDepositos);
                    System.out.println("Retiros realizados: " + contadorRetiros);
                    System.out.printf("Total depositado: $%.2f%n", totalDepositado);
                    System.out.printf("Total retirado: $%.2f%n", totalRetirado);
                    System.out.printf("Saldo final: $%.2f%n", saldo);
                    break;
                default:
                    System.out.println("Error: opción inexistente.");
            }
        } while (opcion != 5);
        sc.close();
    }
}
