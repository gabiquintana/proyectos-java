
package generador;

/**
 *
 * @author caemci
 */
class Documento {
    public final int MINIMO;
    public final int MAXIMO;
    public final int ANIO;

    public Documento(int MINIMO, int MAXIMO, int ANIO) {
        this.MINIMO = MINIMO;
        this.MAXIMO = MAXIMO;
        this.ANIO = ANIO;
    }

    @Override
    public String toString() {
        return ANIO + ": [" + MINIMO + ";" + MAXIMO + "]";
    }
}
