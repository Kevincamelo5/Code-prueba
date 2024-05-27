public class Main {

    public static void main (String[] args) {
        double[] produccion = Leer.leerArchivoCSV("produccion_maiz.csv");

        // Calcular el promedio
        double suma = 0;
        for (double valor : produccion) {
            suma += valor;
        }
        double promedio = suma / produccion.length;
        System.out.println("Promedio de producción anual: " + promedio);

        // Encontrar las producciones mayores al promedio
        System.out.println("Producciones mayores al promedio:");
        for (int i = 0; i < produccion.length; i++) {
            if (produccion[i] > promedio) {
                System.out.println("Mes " + (i + 1) + ": " + produccion[i]);
            }
        }

        // Encontrar el mes de mayor producción
        double maxProduccion = produccion[0];
        int mesMayorProduccion = 0;
        for (int i = 1; i < produccion.length; i++) {
            if (produccion[i] > maxProduccion) {
                maxProduccion = produccion[i];
                mesMayorProduccion = i;
            }
        }
        System.out.println("Mes de mayor producción: " + (mesMayorProduccion + 1) + " con " + maxProduccion);
    }
}
