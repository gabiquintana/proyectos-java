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
public class Figuraspolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un par de mascotas y Autos de prueba
        Circulo a = new Circulo(4, "Circulo");
        Circulo b = new Circulo(8, "Circulo");
        TrianguloEquilatero c = new TrianguloEquilatero(15,"TrianguloEquilatero");
        TrianguloEquilatero d = new TrianguloEquilatero(30,"TrianguloEquilatero");
        cuadrilatero e = new cuadrilatero(4,8,"Cuadrilatero");
        TrianguloEquilatero f = new TrianguloEquilatero(12,"TrianguloEquilatero");
        Auto h = new Auto("Audi",234123123);
        Auto y = new Auto("Peugeot",1000000);
        Auto j = new Auto("Renault",100000);

        // Las guardo en un arreglo en cualquier orden
        Dibujable[] portalDeHambrientos = {b, a, j, f, h, c, y, e, d};

        // Aquí se ve al polimorfismo por interfaces en acción
        for (int i = 0; i < portalDeHambrientos.length; i++) {
            portalDeHambrientos[i].dibujar();
        }
    }

}
