/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Esta clase representa la fábrica de objetos de la familia de servicios Restful
 */
package af.familiarest;

import abstractfactory.bases.IServiciosBasesGenericos;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ImplementacionFabricaRestful implements IServiciosBasesGenericos {

    @Override
    public IServiciosEmpleados getEmpleados() {
        return new ImplementacionRestEmpleados();
    }

    @Override
    public IServiciosArticulos getArticulos() {
        return new ImplementacionRestArticulos();
    }

}