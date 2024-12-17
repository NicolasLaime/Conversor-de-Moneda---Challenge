// Clase principal
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("Bienvenido al convertidor de monedas - Challenge ONE ");
            System.out.println("--------------------------------------------------------");

            System.out.println("Elige la moneda de origen:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");

            //Capturamos la moneda de origen
            String monedaOrigen = Moneda.obtenerCodigoDeMoneda(scanner.nextInt());

            System.out.println("Elige la moneda de destino:");
            String monedaDestino = Moneda.obtenerCodigoDeMoneda(scanner.nextInt());

            System.out.println("Ingresa el monto a convertir:");
            double monto = scanner.nextDouble();

            //método para obtener la tasa de cambio
            double tasaCambio = Moneda.obtenerTasaDeCambio(monedaOrigen, monedaDestino);

            if (tasaCambio != -1) {
                // Calculamos el monto convertido
                double montoConvertido = monto * tasaCambio;
                System.out.println("\nResultado:");
                System.out.println("--------------------------------------------------------");
                System.out.printf("%.2f %s equivalen a %.2f %s\n", monto, monedaOrigen, montoConvertido, monedaDestino);
                System.out.println("--------------------------------------------------------");

            } else {
                System.out.println("No se pudo obtener la tasa de cambio. Inténtalo nuevamente.");
            }

            System.out.println("\n¿Deseas realizar otra conversión?");
            System.out.println("1. Sí");
            System.out.println("0. No (Salir)");
            opcion = scanner.nextInt();

        } while (opcion != 0);

        System.out.println("--------------------------------------------------------");
        System.out.println("Gracias por usar el convertidor de monedas. ¡Hasta pronto!");
        System.out.println("--------------------------------------------------------");

        scanner.close();
    }
}
