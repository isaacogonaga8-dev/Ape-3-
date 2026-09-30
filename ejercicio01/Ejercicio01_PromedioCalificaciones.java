import java.util.Scanner;

public class Ejercicio01_PromedioCalificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables para controlar el proceso
        int N;
        int aprobados = 0;
        int reprobados = 0;

        // Variables para las calificaciones
        double calificacion;
        double suma = 0;
        double promedio;
        double mayor = 0;
        double menor = 10;

        // Solicitar la cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        N = entrada.nextInt();

        // Validar que la cantidad sea mayor que cero
        while (N <= 0) {
            System.out.println("Cantidad no valida.");
            System.out.print("Ingrese nuevamente: ");
            N = entrada.nextInt();
        }

        // Repetir el proceso para cada estudiante
        for (int i = 1; i <= N; i++) {

            System.out.print(
                    "Ingrese la calificacion del estudiante "
                    + i + ": "
            );

            calificacion = entrada.nextDouble();

            // Validar que la calificacion este entre 0 y 10
            while (calificacion < 0 || calificacion > 10) {

                System.out.println(
                        "Calificacion no valida. "
                        + "Ingrese una nota entre 0 y 10."
                );

                System.out.print("Ingrese nuevamente: ");
                calificacion = entrada.nextDouble();
            }

            // Acumular la calificacion
            suma = suma + calificacion;

            // Contar aprobados y reprobados
            if (calificacion >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }

            // Determinar la nota mas alta
            if (calificacion > mayor) {
                mayor = calificacion;
            }

            // Determinar la nota mas baja
            if (calificacion < menor) {
                menor = calificacion;
            }
        }

    }
}
