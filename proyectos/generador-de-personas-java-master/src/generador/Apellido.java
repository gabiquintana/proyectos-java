
package generador;

/**
 *
 * @author caemci
 */
class Apellido {
    public final String APELLIDO;
    public final String ORIGEN;

    public Apellido(String APELLIDO, String ORIGEN) {
        this.APELLIDO = APELLIDO;
        this.ORIGEN = ORIGEN;
    }

    @Override
    public String toString() {
        return APELLIDO + " de " + ORIGEN;
    }
}
