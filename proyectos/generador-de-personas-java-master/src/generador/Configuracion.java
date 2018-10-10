
package generador;

/**
 *
 * @author caemci
 */
public class Configuracion {
    
    private static Genero genero;
    private static int edadMinima;
    private static int edadMaxima;

    public static void establecerConfiguracion(Genero GENERO, boolean FLAG_NOMBRE, boolean FLAG_APELLIDO, boolean FLAG_DNI, boolean FLAG_FECHA_NACIMIENTO, int EDAD_MINIMA, int EDAD_MAXIMA, boolean FLAG_MAIL, boolean FLAG_MOVIL, boolean FLAG_DOMICILIO, boolean FLAG_NACIONALIDAD) {
        Campo.DNI.setEstado(FLAG_DNI);
        Campo.NOMBRE.setEstado(true);
        Campo.APELLIDO.setEstado(FLAG_APELLIDO);
        Campo.GENERO.setEstado(true);
        Campo.FECHA_NACIMIENTO.setEstado(FLAG_FECHA_NACIMIENTO);
        Campo.MAIL.setEstado(FLAG_MAIL);
        Campo.MOVIL.setEstado(FLAG_MOVIL);
        Campo.DOMICILIO.setEstado(FLAG_DOMICILIO);
        Campo.BARRIO.setEstado(FLAG_DOMICILIO);
        Campo.NACIONALIDAD.setEstado(FLAG_NACIONALIDAD);
        genero = GENERO;
        edadMinima = EDAD_MINIMA;
        edadMaxima = EDAD_MAXIMA;
    } 

    public static Genero getGenero() {
        return genero;
    }

    public static int getEdadMinima() {
        return edadMinima;
    }

    public static int getEdadMaxima() {
        return edadMaxima;
    }
}
