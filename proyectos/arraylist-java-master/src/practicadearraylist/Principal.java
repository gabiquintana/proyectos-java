package practicadearraylist;

import java.util.ArrayList;

public class Principal
{
    public static void main(String[] args)
    {
        /*///////////////////////////////////////////////////
                              NO TOCAR                       
                              NO TOCAR                       
                              NO TOCAR                       
                              NO TOCAR                       
              SE OBTIENEN LOS DATOS DESDE UN ARCHIVO EXTERNO 
        */
        Importador.abrirArchivo("empleados.ser");
        ArrayList<Empleado> conjuntoDeEmpleados;
        conjuntoDeEmpleados = Importador.obtenerColeccion();
        Importador.cerrarArchivo();
        // LOS DATOS QUEDAN CARGADOS EN conjuntoDeEmpleados
        
        /*
             LA SIGUIENTE SALIDA MUESTRA 77
             CORRESPONDE A LA CANTIDAD DE EMPLEADOS YA CREADOS PREVIAMENTE
        */
        System.out.println( "Hay " + conjuntoDeEmpleados.size() + " empleados");
        
        /* 
            SE RECOMIENDA PRIMERO MOSTRAR TODOS LOS EMPLEADOS, PARA ENTENDER
            COMO FUNCIONA EL ARRAYLIST. UNA VEZ LOGRADO:

            IR A LA CLASE OPERACIONES E IMPLEMENTAR CADA UNO DE LOS METODOS.
            REEMPLAZAR LA LEYENDA "SIN IMPLEMENTAR" POR EL ALGORITMO HECHO POR USTEDES.
            LAS INSTRUCCIONES ESTAN EN CADA METODO EN FORMA DE COMENTARIOS
        */
        
        System.out.println("///////////////////////////////////////////////////////\n");
        Operaciones.mostrarNombresCorregidos(conjuntoDeEmpleados);
        System.out.println("///////////////////////////////////////////////////////\n");
        Operaciones.mostrarEmpleadosDeSistemasTrasAumento(conjuntoDeEmpleados);
        System.out.println("///////////////////////////////////////////////////////\n");
        Operaciones.mostrarSueldoTotalMensualTrasDespidos(conjuntoDeEmpleados);
        System.out.println("///////////////////////////////////////////////////////\n");
        Operaciones.mostrarComparacionDeSueldosDeInvestigacion(conjuntoDeEmpleados);
    }

}
