/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Implementación para el Service de Articulos tipo Restfull
 */
package af.familiarest;
import servicios.IServiciosArticulos;
/**
 *
 * @author Fabrizio Bolaño
 */
public class ImplementacionRestArticulos implements IServiciosArticulos {
    private static final String[] ARTICULOS = new String[]{"Disco Duro", "Teclados", "Mouse"};

    @Override
    public String[] getArticulos() {
        System.out.println("Tipo de Servicio: Restful");
        return ARTICULOS;
    }
}