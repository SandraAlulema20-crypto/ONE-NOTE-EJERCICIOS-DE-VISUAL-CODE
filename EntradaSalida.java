import java.util.Scanner; // Para entrada de datos

public class EntradaSalida {
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner(System.in);
        
        // Leer valor (equivalente a cin >> x)
        x = teclado.nextInt();
        
        // Mostrar valor (equivalente a cout << x)
        System.out.println(x);
        
        teclado.close();
    }
}