package af.familiarest;

import servicios.IServiciosEuropePMC;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class ImplementacionRestfulEuropePMC implements IServiciosEuropePMC {
    private static final String API_URL = "https://www.ebi.ac.uk/europepmc/webservices/rest/search?query=protein&resulttype=core&format=xml";

    @Override
    public String obtenerDatos() {
        // Implementación del método obtenerDatos()
        return "Datos obtenidos de Europe PMC";
    }

    @Override
    public List<String> getArticles() {
        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        
        // Crear la solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();
        
        try {
            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            if (response.statusCode() == 200) {
                System.out.println("Respuesta exitosa: " + response.body());
                // Asumimos que la respuesta es un arreglo de artículos en formato XML o JSON
                return Arrays.asList("Artículo 1", "Artículo 2", "Artículo 3"); // Esto debe ser procesado según el formato de la API
            } else {
                System.out.println("Error en la solicitud: " + response.statusCode());
                return List.of();  // Devolver lista vacía si hay un error
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return List.of();  // Devolver lista vacía en caso de excepción
        }
    }
}
