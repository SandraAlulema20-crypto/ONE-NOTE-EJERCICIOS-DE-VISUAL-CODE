import java.util.Scanner; 
public class Control1calificaciones { 

  

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

  

        int n; 

        int aprobados = 0; 

        int reprobados = 0; 

        double suma = 0; 

        double notaAlta = Double.NEGATIVE_INFINITY; 

        double notaBaja = Double.POSITIVE_INFINITY; 

  

        // Validar número de estudiantes con 'while' 

        System.out.print("Ingrese el número de estudiantes (N > 0): "); 

        n = scanner.nextInt(); 

  

        while (n <= 0) { 

            System.out.print("Error: El número de estudiantes debe ser mayor que cero. Intente de nuevo: "); 

            n = scanner.nextInt(); 

        } 

  

        // Procesar calificaciones con 'for' 

        for (int i = 1; i <= n; i++) { 

            System.out.print("Ingrese la calificación del estudiante " + i + " (0 a 10): "); 

            double nota = scanner.nextDouble(); 

  

            // Validar rango de la calificación con 'while' 

            while (nota < 0 || nota > 10) { 

                System.out.print("Error: La calificación debe estar entre 0 y 10. Intente de nuevo: "); 

                nota = scanner.nextDouble(); 

            } 

  

            // Acumular y contar 

            suma += nota; 

  

            if (nota >= 7.0) { 

                aprobados++; 

            } else { 

                reprobados++; 

            } 

  

            // Actualizar nota más alta y más baja 

            if (nota > notaAlta) { 

                notaAlta = nota; 

            } 

            if (nota < notaBaja) { 

                notaBaja = nota; 

            } 

        } 

  

        // Calcular promedio general 

        double promedio = suma / n; 

  

        // Mostrar resultados 

        System.out.println("\n--- RESULTADOS ---"); 

        System.out.println("Número de estudiantes: " + n); 

        System.out.printf("Suma de calificaciones: %.2f\n", suma); 

        System.out.printf("Promedio general: %.2f\n", promedio); 

        System.out.println("Cantidad de aprobados: " + aprobados); 

        System.out.println("Cantidad de reprobados: " + reprobados); 

        System.out.printf("Nota más alta: %.2f\n", notaAlta); 

        System.out.printf("Nota más baja: %.2f\n", notaBaja); 

  

        scanner.close(); 

    } 

} 