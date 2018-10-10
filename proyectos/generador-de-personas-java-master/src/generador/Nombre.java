
package generador;

/**
 *
 * @author caemci
 */
public class Nombre {
    public final String NOMBRE;
    public final Genero GENERO;

    public Nombre(String NOMBRE, Genero GENERO) {
        this.NOMBRE = NOMBRE;
        this.GENERO = GENERO;
    }

    @Override
    public String toString() {
        return "Nombre{" + "NOMBRE=" + NOMBRE + ", GENERO=" + GENERO + '}';
    }
}
