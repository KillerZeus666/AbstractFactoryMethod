/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Tipo de Clase: Interface -> Servicios Bases Genericos
 */
package abstractfactory.bases;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;
/**
 *
 * @author Fabrizio Bolaño
 */
public interface IServiciosBasesGenericos {
    public IServiciosEmpleados getEmpleados();
    public IServiciosArticulos getArticulos();
}