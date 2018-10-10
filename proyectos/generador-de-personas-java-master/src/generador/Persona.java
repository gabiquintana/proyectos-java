
package generador;

/**
 *
 * @author caemci
 */
public class Persona {
    public final String DNI;
    public final String NOMBRE;
    public final String APELLIDO;
    public final Genero GENERO;
    public final String FECHA_DE_NACIMIENTO;
    public final String MAIL;
    public final String MOVIL;
    public final String DOMICILIO;
    public final String BARRIO;
    public final String NACIONALIDAD;
    public final Object[] DATOS;

    public Persona(String DNI, String NOMBRE, String APELLIDO, Genero GENERO, String FECHA_DE_NACIMIENTO, String MAIL, String MOVIL, String DOMICILIO, String BARRIO, String NACIONALIDAD) {
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.GENERO = GENERO;
        this.FECHA_DE_NACIMIENTO = FECHA_DE_NACIMIENTO;
        this.MAIL = MAIL;
        this.MOVIL = MOVIL;
        this.DOMICILIO = DOMICILIO;
        this.BARRIO = BARRIO;
        this.NACIONALIDAD = NACIONALIDAD;
        this.DATOS = new Object[] {DNI,NOMBRE,APELLIDO,GENERO,FECHA_DE_NACIMIENTO,MAIL,MOVIL,DOMICILIO,BARRIO,NACIONALIDAD};
    }
}
