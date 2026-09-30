import java.util.Scanner;
public class CineCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalAcumulado = 0;
        int cantidadVentas = 0;
        String otra;

        do {
            System.out.println("\n--- NUEVA VENTA ---");
            System.out.println("Tipo de entrada: 1. General  2. Estudiante  3. Tercera edad");
            int tipo;
            do {
                System.out.print("Elija el tipo (1-3): ");
                tipo = sc.nextInt();
            } while (tipo < 1 || tipo > 3);

            String nombreTipo;
            switch (tipo) {
                case 1: nombreTipo = "General"; break;
                case 2: nombreTipo = "Estudiante"; break;
                default: nombreTipo = "Tercera edad";
            }

            int cantidad;
            do {
                System.out.print("Cantidad de entradas: ");
                cantidad = sc.nextInt();
            } while (cantidad <= 0);

            double precio;
            do {
                System.out.print("Precio por entrada: $");
                precio = sc.nextDouble();
            } while (precio <= 0);

            double subtotal = cantidad * precio;
            totalAcumulado += subtotal;
            cantidadVentas++;

            System.out.println("Tipo: " + nombreTipo + " | Subtotal: $" + subtotal);
            System.out.println("Total acumulado: $" + totalAcumulado);

            System.out.print("¿Desea realizar otra venta? (s/n): ");
            otra = sc.next();
        } while (otra.equalsIgnoreCase("s"));

        System.out.println("\nVentas realizadas: " + cantidadVentas);
        System.out.println("Total recaudado: $" + totalAcumulado);
        sc.close();
    }
}
