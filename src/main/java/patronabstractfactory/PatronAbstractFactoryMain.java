/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Abstract Factory
 * Tipo de Clase: Main()
 */
package patronabstractfactory;
import abstractfactory.bases.IServiciosBasesGenericos;
import abstractfactory.bases.ServiciosGenericosAbstractFactory;
import java.util.Arrays;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;

/**
 *
 * @author Fabrizio Bolaño
 */
public class PatronAbstractFactoryMain {


    public static void main(String[] args) {

        IServiciosBasesGenericos factory = ServiciosGenericosAbstractFactory.createServiceFactory();
        IServiciosEmpleados employeeService = factory.getEmpleados();
        IServiciosArticulos productService = factory.getArticulos();

        System.out.println("Servicio Empleados class > "
                + employeeService.getClass().getCanonicalName());
        System.out.println("Servicio Articulos class  > "
                + productService.getClass().getCanonicalName());

        System.out.println("getEmployee > "
                + Arrays.toString(employeeService.getEmpleados()));
        System.out.println("getProduct  > "
                + Arrays.toString(productService.getArticulos()));

    }

}