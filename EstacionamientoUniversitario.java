import java.util.Scanner;
public class EstacionamientoUniversitario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo;
        double horas;
        double tarifa;
        double pago;
        int motocicletas = 0;
        int automoviles = 0;
        int camionetas = 0;
        int totalVehiculos = 0;
        double totalRecaudado = 0;
        char continuar;
        do {
            System.out.println("\n1. Motocicleta");
            System.out.println("2. Automóvil");
            System.out.println("3. Camioneta");
            System.out.print("Seleccione el tipo: ");
            tipo = sc.nextInt();
            while (tipo < 1 || tipo > 3) {
                System.out.println("Error: tipo inválido.");
                System.out.print("Seleccione nuevamente: ");
                tipo = sc.nextInt();
            }
            System.out.print("Horas estacionado: ");
            horas = sc.nextDouble();
            while (horas <= 0) {
                System.out.println("Error: las horas deben ser mayores que cero.");
                System.out.print("Ingrese nuevamente: ");
                horas = sc.nextDouble();
            }
            switch (tipo) {
                case 1:
                    tarifa = 0.50;
                    motocicletas++;
                    break;
                case 2:
                    tarifa = 1.00;
                    automoviles++;
                    break;
                default:
                    tarifa = 1.50;
                    camionetas++;
                    break;
            }
            pago = horas * tarifa;
            totalRecaudado += pago;
            totalVehiculos++;
            System.out.printf("Valor a pagar: $%.2f%n", pago);
            System.out.print("¿Desea registrar otro vehículo? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);
            while (continuar != 'S' && continuar != 'N') {
                System.out.println("Error: ingrese S o N.");
                System.out.print("¿Desea continuar? ");
                continuar = sc.next().toUpperCase().charAt(0);
            }
        } while (continuar == 'S');
        double promedio = 0;
        if (totalVehiculos > 0) {
            promedio = totalRecaudado / totalVehiculos;
        }
        System.out.println("\n===== REPORTE =====");
        System.out.println("Motocicletas: " + motocicletas);
        System.out.println("Automóviles: " + automoviles);
        System.out.println("Camionetas: " + camionetas);
        System.out.println("Total vehículos: " + totalVehiculos);
        System.out.printf("Total recaudado: $%.2f%n", totalRecaudado);
        System.out.printf("Promedio pagado: $%.2f%n", promedio);
        System.out.println("===================");
        sc.close();
    }
}

