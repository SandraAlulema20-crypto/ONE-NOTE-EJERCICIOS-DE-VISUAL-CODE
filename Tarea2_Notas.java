import java.util.Scanner;
public class Tarea2_Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: "); double n1 = sc.nextDouble();
        System.out.print("Nota 2: "); double n2 = sc.nextDouble();
        System.out.print("Nota 3: "); double n3 = sc.nextDouble();
        double prom = (n1+n2+n3)/3;
        System.out.print("Asistencia (%): "); double asis = sc.nextDouble();
        System.out.print("Examen final: "); double exam = sc.nextDouble();
        double notaFin = prom*0.6 + exam*0.4;

        boolean ok = true; String motivo = "";
        if (asis < 70) { ok = false; motivo = "Asistencia insuficiente"; }
        else if (prom < 6) { ok = false; motivo = "Promedio parciales insuficiente"; }
        else if (exam < 6) { ok = false; motivo = "Examen final reprobado"; }

        System.out.printf("Promedio: %.2f | Nota Final: %.2f\n", prom, notaFin);
        System.out.println(ok ? "✅ APROBADO" : "❌ REPROBADO: " + motivo);
    }
}