import java.util.Scanner;

public class Ejercicio11 {

    static final int MAX = 50;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tipo = new String[MAX];
        String[] rol = new String[MAX];
        int[] horas = new int[MAX];
        int[] dia = new int[MAX];
        boolean[] perdido = new boolean[MAX];
        double[] pago = new double[MAX];

        int totalVehiculos = 0;

        int[] contTipo = new int[3];
        int[] contRol = new int[3];

        int totalHoras = 0;
        double totalRecaudado = 0;
        double mayorPago = 0;
        double menorPago = Double.MAX_VALUE;

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println("    PARQUEADERO UNIVERSITARIO");
            System.out.println("==============================");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar vehículos registrados");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Mostrar recaudación");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    if (totalVehiculos >= MAX) {
                        System.out.println("Parqueadero lleno.");
                        break;
                    }

                    int t;

                    do {
                        System.out.print(
                                "Tipo (1-Carro, 2-Moto, 3-Bicicleta): ");
                        t = sc.nextInt();

                        if (t < 1 || t > 3) {
                            System.out.println("Tipo inválido.");
                        }

                    } while (t < 1 || t > 3);

                    int r;

                    do {
                        System.out.print(
                                "Rol (1-Estudiante, 2-Docente, 3-Visitante): ");
                        r = sc.nextInt();

                        if (r < 1 || r > 3) {
                            System.out.println("Rol inválido.");
                        }

                    } while (r < 1 || r > 3);

                    int h;

                    do {
                        System.out.print("Número de horas (1-24): ");
                        h = sc.nextInt();

                        if (h < 1 || h > 24) {
                            System.out.println(
                                    "Las horas deben estar entre 1 y 24.");
                        }

                    } while (h < 1 || h > 24);

                    int d;

                    do {
                        System.out.print("Día (1-Lun ... 7-Dom): ");
                        d = sc.nextInt();

                        if (d < 1 || d > 7) {
                            System.out.println("Día inválido.");
                        }

                    } while (d < 1 || d > 7);

                    int p;

                    do {
                        System.out.print(
                                "¿Boleto perdido? (1-Sí, 2-No): ");
                        p = sc.nextInt();

                        if (p < 1 || p > 2) {
                            System.out.println("Opción inválida.");
                        }

                    } while (p < 1 || p > 2);

                    // Guardar tipo
                    tipo[totalVehiculos] =
                            (t == 1) ? "Carro"
                            : (t == 2) ? "Moto"
                            : "Bicicleta";

                    // Guardar rol
                    rol[totalVehiculos] =
                            (r == 1) ? "Estudiante"
                            : (r == 2) ? "Docente"
                            : "Visitante";

                    horas[totalVehiculos] = h;
                    dia[totalVehiculos] = d;
                    perdido[totalVehiculos] = (p == 1);

                    // Contar tipo
                    contTipo[t - 1]++;

                    // Contar rol
                    contRol[r - 1]++;

                    // Calcular tarifa
                    double tarifa;

                    switch (r) {

                        case 1:
                            tarifa = 0.50;
                            break;

                        case 2:
                            tarifa = 0.75;
                            break;

                        default:
                            tarifa = 1.00;
                            break;
                    }

                    // Calcular pago
                    double valor = h * tarifa;

                    // Recargo por boleto perdido
                    if (perdido[totalVehiculos]) {
                        valor += 5.00;
                    }

                    pago[totalVehiculos] = valor;

                    totalHoras += h;
                    totalRecaudado += valor;

                    if (valor > mayorPago) {
                        mayorPago = valor;
                    }

                    if (valor < menorPago) {
                        menorPago = valor;
                    }

                    totalVehiculos++;

                    System.out.printf(
                            "Pago calculado: $%.2f%n", valor);

                    break;

                case 2:

                    System.out.println(
                            "\n===== VEHÍCULOS REGISTRADOS =====");

                    if (totalVehiculos == 0) {
                        System.out.println(
                                "No existen vehículos registrados.");
                    } else {

                        for (int i = 0; i < totalVehiculos; i++) {

                            System.out.println(
                                    "\nVehículo " + (i + 1));
                            System.out.println(
                                    "Tipo: " + tipo[i]);
                            System.out.println(
                                    "Rol: " + rol[i]);
                            System.out.println(
                                    "Horas: " + horas[i]);
                            System.out.println(
                                    "Día: " + dia[i]);
                            System.out.println(
                                    "Boleto perdido: "
                                    + (perdido[i] ? "Sí" : "No"));
                            System.out.printf(
                                    "Pago: $%.2f%n", pago[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.println(
                            "\n===== ESTADÍSTICAS =====");

                    System.out.println(
                            "Vehículos registrados: "
                            + totalVehiculos);

                    System.out.println(
                            "Carros: " + contTipo[0]);
                    System.out.println(
                            "Motos: " + contTipo[1]);
                    System.out.println(
                            "Bicicletas: " + contTipo[2]);

                    System.out.println(
                            "Estudiantes: " + contRol[0]);
                    System.out.println(
                            "Docentes: " + contRol[1]);
                    System.out.println(
                            "Visitantes: " + contRol[2]);

                    System.out.println(
                            "Total de horas: " + totalHoras);

                    if (totalVehiculos > 0) {

                        double promedio =
                                (double) totalHoras / totalVehiculos;

                        System.out.printf(
                                "Promedio de permanencia: %.2f horas%n",
                                promedio);

                        System.out.printf(
                                "Mayor pago: $%.2f%n",
                                mayorPago);

                        System.out.printf(
                                "Menor pago: $%.2f%n",
                                menorPago);
                    }

                    break;

                case 4:

                    System.out.println(
                            "\n===== RECAUDACIÓN =====");

                    System.out.printf(
                            "Total recaudado: $%.2f%n",
                            totalRecaudado);

                    break;

                case 5:

                    System.out.println(
                            "Programa finalizado.");

                    break;

                default:

                    System.out.println(
                            "Opción no válida.");

                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}