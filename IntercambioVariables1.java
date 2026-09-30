public class IntercambioVariables1 {
    public static void main(String[] args) {
        int A = 5, B = 10;
        int temp;
        
        temp = A;   // Guardamos A antes de perderlo
        A = B;      // A recibe el valor de B
        B = temp;   // B recibe el valor original de A guardado en temp
        
        System.out.println("A = " + A);  // 10
        System.out.println("B = " + B);  // 5
    }
}