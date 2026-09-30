package com.cine;

import java.util.Scanner;

public class cine {
    public static void main(String[] args) {.java

        Scanner scanner = new Scanner(System.in);
        cineService service = new cineService();
        
        System.out.println("=== CINE CAMPUS - SISTEMA DE COMPRA ===\n");
        
        while (true) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Consultar precios");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    comprarEntrada(scanner, service);
                    break;
                case 2:
                    service.mostrarPrecios();
                    break;
                case 3:
                    System.out.println("Gracias por usar Cine Campus!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
    }
    
    private static void comprarEntrada(Scanner scanner, CineService service) {
        try {
            System.out.println("\n--- COMPRA DE ENTRADA ---");
            
            // 1. Seleccionar formato (R1)
            System.out.println("\nFormatos disponibles:");
            System.out.println("1. 2D   - $5.00");
            System.out.println("2. 3D   - $7.50");
            System.out.println("3. IMAX - $10.00");
            System.out.print("Elige formato (1-3): ");
            int opcionFormato = scanner.nextInt();
            scanner.nextLine();
            String formato = service.obtenerFormato(opcionFormato);
            
            // 2. Cantidad de entradas
            System.out.print("Cantidad de entradas: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            service.validarCantidad(cantidad);
            
            // 3. Edad del comprador (R2)
            System.out.print("Edad del comprador: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            service.validarEdad(edad);
            
            // 4. ¿Es estudiante? (R5)
            System.out.print("¿Es estudiante? (s/n): ");
            boolean esEstudiante = scanner.nextLine().toLowerCase().charAt(0) == 's';
            
            // 5. Día de la semana (R5, R6, R7)
            System.out.print("Dia de la semana (1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo): ");
            int dia = scanner.nextInt();
            scanner.nextLine();
            service.validarDia(dia);
            
            // 6. Calcular total (aplica todas las reglas)
            Compra compra = service.calcularTotal(formato, cantidad, edad, esEstudiante, dia);
            
            // 7. Mostrar resumen
            System.out.println("\n--- RESUMEN DE COMPRA ---");
            System.out.println("Formato: " + formato);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Estudiante: " + (esEstudiante ? "Si" : "No"));
            System.out.println("Dia: " + service.obtenerNombreDia(dia));
            System.out.println("Promocion aplicada: " + compra.getPromocionAplicada());
            System.out.println("Descuento: " + String.format("%.0f%%", compra.getPorcentajeDescuento() * 100));
            
            if (compra.getRecargo() > 0) {
                System.out.println("Recargo (IMAX fin de semana): +$" + String.format("%.2f", compra.getRecargo()));
            }
            
            System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", compra.getTotal()));
            
            if (compra.isComboCortesia()) {
                System.out.println("FELICITACIONES! Combo peque