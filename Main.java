package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CineService service = new CineService();
        
        System.out.println("=== CINE CAMPUS - SISTEMA DE COMPRA ===\n");
        
        try {
            // 1. Seleccionar formato
            System.out.println("Formatos disponibles:");
            System.out.println("1. 2D   - $8.00");
            System.out.println("2. 3D   - $11.00");
            System.out.println("3. IMAX - $14.00");
            System.out.print("Elige formato (1-3): ");
            int opcionFormato = scanner.nextInt();
            scanner.nextLine();
            String formato = service.obtenerFormato(opcionFormato);
            
            // 2. Cantidad de entradas
            System.out.print("Cantidad de entradas: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            service.validarCantidad(cantidad);
            
            // 3. Edad del comprador
            System.out.print("Edad del comprador: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            service.validarEdad(edad);
            
            // 4. Hora de la función
            System.out.print("Hora de la función (HH:MM, formato 24h): ");
            String horaStr = scanner.nextLine();
            java.time.LocalTime hora = service.obtenerHora(horaStr);
            
            // 5. Día de la semana
            System.out.print("Día de la semana (lunes/martes/miercoles/jueves/viernes/sabado/domingo): ");
            String diaStr = scanner.nextLine().toLowerCase();
            int diaSemana = service.obtenerDiaSemana(diaStr);
            
            // 6. Calcular total
            Compra compra = service.calcularTotal(formato, cantidad, edad, hora, diaSemana);
            
            // 7. Mostrar resumen
            System.out.println("\n--- RESUMEN DE COMPRA ---");
            System.out.println("Formato: " + formato);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Tipo de cliente: " + compra.getTipoCliente());
            System.out.println("Descuento aplicado: " + String.format("%.0f%%", compra.getPorcentajeDescuento() * 100));
            System.out.println("Recargo adicional: $" + String.format("%.2f", compra.getRecargo()));
            System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", compra.getTotal()));
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        scanner.close();
    }
}
