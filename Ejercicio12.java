import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        int totalVehiculos = 0;
        int totalHoras = 0;

        int carros = 0;
        int motos = 0;
        int bicicletas = 0;

        int estudiantes = 0;
        int docentes = 0;
        int visitantes = 0;

        double totalRecaudado = 0;
        double mayorPago = 0;
        double menorPago = 0;

        do {

            System.out.println("\n===== PARQUEADERO UNIVERSITARIO =====");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Mostrar recaudacion");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    if (totalVehiculos >= 50) {
                        System.out.println("Parqueadero lleno.");
                        break;
                    }

                    int tipo;
                    int rol;
                    int horas;
                    int boleto;

                    // TIPO
                    do {
                        System.out.println("\nTipo de vehiculo:");
                        System.out.println("1. Carro");
                        System.out.println("2. Moto");
                        System.out.println("3. Bicicleta");
                        System.out.print("Ingrese tipo: ");
                        tipo = sc.nextInt();

                    } while (tipo < 1 || tipo > 3);

                    // ROL
                    do {
                        System.out.println("\nRol:");
                        System.out.println("1. Estudiante");
                        System.out.println("2. Docente");
                        System.out.println("3. Visitante");
                        System.out.print("Ingrese rol: ");
                        rol = sc.nextInt();

                    } while (rol < 1 || rol > 3);

                    // HORAS
                    do {
                        System.out.print("\nIngrese horas (1-24): ");
                        horas = sc.nextInt();

                    } while (horas < 1 || horas > 24);

                    // BOLETO
                    do {
                        System.out.println("\nBoleto perdido:");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.print("Ingrese opcion: ");
                        boleto = sc.nextInt();

                    } while (boleto < 1 || boleto > 2);

                    // CONTAR TIPO
                    if (tipo == 1) {
                        carros++;
                    } else if (tipo == 2) {
                        motos++;
                    } else {
                        bicicletas++;
                    }

                    // CONTAR ROL
                    if (rol == 1) {
                        estudiantes++;
                    } else if (rol == 2) {
                        docentes++;
                    } else {
                        visitantes++;
                    }

                    // CALCULAR TARIFA
                    double tarifa;

                    if (rol == 1) {
                        tarifa = 0.50;
                    } else if (rol == 2) {
                        tarifa = 0.75;
                    } else {
                        tarifa = 1.00;
                    }

                    double pago = horas * tarifa;

                    // RECARGO
                    if (boleto == 1) {
                        pago = pago + 5.00;
                    }

                    totalVehiculos++;
                    totalHoras = totalHoras + horas;
                    totalRecaudado = totalRecaudado + pago;

                    // MAYOR Y MENOR PAGO
                    if (totalVehiculos == 1) {

                        mayorPago = pago;
                        menorPago = pago;

                    } else {

                        if (pago > mayorPago) {
                            mayorPago = pago;
                        }

                        if (pago < menorPago) {
                            menorPago = pago;
                        }
                    }

                    System.out.println("\nVehiculo registrado correctamente.");
                    System.out.printf("Pago: $%.2f%n", pago);

                    break;

                case 2:

                    System.out.println("\n===== ESTADISTICAS =====");

                    System.out.println(
                        "Vehiculos registrados: " + totalVehiculos
                    );

                    System.out.println("Carros: " + carros);
                    System.out.println("Motos: " + motos);
                    System.out.println("Bicicletas: " + bicicletas);

                    System.out.println("Estudiantes: " + estudiantes);
                    System.out.println("Docentes: " + docentes);
                    System.out.println("Visitantes: " + visitantes);

                    System.out.println(
                        "Total de horas: " + totalHoras
                    );

                    if (totalVehiculos > 0) {

                        double promedio =
                            (double) totalHoras / totalVehiculos;

                        System.out.printf(
                            "Promedio de permanencia: %.2f horas%n",
                            promedio
                        );

                        System.out.printf(
                            "Mayor pago: $%.2f%n",
                            mayorPago
                        );

                        System.out.printf(
                            "Menor pago: $%.2f%n",
                            menorPago
                        );

                    } else {

                        System.out.println(
                            "No hay vehiculos registrados."
                        );
                    }

                    break;

                case 3:

                    System.out.println("\n===== RECAUDACION =====");

                    System.out.printf(
                        "Total recaudado: $%.2f%n",
                        totalRecaudado
                    );

                    break;

                case 4:

                    System.out.println(
                        "\nPrograma finalizado."
                    );

                    break;

                default:

                    System.out.println(
                        "Opcion incorrecta."
                    );
            }

        } while (opcion != 4);

        sc.close();
    }
}
