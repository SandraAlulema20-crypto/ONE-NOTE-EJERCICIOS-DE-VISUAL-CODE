import java.util.Scanner;
public class Control1Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int aprobados = 0;
        int reprobados = 0;
        double suma = 0;
        double promedio;
        double nota;
        double notaAlta = 0;
        double notaBaja = 10;
        // Validación del número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Error. El número de estudiantes debe ser mayor que 0.");
            System.out.print("Ingrese nuevamente el número de estudiantes: ");
            n = sc.nextInt();
        }
        // Procesamiento de las calificaciones
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la calificación del estudiante "
                    + i + ": ");
            nota = sc.nextDouble();
            // Validación de la calificación
            while (nota < 0 || nota > 10) {
                System.out.println(
                        "Error. La calificación debe estar entre 0 y 10."
                );
                System.out.print("Ingrese nuevamente la calificación: ");
                nota = sc.nextDouble();
            }
            // Acumulación de notas
            suma = suma + nota;
            // Determinar aprobados y reprobados
            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
            // Determinar nota más alta
            if (nota > notaAlta) {
                notaAlta = nota;
            }
            // Determinar nota más baja
            if (nota < notaBaja) {
                notaBaja = nota;
            }
        }
        // Cálculo del promedio
        promedio = suma / n;
        // Resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Número de estudiantes: " + n);
        System.out.println("Suma de calificaciones: " + suma);
        System.out.println("Promedio general: " + promedio);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
        System.out.println("Nota más alta: " + notaAlta);
        System.out.println("Nota más baja: " + notaBaja);
        sc.close();
    }
}
