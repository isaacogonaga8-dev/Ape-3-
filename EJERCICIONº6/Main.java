import java.util.Scanner;
public class EstadisticasCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Número de estudiantes: ");
            n = sc.nextInt();
        } while (n <= 0);

        double suma = 0, mayor = 0, menor = 10;
        int aprobados = 0, reprobados = 0;

        for (int i = 1; i <= n; i++) {
            double nota;
            do {
                System.out.print("Nota del estudiante " + i + " (0-10): ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) System.out.println("Nota inválida, debe estar entre 0 y 10.");
            } while (nota < 0 || nota > 10);

            suma += nota;
            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;
            if (nota >= 7) aprobados++; else reprobados++;
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Promedio general: %.2f%n", suma / n);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Aprobados: " + aprobados + " (" + String.format("%.1f", aprobados * 100.0 / n) + "%)");
        System.out.println("Reprobados: " + reprobados + " (" + String.format("%.1f", reprobados * 100.0 / n) + "%)");

        sc.close();
    }
}
