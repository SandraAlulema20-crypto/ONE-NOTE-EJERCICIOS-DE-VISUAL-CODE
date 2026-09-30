import java.util.Scanner;
public class SeriePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int contador = 0;
        int suma = 0;
        double promedio;
        System.out.print("Ingrese N: ");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Error: N debe ser positivo.");
            System.out.print("Ingrese N nuevamente: ");
            n = sc.nextInt();
        }
        System.out.println("\nSerie:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
            contador++;
            suma += i;
        }
        if (contador > 0) {
            promedio = (double) suma / contador;
        } else {
            promedio = 0;
        }
        System.out.println("\nCantidad de pares: " + contador);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        sc.close();
    }
}
