/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Clase para la creación de los ervicios de la Fabrica
 */
package abstractfactory.bases;
import java.util.Properties;
import utilidades.UtilidadesAcceso;
/**
 *
 * @author Fabrizio Bolaño
 */
public class ServiciosGenericosAbstractFactory {
    public ServiciosGenericosAbstractFactory() {}

    public static IServiciosBasesGenericos createServiceFactory() {
        Properties props = UtilidadesAcceso.loadProperty(
                "propiedades/AbsFactoryPropiedades.properties");
        String factoryClass =
                props.getProperty("servicioImplementado");
        try {
            return (IServiciosBasesGenericos)
                    Class.forName(factoryClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
