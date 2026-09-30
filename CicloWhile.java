public class CicloWhile {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 3) {
            System.out.println("Contador: " + contador);
            contador++; // Importante: aumentar para no quedar infinito
        }
    }
}
