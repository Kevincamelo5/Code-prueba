package segundo;

import java.util.Scanner;

public class ConversionKilometrosMillas {

    // Método para convertir kilómetros a millas
    public static double convertirKilometrosAMillas(double kilometros) {
        final double FACTOR_CONVERSION = 0.621371;
        return kilometros * FACTOR_CONVERSION;
    }

    // Método para calcular la distancia recorrida
    public static double calcularDistanciaRecorrida(double velocidadKmPorHora, double tiempoHoras) {
        return velocidadKmPorHora * tiempoHoras;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la velocidad en kilómetros por hora
        System.out.print("Ingrese la velocidad en kilómetros por hora: ");
        double velocidadKmPorHora = scanner.nextDouble();

        // Solicitar al usuario el tiempo en horas
        System.out.print("Ingrese el tiempo en horas: ");
        double tiempoHoras = scanner.nextDouble();

        // Calcular la distancia recorrida en kilómetros
        double distanciaRecorridaKm = calcularDistanciaRecorrida(velocidadKmPorHora, tiempoHoras);

        // Convertir la distancia recorrida a millas
        double distanciaRecorridaMillas = convertirKilometrosAMillas(distanciaRecorridaKm);

        // Mostrar los resultados
        System.out.printf("Distancia recorrida: %.2f kilómetros (%.2f millas)%n", distanciaRecorridaKm, distanciaRecorridaMillas);

        scanner.close();
    }
}

