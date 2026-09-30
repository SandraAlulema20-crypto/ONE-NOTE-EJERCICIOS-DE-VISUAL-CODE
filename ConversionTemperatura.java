public class ConversionTemperatura {
    public static void main(String[] args) {
        double fahrenheit = 98.0;
        
        // Orden correcto: primero paréntesis, luego multiplicación/división
        // En Java double/double da resultado decimal
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.printf("%.1f°F = %.4f°C%n", fahrenheit, celsius);
        
        // Conversión inversa para verificar: F = C × 9 / 5 + 32
        double fahrenheitRecalc = celsius * 9 / 5 + 32;
        System.out.printf("Verificación: %.1f°F%n", fahrenheitRecalc);
    }
}