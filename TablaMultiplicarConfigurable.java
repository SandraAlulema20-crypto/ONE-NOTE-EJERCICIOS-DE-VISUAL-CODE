import java.util.Scanner; 

  

public class TablaMultiplicarConfigurable { 

  

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

  

        int tablaInicial; 

        int tablaFinal; 

        int multiplicadorLimite; 

  

        // Entrada y validación del rango de tablas 

        System.out.print("Ingrese la tabla inicial: "); 

        tablaInicial = scanner.nextInt(); 

  

        System.out.print("Ingrese la tabla final: "); 

        tablaFinal = scanner.nextInt(); 

  

        // Validación: tabla inicial no debe ser mayor que tabla final 

        while (tablaInicial > tablaFinal) { 

            System.out.println("Error: La tabla inicial no puede ser mayor que la tabla final."); 

            System.out.print("Ingrese nuevamente la tabla inicial: "); 

            tablaInicial = scanner.nextInt(); 

            System.out.print("Ingrese nuevamente la tabla final: "); 

            tablaFinal = scanner.nextInt(); 

        } 

  

        // Desafío: permitir al usuario definir el multiplicador límite 

        System.out.print("Ingrese hasta qué multiplicador desea generar las tablas (ej. 10): "); 

        multiplicadorLimite = scanner.nextInt(); 

  

        while (multiplicadorLimite <= 0) { 

            System.out.print("Error: El multiplicador debe ser un entero positivo. Intente de nuevo: "); 

            multiplicadorLimite = scanner.nextInt(); 

        } 

  

        // Generación de tablas utilizando ciclos 'for' anidados 

        for (int i = tablaInicial; i <= tablaFinal; i++) { 

            System.out.println("\nTABLA DEL " + i); 

            for (int j = 1; j <= multiplicadorLimite; j++) { 

                System.out.println(i + " x " + j + " = " + (i * j)); 

            } 

        } 

  

        scanner.close(); 

    } 

} 