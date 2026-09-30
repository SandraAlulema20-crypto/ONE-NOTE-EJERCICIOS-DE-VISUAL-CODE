public class Tarea1_Bucles {
    public static void main(String[] args) {
        int contExterior = 0, contInterior = 0, total = 0;
        System.out.println("=== Bucle Anidado ===");

        for (int i = 1; i <= 3; i++) {
            contExterior++;
            System.out.println("\n→ Exterior i = " + i + " (vuelta " + contExterior + ")");
            for (int j = 1; j <= 4; j++) {
                contInterior++; total++;
                System.out.println("   Interior j = " + j + " | vuelta int: " + contInterior + " | total: " + total);
            }
            contInterior = 0;
        }
        System.out.println("\nTotal iteraciones: " + total);
        System.out.println(total == 12 ? " Correcto" : " Error");
    }
}