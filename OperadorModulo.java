public class OperadorModulo {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        
        // % calcula el RESIDUO de la división entera
        // 10 / 3 = cociente 3, residuo 1
        int z = x % y;
        
        System.out.println("Residuo = " + z); // 1
        
        // Uso práctico: verificar si un número es par
        if (x % 2 == 0) {
            System.out.println(x + " es par");
        }
    }
}