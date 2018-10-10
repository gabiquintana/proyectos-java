
package colores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador 
{
    private Vista v;

    public void iniciar()
    {
        this.v = new Vista(); // Instancio una nueva vista (COMPOSICION)
        // Vinculo los eventos de la vista con el manejo que provee el controlador
        this.v.darleAccionAPrimerBoton( new PrimerBotonHandler() );
        this.v.darleAccionASegundoBoton( new SegundoBotonHandler() );
        this.v.iniciarVista(); // Le ordeno a la vista que se muestre
    }
    
    private class SegundoBotonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            v.establecerVisibilidadDePrimerBoton(true);
            v.establecerTextoDeSegundoBoton("Por ahora, no sirvo");
        }
    }
    
    private class PrimerBotonHandler implements MouseListener
    {
        private Color colorOriginal;

        public PrimerBotonHandler() {
            this.colorOriginal = v.dameColorOriginalDePrimerBoton();
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            // Cuando hago click sobre el boton
            v.establecerVisibilidadDePrimerBoton(false);
            v.establecerTextoDeSegundoBoton("Que vuelva a aparecer !");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // Cuando entra al boton
            // Los colores se crean mediante tres valores (RGB) entre 0 y 255
            Color random = new Color( generarAleatorio(), generarAleatorio(), generarAleatorio() );
            v.cambiarColorDePrimerBoton( random );
        }
        
        private int generarAleatorio ()
        {
            return (int) Math.floor(Math.random() * 256 );
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // Cuando sale del boton
            v.cambiarColorDePrimerBoton( this.colorOriginal );
        }
        
    }
}
