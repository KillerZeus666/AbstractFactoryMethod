package utilidades;
/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 */

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Fabrizio Bolaño
 */
public class UtilidadesAcceso {
    public static Properties loadProperty(String propertiesURL){
        try {
            Properties properties = new Properties();
            InputStream inputStream = UtilidadesAcceso.class.getClassLoader().getResourceAsStream(propertiesURL);
            properties.load(inputStream);
            return properties;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
