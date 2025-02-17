/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Implementación para el Service de Empleados tipo Restfull
 */
package af.familiarest;

import servicios.IServiciosEmpleados;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ImplementacionRestEmpleados implements IServiciosEmpleados {
    private static final String[] EMPLEADOS = new String[]{"Juan Guillermo", "David", "Luis Fernando"};

    @Override
    public String[] getEmpleados() {
        System.out.println("Tipo de Servicio: Restful");
        return EMPLEADOS;
    }

}