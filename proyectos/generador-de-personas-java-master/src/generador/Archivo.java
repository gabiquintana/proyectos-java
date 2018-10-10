
package generador;

/**
 *
 * @author caemci
 */
public class Archivo {
    private Tipo tipo;
    private String ruta;
    private String[][] datos;

    public Archivo(Tipo tipo, String ruta, String[][] datos) {
        this.tipo = tipo;
        this.ruta = ruta;
        this.datos = datos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public String[][] getDatos() {
        return datos;
    }  
}
