
package pruebadeeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Controlador
{
    private Vista v;

    public Controlador(Vista v)
    {
        this.v = v;
    }
    
    public void iniciar()
    {
        this.v.escucharEventosDeAccion( new ManejadorDeAccion() );
        this.v.escucharEventosDeFoco(new ManejadorDeFoco() );
        this.v.escucharEventosDeMouse( new ManejadorDeMouse() );
        this.v.escucharEventosDeTeclado( new ManejadorDeTeclado() );
        this.v.escucharEventosDeMovimiento( new ManejadorDeMovimiento() );
        this.v.iniciarVista();
    }
    
    private class ManejadorDeAccion implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {   
            v.getjButtonPruebaAccion().setText("Acción realizada");
        }
    }
    
    private class ManejadorDeFoco implements FocusListener
    {
        @Override
        public void focusGained(FocusEvent e)
        {
            v.getjButtonPruebaFoco().setText("Tengo el foco ! :D");
        }

        @Override
        public void focusLost(FocusEvent e)
        {
            v.getjButtonPruebaFoco().setText("Perdí el foco :(");
        }
    }
    
    private class ManejadorDeMouse implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            v.getjLabelPruebaMouse().setText("Hiciste click");
            v.getjLabelPruebaMouse().setForeground(Color.darkGray);
        }

        @Override
        public void mousePressed(MouseEvent e)
        {
            v.getjLabelPruebaMouse().setText("Estás manteniendo presionado");
            v.getjLabelPruebaMouse().setForeground(Color.blue);
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            System.out.println("Soltaste");
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            v.getjLabelPruebaMouse().setText("Entraste al label");
            v.getjLabelPruebaMouse().setForeground(Color.green);
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            v.getjLabelPruebaMouse().setText("Te fuiste del label");
            v.getjLabelPruebaMouse().setForeground(Color.red);
        }
    }
    
    private class ManejadorDeTeclado implements KeyListener
    {
        @Override
        public void keyTyped(KeyEvent e)
        {
            int cant = v.getjTextAreaPrueba().getText().length();
            v.getjLabelCuentaDeCaracteres().setText("Caracteres: " + cant);
        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            System.out.println("Presionó tecla " + e.getKeyChar() + " cuyo código es " + e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e)
        {
            System.out.println("Soltó tecla " + e.getKeyChar() + " cuyo código es " + e.getKeyCode());
        }
    }
    
    private class ManejadorDeMovimiento implements MouseMotionListener
    {
        @Override
        public void mouseDragged(MouseEvent e)
        {
            String coord = "Presionado: " + e.getX() + " ; " + e.getY();
            v.getjLabelCoordenadas().setText(coord);
        }

        @Override
        public void mouseMoved(MouseEvent e)
        {
            String coord = "Libre: " + e.getX() + " ; " + e.getY();
            v.getjLabelCoordenadas().setText(coord);
        }
    }
}
