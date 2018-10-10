package practicadearraylist;

import java.util.ArrayList;

public class Operaciones {

    public static void mostrarNombresCorregidos(ArrayList<Empleado> lista) {
        /*
             Modificar los atributos de cada empleado para
             que el nombre aparezca con formato "Nombre" y
             el apellido aparezca con formato "Apellido"
             Ej: MAX --> Max
             Ej: power --> Power
             Una vez corregidos, mostrar todos los ítems de la lista
         */

        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = lista.get(i);
            emp.setApellido ( corregir( emp.getApellido() ) );
            emp.setNombre ( corregir( emp.getNombre() ) );
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
    // El nombre o apellido puede ser compuesto (más de una palabra)
    private static String corregir (String cadenaCompuesta)
    {
        String[] miArreglo = cadenaCompuesta.split(" ");
        String cadenaCorregida = "";
        for (int i = 0; i < miArreglo.length; i++) {
            cadenaCorregida += capitalizar(miArreglo[i]) + " ";
        }
        
        return cadenaCorregida.trim();
    }
    
    private static String capitalizar (String cadena)
    {
        cadena = cadena.toLowerCase();
        char primerCaracter = cadena.toUpperCase().charAt(0);
        String restoDeLaCadena = cadena.substring(1);
        return primerCaracter + restoDeLaCadena;
    }

    public static void mostrarEmpleadosDeSistemasTrasAumento(ArrayList<Empleado> lista) {
        /*
            Se aprobó un aumento del 10% de sueldo por hora
            para cada uno de los empleados de SISTEMAS
            Mostrar solo a los empleados de sistemas junto
            al sueldo mensual tras el aumento
        */
        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = lista.get(i);
            if ( emp.getSector() == Sector.SISTEMAS ) {
                emp.setSueldoPorHora( emp.getSueldoPorHora() * 1.1 );
                System.out.println( emp );
            }
        }
    }
    
    private void mostrarEmpleadosSegunSector (ArrayList<Empleado> lista, Sector sec) {
        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = lista.get(i);
            if ( emp.getSector() == sec ) {
                System.out.println( emp );
            }
        }
    }

    public static void mostrarSueldoTotalMensualTrasDespidos(ArrayList<Empleado> lista) {
        /*
            Se decide despedir a aquellos empleados que 
            ganen $300 por hora o más.
            Mostrar cuánto debería pagar la empresa en total
            por mes tras este recorte de personal
         */
        
        ArrayList<Empleado> copia = (ArrayList<Empleado>) lista.clone();
        
        for (int i = 0; i < copia.size(); i++) {
            Empleado emp = copia.get(i);
            if ( emp.getSueldoPorHora() >= 300 ) {
                lista.remove(emp);
            }
        }
        
        double totalPorHora = 0;
        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = lista.get(i);
            totalPorHora += emp.getSueldoPorHora() * emp.getHorasAlMes();
        }
        System.out.println("La empresa paga por mes $" + totalPorHora );
    }

    public static void mostrarComparacionDeSueldosDeInvestigacion(ArrayList<Empleado> lista) {
        /*
            Mostrar cuánto paga la empresa por mes por investigación.
            Asignar los primeros 3 empleados de la lista al sector de investigación. 
            Mostrar cuánto paga la empresa por mes por investigación, tras la reestructuración anterior.
         */
        
        mostrarPagoPorInvestigacion(lista);
        
        for (int i = 0; i < 3; i++) {
            lista.get(i).setSector(Sector.INVESTIGACION);
        }
        
        mostrarPagoPorInvestigacion(lista);
    }
    
    private static void mostrarPagoPorInvestigacion (ArrayList<Empleado> lista) {
        double totalPorHora = 0;
        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = lista.get(i);
            if (emp.getSector() == Sector.INVESTIGACION) {
                totalPorHora += emp.getSueldoPorHora() * emp.getHorasAlMes();
            }
        }
        System.out.println("La empresa paga por mes por investigación $" + totalPorHora );
    }
}
