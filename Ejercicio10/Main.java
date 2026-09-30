import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejercicio10 {
    static final int MAX_VENTAS = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productos = new String[MAX_VENTAS];
        double[] montos = new double[MAX_VENTAS];
        int[] cantidades = new int[MAX_VENTAS];

        int numeroVentas = 0;       // contador
        double totalRecaudado = 0;  // acumulador
        int unidadesVendidas = 0;   // acumulador
        double ventaMayor = 0;

        int opcion;

        do {
            System.out.println("\n----- SISTEMA INTEGRADO DE VENTAS -----");
            System.out.println("1) Registrar venta");
            System.out.println("2) Mostrar estadisticas");
            System.out.println("3) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            while (opcion < 1 || opcion > 3) {
                System.out.print("Opcion invalida. Seleccione una opcion (1-3): ");
                opcion = sc.nextInt();
            }

            switch (opcion) {
                case 1:
                    if (numeroVentas >= MAX_VENTAS) {
                        System.out.println("Se alcanzo el limite de ventas registradas.");
                        break;
                    }

                    System.out.print("Producto: ");
                    String producto = sc.next();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    while (cantidad <= 0) {
                        System.out.print("La cantidad debe ser mayor que cero. Ingrese nuevamente: ");
                        cantidad = sc.nextInt();
                    }

                    System.out.print("Precio unitario: ");
                    double precio = sc.nextDouble();
                    while (precio < 0) {
                        System.out.print("El precio no puede ser negativo. Ingrese nuevamente: ");
                        precio = sc.nextDouble();
                    }

                    double montoVenta = cantidad * precio;

                    productos[numeroVentas] = producto;
                    cantidades[numeroVentas] = cantidad;
                    montos[numeroVentas] = montoVenta;

                    numeroVentas++;                 // contador
                    totalRecaudado += montoVenta;   // acumulador
                    unidadesVendidas += cantidad;   // acumulador

                    if (montoVenta > ventaMayor) {
                        ventaMayor = montoVenta;
                    }

                    System.out.println("Venta registrada. Subtotal: " + montoVenta);
                    break;

                case 2:
                    System.out.println("\n----- ESTADISTICAS -----");
                    System.out.println("Numero de ventas   : " + numeroVentas);
                    System.out.println("Unidades vendidas  : " + unidadesVendidas);
                    System.out.println("Total recaudado    : " + totalRecaudado);
                    System.out.println("Venta mayor        : " + ventaMayor);

                    if (numeroVentas > 0) {
                        double promedioVenta = totalRecaudado / numeroVentas;
                        System.out.println("Promedio por venta : " + promedioVenta);
                    } else {
                        System.out.println("Aun no se han registrado ventas.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema de ventas...");
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }
}
