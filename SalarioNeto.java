public class SalarioNeto {
    public static void main(String[] args) {
        float salarioBruto = 800.0f;
        float descuentoIESS = salarioBruto * 0.0945f;
        float salarioNeto = salarioBruto - descuentoIESS;
        
        // Redondear al entero más cercano
        int resultado = Math.round(salarioNeto);
        System.out.println(resultado); // 724
    }
}
