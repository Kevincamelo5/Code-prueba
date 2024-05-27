import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public static double[] leerArchivoCSV(String nombreArchivo) {
        double[] produccion = new double[12];
        try (BufferedReader br = new BufferedReader(new FileReader("produccion_maiz.CSV"))) {
            // Leer la primera línea (encabezados) y luego la línea de datos
            br.readLine();
            String linea = br.readLine();
            if (linea != null) {
                String[] valores = linea.split(",");
                for (int i = 0; i < valores.length; i++) {
                    produccion[i] = Double.parseDouble(valores[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produccion;
    }
}
