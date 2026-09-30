import java.util.Scanner;

public class CajeroUniversitario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo;
        int opcion, transacciones = 0;

        do {
            System.out.print("Ingrese el saldo inicial: ");
            saldo = sc.nextDouble();
            if (saldo < 0) System.out.println("El saldo no puede ser negativo.");
        } while (saldo < 0);

        do {
            System.out.println("\n--- CAJERO UNIVERSITARIO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver número de transacciones");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                    } else {
                        saldo += deposito;
                        transacciones++;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.");
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes. Saldo disponible: $" + saldo);
                    } else {
                        saldo -= retiro;
                        transacciones++;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Transacciones realizadas: " + transacciones);
                    break;
                case 5:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
