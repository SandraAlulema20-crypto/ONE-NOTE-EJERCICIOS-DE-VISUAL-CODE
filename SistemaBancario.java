public class SistemaBancario {
    public static void main(String[] args) {
        float saldo = 50.0f;
        int intentosFallidos = 3;
        
        if (saldo < 0 || intentosFallidos >= 3) {
            System.out.println("Tarjeta bloqueada");
        } else {
            System.out.println("Acceso permitido");
        }
    }
}