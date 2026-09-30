import java.util.Scanner;

public class TabladeMultiplicar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tablaInicial, tablaFinal, multiplicadorMax;

        System.out.print("Tabla inicial: ");
        tablaInicial = sc.nextInt();

        System.out.print("Tabla final: ");
        tablaFinal = sc.nextInt();

        while (tablaInicial > tablaFinal) {
            System.out.println("Error: la tabla inicial no puede ser mayor que la final.");

            System.out.print("Tabla inicial: ");
            tablaInicial = sc.nextInt();

            System.out.print("Tabla final: ");
            tablaFinal = sc.nextInt();
        }

        System.out.print("¿Hasta qué multiplicador desea generar las tablas?: ");
        multiplicadorMax = sc.nextInt();

        while (multiplicadorMax <= 0) {
            System.out.println("Error: el multiplicador debe ser mayor que 0.");
            System.out.print("Ingrese nuevamente el multiplicador: ");
            multiplicadorMax = sc.nextInt();
        }

        for (int tabla = tablaInicial; tabla <= tablaFinal; tabla++) {

            System.out.println("\nTABLA DEL " + tabla);

            for (int multiplicador = 1;
                 multiplicador <= multiplicadorMax;
                 multiplicador++) {

                int resultado = tabla * multiplicador;

                System.out.println(
                    tabla + " x " + multiplicador + " = " + resultado
                );
            }
        }

        sc.close();
    }
}
