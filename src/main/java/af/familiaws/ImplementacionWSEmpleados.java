/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Implementación para el Web Service de Empleados
 */
package af.familiaws;
import servicios.IServiciosEmpleados;
/**
 *
 * @author Fabrizio Bolaño
 */
public class ImplementacionWSEmpleados implements IServiciosEmpleados {
    private static final String[] EMPLEADOS = new String[]{"Juan Guillermo", "David", "Luis Fernando"};

    @Override
    public String[] getEmpleados() {
        System.out.println("Tipo de Servicio: WebServices");
        return EMPLEADOS;
    }
}