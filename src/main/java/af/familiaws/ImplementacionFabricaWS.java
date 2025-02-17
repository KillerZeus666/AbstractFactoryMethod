/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Esta clase representa la fábrica de objetos de la familia de servicios por WebService
 */
package af.familiaws;

import abstractfactory.bases.IServiciosBasesGenericos;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ImplementacionFabricaWS implements IServiciosBasesGenericos {

    @Override
    public IServiciosEmpleados getEmpleados() {
        return new ImplementacionWSEmpleados();
    }

    @Override
    public IServiciosArticulos getArticulos() {
        return new ImplementacionWSArticulos();
    }

}

