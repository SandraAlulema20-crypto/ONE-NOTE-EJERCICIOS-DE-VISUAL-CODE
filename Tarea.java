import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();
        String categoria;
        
        if (edad < 18) {
            categoria = "Joven";
        } else if (edad >= 18 && edad < 65) {
            categoria = "Adulto";
        } else {
            categoria = "Tercera Edad";
        }
        
        System.out.println("Categoría: " + categoria);
        sc.close();
    }
}