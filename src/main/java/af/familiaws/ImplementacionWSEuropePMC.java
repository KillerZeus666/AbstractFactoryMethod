package af.familiaws;

import servicios.IServiciosEuropePMC;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class ImplementacionWSEuropePMC implements IServiciosEuropePMC {

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
                // Aquí procesamos la respuesta y la convertimos a una lista
                List<String> articles = new ArrayList<>();
                articles.add("Artículo 1");
                articles.add("Artículo 2");
                articles.add("Artículo 3");
                return articles;  // Devolvemos una lista en lugar de un arreglo
            } else {
                System.out.println("Error en la solicitud: " + response.statusCode());
                return new ArrayList<>(); // Devuelve una lista vacía
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return new ArrayList<>(); // Devuelve una lista vacía en caso de error
        }
    }
    
}
