// PSEUDOCÓDIGO PREVIO:
// INICIO
//   Leer numero
//   SI numero > 0 ENTONCES
//     Escribir "Positivo"
//   SINO
//     Escribir "No positivo"
//   FIN SI
// FIN

import java.util.Scanner;

public class VerificarPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("No positivo");
        }
        
        sc.close();
    }
}