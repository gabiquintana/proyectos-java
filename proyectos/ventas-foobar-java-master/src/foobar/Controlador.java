
package foobar;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vistas.VistaCarga;
import vistas.VistaPrincipal;
import vistas.VistaVenta;

public class Controlador 
{
    private VistaPrincipal vp;
    private VistaCarga vc;
    private VistaVenta vv;
    private Modelo m;
    
    public void iniciar() {
        this.m = new Modelo();
        this.vp = new VistaPrincipal();
        
        this.vp.cargarAccionDeBotonEntrar( new ManejadorBotonEntrarVP() );
        this.vp.cargarAccionDeBotonVender( new ManejadorBotonVenderVP() );
        this.vp.cargarAccionDeBotonCargar( new ManejadorBotonCargarVP() );
        this.vp.cargarAccionDeCampoUsuario( new ManejadorFocoCampoUsuarioVP() );
        this.vp.cargarAccionDeCampoClave( new ManejadorFocoCampoClaveVP() );
        
        prepararVentanaPrincipal();
        
        this.vp.iniciarVista();
    }
    
    private void prepararVentanaPrincipal() {
        this.vp.establecerMaximoDeEmpanadas( m.getStock().MAX_EMP );
        this.vp.establecerMaximoDeMedialunas( m.getStock().MAX_MED );
        this.vp.establecerValorEmpanadasCarne( m.getStock().getCantCarne() );
        this.vp.establecerValorEmpanadasPollo( m.getStock().getCantPollo() );
        this.vp.establecerValorEmpanadasJamon( m.getStock().getCantJamon() );
        this.vp.establecerValorMedialunasManteca( m.getStock().getCantManteca() );
        this.vp.establecerValorMedialunasGrasa( m.getStock().getCantGrasa() );
    }
    
    private void prepararVentanaVenta() {
        this.vv.mostrarDisponibilidadCarne( m.getStock().getCantCarne() );
        this.vv.mostrarDisponibilidadPollo( m.getStock().getCantPollo() );
        this.vv.mostrarDisponibilidadJamon( m.getStock().getCantJamon() );
        this.vv.mostrarDisponibilidadManteca( m.getStock().getCantManteca() );
        this.vv.mostrarDisponibilidadGrasa( m.getStock().getCantGrasa() );
    }
    
    private void prepararVentanaCarga() {
        this.vc.mostrarDisponibilidadCarne( m.getStock().getCantCarne() );
        this.vc.mostrarDisponibilidadPollo( m.getStock().getCantPollo() );
        this.vc.mostrarDisponibilidadJamon( m.getStock().getCantJamon() );
        this.vc.mostrarDisponibilidadManteca( m.getStock().getCantManteca() );
        this.vc.mostrarDisponibilidadGrasa( m.getStock().getCantGrasa() );
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////// MANEJADORES PARA CADA ACCION //////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    
    private class ManejadorFocoCampoUsuarioVP implements FocusListener
    {
        @Override
        public void focusGained(FocusEvent e)
        {
            if ( vp.obtenerNombreDeUsuario().equals("Usuario") )
            {
                vp.establecerNombreDeUsuario("");
                vp.pintarTextoCampoUsuario(Color.BLACK);
            }
        }

        @Override
        public void focusLost(FocusEvent e)
        {
            if ( vp.obtenerNombreDeUsuario().isEmpty() )
            {
                vp.establecerNombreDeUsuario("Usuario");
                vp.pintarTextoCampoUsuario(Color.GRAY);
            }
        }
    }
    
    private class ManejadorFocoCampoClaveVP implements FocusListener
    {
        @Override
        public void focusGained(FocusEvent e)
        {
            if ( vp.obtenerClave().equals("12345678") )
            {
                vp.establecerClave("");
                vp.pintarTextoCampoClave(Color.BLACK);
            }
        }

        @Override
        public void focusLost(FocusEvent e)
        {
            if ( vp.obtenerClave().isEmpty() )
            {
                vp.establecerClave("12345678");
                vp.pintarTextoCampoClave(Color.GRAY);
            }
        }
    }
        
    private class ManejadorBotonEntrarVP implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (vp.obtenerNombreDeUsuario().equals("admin") && vp.obtenerClave().equals("codo2017"))
            {
                vp.mostrarPanelFacturacion(true);
                vp.establecerClave("");
                vp.establecerNombreDeUsuario("");
            }
        }
    }
    
    private class ManejadorBotonVenderVP implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            vv = new VistaVenta();
            vv.cargarAccionDeBotonVender( new ManejadorBotonVenderVV() );
            vv.cargarAccionDeBotonCancelar( new ManejadorBotonCancelarVV() );
            vv.cargarAccionDeCampoTotal( new ManejadorFocoTotalVV() );
            vv.cargarAccionDeCampoVuelto( new ManejadorFocoVueltoVV() );
            prepararVentanaVenta();
            vv.iniciarVista();
        }
    }
    
    private class ManejadorBotonCargarVP implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            vc = new VistaCarga();
            vc.cargarAccionDeBotonCargar( new ManejadorBotonCargarVC() );
            vc.cargarAccionDeBotonCancelar( new ManejadorBotonCancelarVC() );
            prepararVentanaCarga();
            vc.iniciarVista();
        }
    }
    
    private class ManejadorBotonCargarVC implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            m.getStock().setCantCarne( m.getStock().getCantCarne() + vc.obtenerCantidadDeCarne() );
            m.getStock().setCantPollo( m.getStock().getCantPollo() + vc.obtenerCantidadDePollo() );
            m.getStock().setCantJamon( m.getStock().getCantJamon() + vc.obtenerCantidadDeJamon() );
            m.getStock().setCantManteca( m.getStock().getCantManteca() + vc.obtenerCantidadDeManteca() );
            m.getStock().setCantGrasa( m.getStock().getCantGrasa() + vc.obtenerCantidadDeGrasa() );
            prepararVentanaPrincipal();
            vc.desecharVentana();
        }
    }
    
    private class ManejadorBotonCancelarVC implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            vc.desecharVentana();
        }
    }
    
    private class ManejadorBotonVenderVV implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            m.getStock().setCantCarne( m.getStock().getCantCarne() - vv.obtenerCantidadDeCarne() );
            m.getStock().setCantPollo( m.getStock().getCantPollo() - vv.obtenerCantidadDePollo() );
            m.getStock().setCantJamon( m.getStock().getCantJamon() - vv.obtenerCantidadDeJamon() );
            m.getStock().setCantManteca( m.getStock().getCantManteca() - vv.obtenerCantidadDeManteca() );
            m.getStock().setCantGrasa( m.getStock().getCantGrasa() - vv.obtenerCantidadDeGrasa() );
            prepararVentanaPrincipal();
            vv.desecharVentana();
        }
    }
    
    private class ManejadorBotonCancelarVV implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            vv.desecharVentana();
        }
    }
    
    private class ManejadorGeneracionTicketVV implements MouseListener
    {
        private boolean generado;
        @Override
        public void mouseClicked(MouseEvent e) {
            if ( !generado ) {
                m.getVenta().generarTicket();
                vv.imprimirTicket( m.getVenta().getTicket().toString() );
                
                vv.activarBotonCancelar(false);
                vv.activarBotonVender(true);
                generado = true;
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }
    
    private class ManejadorFocoTotalVV implements FocusListener
    {
        @Override
        public void focusGained(FocusEvent e) {
            int c1 = vv.obtenerCantidadDeCarne();
            int c2 = vv.obtenerCantidadDePollo();
            int c3 = vv.obtenerCantidadDeJamon();
            int c4 = vv.obtenerCantidadDeManteca();
            int c5 = vv.obtenerCantidadDeGrasa();
            
            m.generarNuevaVenta( new int[] {c1,c2,c3,c4,c5} );
            vv.establecerTotal(m.getVenta().getPrecioTotal());
        }

        @Override
        public void focusLost(FocusEvent e) {
        }
    }
    
    private class ManejadorFocoVueltoVV implements FocusListener
    {
        @Override
        public void focusGained(FocusEvent e) {
            m.getVenta().setAbono( vv.obtenerAbono() );
            m.getVenta().calcularVuelto();
            vv.establecerVuelto(m.getVenta().getVuelto());
            
            vv.cargarAccionDeGenerarTicket( new ManejadorGeneracionTicketVV() );
        }

        @Override
        public void focusLost(FocusEvent e) {
        }
    }
}
