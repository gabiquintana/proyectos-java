/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuraspolimorfismo;

/**
 *
 * @author Hildebrando
 */
public abstract class FiguraGeometrica implements Dibujable {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
public abstract double calcArea();
public abstract double calcPer();
}
