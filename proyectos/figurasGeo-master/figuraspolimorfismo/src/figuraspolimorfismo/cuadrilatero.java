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
public class cuadrilatero extends FiguraGeometrica {
    private int base;
    private int altura;

    public cuadrilatero(int base, int altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    

    @Override
    public double calcArea() {
        return 1;
    }

    @Override
    public double calcPer() {
            return 1;
    }
    public void dibujar(){
    }
    
}
