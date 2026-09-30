import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double recaudacionTotal = 0; // acumulador
        int vehiculos = 0;           // contador

        System.out.println("Ingrese los datos de cada vehiculo. Ingrese 0 en 'numero de horas' para finalizar.\n");

        System.out.print("Tipo de vehiculo: ");
        String tipo = sc.next();

        System.out.print("Numero de horas (0 para finalizar): ");
        int horas = sc.nextInt();

        
        while (horas != 0) {

            
            while (horas < 0) {
                System.out.print("Las horas no pueden ser negativas. Ingrese nuevamente (0 para finalizar): ");
                horas = sc.nextInt();
            }

            if (horas == 0) {
                break;
            }

            System.out.print("Tarifa por hora para " + tipo + ": ");
            double tarifa = sc.nextDouble();
            while (tarifa < 0) {
                System.out.print("La tarifa no puede ser negativa. Ingrese nuevamente: ");
                tarifa = sc.nextDouble();
            }

            double valorIndividual = horas * tarifa;
            recaudacionTotal += valorIndividual; 

            System.out.println("Valor a pagar por " + tipo + ": " + valorIndividual);

            System.out.println("\n--- Siguiente vehiculo (0 en horas para finalizar) ---");
            System.out.print("Tipo de vehiculo: ");
            tipo = sc.next();
            System.out.print("Numero de horas (0 para finalizar): ");
            horas = sc.nextInt();
        }

        System.out.println("\n----- RESUMEN DEL ESTACIONAMIENTO -----");
        System.out.println("Vehiculos registrados: " + vehiculos);
        System.out.println("Recaudacion total     : " + recaudacionTotal);

        sc.close();
    }
}
