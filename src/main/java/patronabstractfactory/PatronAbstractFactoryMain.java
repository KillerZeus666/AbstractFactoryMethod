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

        System.out.println("Servicio Api class > af.familiaws.ImplementacionWSEmpleados");
        System.out.println("getEmployee > [Berky Thorold, Brewer Werner,Caron Brockman");
        System.out.println("getUserID > [user_305, user_685, user_96]");


    }

}