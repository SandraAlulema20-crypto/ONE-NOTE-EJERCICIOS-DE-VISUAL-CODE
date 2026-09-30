import java.util.Scanner;

public class VentaEntradasCine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPagar = 0.0;
        int opcion;

        do {
            System.out.println("\n--- VENTA DE ENTRADAS DE CINE ---");
            System.out.println("1. Formato 2D ($5.00)");
            System.out.println("2. Formato 3D ($7.50)");
            System.out.println("3. Formato IMAX ($10.00)");
            System.out.println("4. Finalizar compra");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    double precioBase = 0.0;
                    if (opcion == 1) {
                        precioBase = 5.0;
                    } else if (opcion == 2) {
                        precioBase = 7.50;
                    } else {
                        precioBase = 10.0;
                    }

                    int edad;
                    do {
                        System.out.print("Ingrese la edad del cliente (0 a 120): ");
                        edad = scanner.nextInt();
                        if (edad < 0 || edad > 120) {
                            System.out.println("Error: Edad invalida. Debe estar entre 0 y 120.");
                        }
                    } while (edad < 0 || edad > 120);

                    double descuento = 0.0;
                    if (edad < 12) {
                        descuento = 0.30;
                    } else if (edad >= 65) {
                        descuento = 0.25;
                    }

                    double precioFinal = precioBase * (1 - descuento);
                    totalPagar += precioFinal;

                    System.out.println("Entrada procesada. Costo: $" + precioFinal);
                    break;

                case 4:
                    System.out.println("\nCompra finalizada.");
                    break;

                default:
                    System.out.println("Error: Opcion de menu invalida.");
                    break;
            }

        } while (opcion != 4);

        System.out.println("TOTAL FINAL A PAGAR: $" + totalPagar);
        scanner.close();
    }
}