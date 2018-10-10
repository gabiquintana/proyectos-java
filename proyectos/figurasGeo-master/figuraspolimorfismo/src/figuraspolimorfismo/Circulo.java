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
public class Circulo extends FiguraGeometrica {
    private int radio;
    public Circulo(int radio,String nombre){
    super(nombre);
    this.radio=radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    @Override
    public double calcArea(){
    return 2;
    }
      @Override
    public double calcPer(){
    return 2;
    }
    @Override
    public void dibujar(){
    }
}
