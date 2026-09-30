import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de estudiantes (N > 0): ");
        int estudiantes = sc.nextInt();
        while (estudiantes <= 0) {
            System.out.print("Valor invalido. Ingrese nuevamente: ");
            estudiantes = sc.nextInt();
        }

        System.out.print("Ingrese el numero de dias (> 0): ");
        int dias = sc.nextInt();
        while (dias <= 0) {
            System.out.print("Valor invalido. Ingrese nuevamente: ");
            dias = sc.nextInt();
        }

        char[][] asistencia = new char[estudiantes][dias];

        int totalPresentesCurso = 0; // contador
        int totalAusentesCurso = 0;  // contador

        
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");

            
            for (int j = 0; j < dias; j++) {
                System.out.print("Dia " + (j + 1) + " (P = presente, A = ausente): ");
                char valor = sc.next().toUpperCase().charAt(0);

                
                while (valor != 'P' && valor != 'A') {
                    System.out.print("Valor invalido. Ingrese P o A: ");
                    valor = sc.next().toUpperCase().charAt(0);
                }

                asistencia[i][j] = valor;
            }
        }

        System.out.println("\n----- RESUMEN DE ASISTENCIA -----");

        
        for (int i = 0; i < estudiantes; i++) {
            int presentesEstudiante = 0;
            int ausentesEstudiante = 0;

            for (int j = 0; j < dias; j++) {
                if (asistencia[i][j] == 'P') {
                    presentesEstudiante++;
                } else {
                    ausentesEstudiante++;
                }
            }

            totalPresentesCurso += presentesEstudiante;
            totalAusentesCurso += ausentesEstudiante;

            System.out.println("Estudiante " + (i + 1) + ": Presentes = "
                    + presentesEstudiante + ", Ausentes = " + ausentesEstudiante);
        }

        System.out.println("\nTotal de presentes en el curso: " + totalPresentesCurso);
        System.out.println("Total de ausentes en el curso : " + totalAusentesCurso);

        sc.close();
    }
}
