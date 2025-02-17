/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Tipo de Clase: Interface -> Servicios Bases Genericos
 */
package abstractfactory.bases;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;
import servicios.IServiciosEuropePMC;
/**
 *
 * @author Fabrizio Bolaño
 */
public interface IServiciosBasesGenericos {
    public IServiciosEmpleados getEmpleados();
    public IServiciosArticulos getArticulos();
    public IServiciosEuropePMC getEuropePMC();
}
