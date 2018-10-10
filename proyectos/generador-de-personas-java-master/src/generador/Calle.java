
package generador;

/**
 *
 * @author caemci
 */
public class Calle {
    public final String NOMBRE;
    public final int ALTURA_INICIAL_PAR;
    public final int ALTURA_FINAL_PAR;
    public final int ALTURA_INICIAL_IMPAR;
    public final int ALTURA_FINAL_IMPAR;
    public final String BARRIO_LADO_PAR;
    public final String BARRIO_LADO_IMPAR;

    public Calle(String NOMBRE, int ALTURA_INICIAL_PAR, int ALTURA_FINAL_PAR, int ALTURA_INICIAL_IMPAR, int ALTURA_FINAL_IMPAR, String BARRIO_LADO_PAR, String BARRIO_LADO_IMPAR) {
        this.NOMBRE = NOMBRE;
        this.ALTURA_INICIAL_PAR = ALTURA_INICIAL_PAR;
        this.ALTURA_FINAL_PAR = ALTURA_FINAL_PAR;
        this.ALTURA_INICIAL_IMPAR = ALTURA_INICIAL_IMPAR;
        this.ALTURA_FINAL_IMPAR = ALTURA_FINAL_IMPAR;
        this.BARRIO_LADO_PAR = BARRIO_LADO_PAR;
        this.BARRIO_LADO_IMPAR = BARRIO_LADO_IMPAR;
    }

    @Override
    public String toString() {
        return "Calle{" + "NOMBRE=" + NOMBRE + ", ALTURA_INICIAL_PAR=" + ALTURA_INICIAL_PAR + ", ALTURA_FINAL_PAR=" + ALTURA_FINAL_PAR + ", ALTURA_INICIAL_IMPAR=" + ALTURA_INICIAL_IMPAR + ", ALTURA_FINAL_IMPAR=" + ALTURA_FINAL_IMPAR + ", BARRIO_LADO_PAR=" + BARRIO_LADO_PAR + ", BARRIO_LADO_IMPAR=" + BARRIO_LADO_IMPAR + '}';
    }
}
