import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        double suma = 0;
        double mayor = -1000;
        double menor = 1000;

        int frio = 0;
        int templado = 0;
        int calido = 0;
        int muyCalido = 0;

        double temperatura;

        System.out.print("Ingrese temperatura (999 para salir): ");
        temperatura = sc.nextDouble();

        while (temperatura != 999) {

            if (temperatura < -50 || temperatura > 60) {
                System.out.println("Dato inválido, ingrese un valor entre -50 y 60");
            } else {
                cantidad++;
                suma += temperatura;

                if (temperatura > mayor) {
                    mayor = temperatura;
                }

                if (temperatura < menor) {
                    menor = temperatura;
                }

                if (temperatura < 10) {
                    frio++;
                } else if (temperatura < 25) {
                    templado++;
                } else if (temperatura < 35) {
                    calido++;
                } else {
                    muyCalido++;
                }
            }

            System.out.print("Ingrese temperatura (999 para salir): ");
            temperatura = sc.nextDouble();
        }

        if (cantidad > 0) {
            double promedio = suma / cantidad;

            System.out.println("\n--- Resultados ---");
            System.out.println("Cantidad de datos válidos: " + cantidad);
            System.out.println("Temperatura mayor: " + mayor);
            System.out.println("Temperatura menor: " + menor);
            System.out.println("Promedio: " + promedio);
            System.out.println("Frío: " + frio);
            System.out.println("Templado: " + templado);
            System.out.println("Cálido: " + calido);
            System.out.println("Muy cálido: " + muyCalido);
        } else {
            System.out.println("No se ingresaron datos válidos.");
        }

        sc.close();
    }
}