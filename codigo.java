import java.util.Scanner;
public class  codigo {
    public static void main(String[] args) {
        //  Entrada de datos
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        
        // Validación con condición
        if (numero > 0 && numero < 100) {
            System.out.println(" El número es positivo y está entre 0 y 100.");
        } else {
            System.out.println(" No cumple con el rango solicitado.");
        }
        
        sc.close();
    }
}


