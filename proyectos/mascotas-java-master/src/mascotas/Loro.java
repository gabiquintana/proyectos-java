
package mascotas;

public class Loro extends Mascota 
{
    private int volumen;

    public Loro(String nombre, int edad, int peso, int volumen) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.volumen = volumen; // Solo los loros tienen volumen (según mi modelo)
    }
    
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    @Override
    public String toString() {
        // Obtengo la representación en String de la superclase Mascota y agrego los atributos de Loro
        return super.toString() + " Con volumen " + this.volumen;
    }

    @Override
    public void expresarse() {
        System.out.println(super.getNombre() + ": PRRRR PRRRR");
    }
    
    @Override
    public void comer() {
        System.out.println(super.getNombre() + ": PRRRR, ¡Este alpiste está brutal!");
    }
}
