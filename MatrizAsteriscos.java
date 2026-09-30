public class MatrizAsteriscos {
    public static void main(String[] args) {
        // Bucle externo: controla las filas (3 filas)
        for (int fila = 1; fila <= 3; fila++) {
            
            // Bucle interno: controla las columnas (4 asteriscos por fila)
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            
            // Salto de línea al terminar cada fila
            System.out.println();
        }
    }
}