/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Implementación para el Web Service de Articulos
 */
package af.familiaws;
import servicios.IServiciosArticulos;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ImplementacionWSArticulos implements IServiciosArticulos {
    private static final String[] ARTICULOS = new String[]{"Disco Duro", "Teclados", "Mouse"};

    @Override
    public String[] getArticulos() {
        System.out.println("Tipo de Servicio: WebServices");
        return ARTICULOS;
    }
}
