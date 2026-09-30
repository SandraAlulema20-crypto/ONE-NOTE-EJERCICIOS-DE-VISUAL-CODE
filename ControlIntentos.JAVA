import java.util.Scanner;

public class ControlIntentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String claveCorrecta = "Java2026";
        int intentosRestantes = 3;
        boolean accesoConcedido = false;

        // Bucle while que se ejecuta mientras queden intentos y no se haya concedido el acceso
        while (intentosRestantes > 0 && !accesoConcedido) {
            System.out.print("Ingrese la contrase\u00f1a: ");
            String claveIngresada = scanner.nextLine();

            // Estructura if-else para validar la contraseña
            if (claveIngresada.equals(claveCorrecta)) {
                accesoConcedido = true;
                System.out.println("Acceso permitido");
            } else {
                intentosRestantes--; // Descuenta un intento

                if (intentosRestantes > 0) {
                    System.out.println("Contrase\u00f1a incorrecta. Te quedan " + intentosRestantes + " intento(s).");
                } else {
                    System.out.println("Usuario bloqueado");
                }
            }
        }

        scanner.close();
    }
}