
package generador;

/**
 *
 * @author caemci
 */
public enum Campo {
    DNI("DNI"),
    NOMBRE("Primer nombre"),
    APELLIDO("Primer apellido"),
    GENERO("Género"),
    FECHA_NACIMIENTO("Fecha de nacimiento"),
    MAIL("Mail"),
    MOVIL("Móvil"),
    DOMICILIO("Domicilio"),
    BARRIO("Barrio"),
    NACIONALIDAD("Nacionalidad");
    
    public final String DENOMINACION;
    private boolean seleccionado;

    private Campo(String n) {
        this.DENOMINACION = n;
    }
    
    public void setEstado(boolean s) {
        this.seleccionado = s;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    @Override
    public String toString() {
        return this.DENOMINACION;
    }
}
