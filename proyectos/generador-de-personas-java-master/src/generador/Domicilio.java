
package generador;

/**
 *
 * @author caemci
 */
public class Domicilio {
    public final String DIRECCION;
    public final String BARRIO;

    public Domicilio(String DIRECCION, String BARRIO) {
        this.DIRECCION = DIRECCION;
        this.BARRIO = BARRIO;
    }

    @Override
    public String toString() {
        return this.DIRECCION + ", " + this.BARRIO;
    }
}
