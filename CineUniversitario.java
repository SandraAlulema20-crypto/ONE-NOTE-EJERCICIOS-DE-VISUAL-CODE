import java.util.Scanner;

public class CineUniversitario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== CINE UNIVERSITARIO =====");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Consultar precios");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    // Validar edad
                    int edad;

                    do {
                        System.out.print("Ingrese su edad: ");
                        edad = sc.nextInt();

                        if (edad < 0) {
                            System.out.println("Edad no valida.");
                        }

                    } while (edad < 0);

                    // Seleccionar formato
                    System.out.println("\n===== FORMATOS =====");
                    System.out.println("1. 2D   - $5.00");
                    System.out.println("2. 3D   - $7.00");
                    System.out.println("3. IMAX - $10.00");
                    System.out.print("Seleccione el formato: ");

                    int formato = sc.nextInt();

                    double precio = 0;
                    double recargo = 0;

                    switch (formato) {

                        case 1:
                            precio = 5.00;
                            recargo = 0;
                            break;

                        case 2:
                            precio = 7.00;
                            recargo = 1.00;
                            break;

                        case 3:
                            precio = 10.00;
                            recargo = 2.00;
                            break;

                        default:
                            System.out.println("Formato no valido.");
                            continue;
                    }

                    // Aplicar promocion segun edad
                    double descuento = 0;

                    if (edad <= 17) {
                        descuento = precio * 0.10;
                        System.out.println("Promocion: Joven - 10% de descuento");

                    } else if (edad >= 18 && edad < 65) {
                        descuento = precio * 0.20;
                        System.out.println("Promocion: Adulto - 20% de descuento");

                    } else {
                        descuento = precio * 0.30;
                        System.out.println("Promocion: Tercera edad - 30% de descuento");
                    }

                    // Calcular total
                    double subtotal = precio - descuento;
                    double total = subtotal + recargo;

                    // Mostrar resultado
                    System.out.println("\n===== RESUMEN DE COMPRA =====");
                    System.out.printf("Precio: $%.2f%n", precio);
                    System.out.printf("Descuento: $%.2f%n", descuento);
                    System.out.printf("Recargo: $%.2f%n", recargo);
                    System.out.printf("TOTAL A PAGAR: $%.2f%n", total);

                    break;

                case 2:

                    System.out.println("\n===== PRECIOS =====");
                    System.out.println("2D   - $5.00");
                    System.out.println("3D   - $7.00 + $1.00 de recargo");
                    System.out.println("IMAX - $10.00 + $2.00 de recargo");

                    System.out.println("\n===== PROMOCIONES =====");
                    System.out.println("Joven (0-17):       10% de descuento");
                    System.out.println("Adulto (18-64):     20% de descuento");
                    System.out.println("Tercera edad (65+): 30% de descuento");

                    break;

                case 3:
                    System.out.println("Gracias por visitar el Cine Universitario.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
