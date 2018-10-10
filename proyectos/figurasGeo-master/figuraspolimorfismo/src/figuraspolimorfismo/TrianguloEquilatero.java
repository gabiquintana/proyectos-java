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
public class TrianguloEquilatero extends FiguraGeometrica {
    private int lado;

    public TrianguloEquilatero(int lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
    return 1;
    }

    @Override
    public double calcPer() {
    return 1;
    }
    
    @Override
    public void dibujar(){
    }
    
}
