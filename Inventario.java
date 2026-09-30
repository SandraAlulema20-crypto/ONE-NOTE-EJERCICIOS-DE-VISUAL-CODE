public class Inventario {
    public static void main(String[] args) {
        int stock = 8;
        
        if (stock == 0) {
            System.out.println("Sin stock");
        } else if (stock < 10) {
            System.out.println("Stock crítico");
        } else if (stock < 50) {
            System.out.println("Stock normal");
        } else {
            System.out.println("Stock alto");
        }
    }
}
