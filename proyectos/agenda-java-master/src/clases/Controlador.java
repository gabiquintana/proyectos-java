package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import vistas.JFrameVistaAutenticacion;
import vistas.JFrameVistaContacto;
import vistas.JFrameVistaEstadistica;
import vistas.JFrameVistaPrincipal;

/**
 *
 * @author caemci
 */
public class Controlador {

    private JFrameVistaPrincipal vp;
    private JFrameVistaContacto vc;
    private JFrameVistaEstadistica ve;
    private JFrameVistaAutenticacion va;
    private Modelo m;

    public void iniciar() {
        this.m = new Modelo();
        this.vp = new JFrameVistaPrincipal();

        this.vp.manejarAccionAgregar(new ManejadorAccionAgregarContactoVP());
        this.vp.manejarAccionConectar(new ManejadorAccionConectarVP());
        this.vp.manejarAccionVaciar(new ManejadorAccionVaciarVP());
        this.vp.manejarAccionVerEstadisticas(new ManejadorAccionVerEstadisticasVP());
        this.vp.manejarClickEnTabla(new ManejadorClickTablaVP());
        this.vp.manejarCambioItemFiltrar(new ManejadorCambioDeItemFiltrarVP());

        this.vp.iniciarVista();
    }

    private void listarContactosEnVista() {
        try 
        {
            vp.limpiarFilas();
            ArrayList<Contacto> contactos = m.obtenerContactos( vp.obtenerCategoriaSeleccionada() );
            for (int i = 0; i < contactos.size(); i++) 
            {
                Contacto c = contactos.get(i);
                vp.agregarFila(c.getId(), c.getNombre(), c.getApellido(), c.getMail());
            }
        } 
        catch (SQLException ex) 
        {
            vp.mostrarCartelDeError("No se pudieron listar los contactos\n" + ex.getMessage());
        }
    }
    
    private void agregarContacto () {
        try {
            vc.actualizarContacto();
            m.agregarContacto(vc.getContacto());
            vc.cerrarVentana();
        } 
        catch (SQLException ex) {
            vp.mostrarCartelDeError("Se ha producido un error al actualizar el contacto\n\n" + ex.getMessage());
        }
        catch (NumberFormatException ex) {
            vp.mostrarCartelDeError("Se ha producido un error al actualizar el contacto\n\n" + "El dato en el campo teléfono no representa un número");
        }
        catch (NullPointerException ex) {
            vp.mostrarCartelDeError("Se ha producido un error al actualizar el contacto\n\n" + "Se requiere fecha de nacimiento");
        }
        finally {
            listarContactosEnVista();
        }
    }
    
    private void actualizarContacto () {
        try {
            vc.actualizarContacto();
            m.actualizarContacto(vc.getContacto());
        } 
        catch (SQLException ex) {
            vp.mostrarCartelDeError("Se ha producido un error al actualizar el contacto\n\n" + ex.getMessage());
        }
        catch (NumberFormatException ex) {
            vp.mostrarCartelDeError("Se ha producido un error al actualizar el contacto\n\n" + "El dato en el campo teléfono no representa un número");
        }
        catch (NullPointerException ex) {
            vp.mostrarCartelDeError("Se ha producido un error al actualizar el contacto\n\n" + "Se requiere fecha de nacimiento");
        }
        finally {
            listarContactosEnVista();
        }
    }
    
    private void borrarContacto () {
        try {
            m.borrarContacto(vc.getContacto());
        } 
        catch (SQLException ex) {
            vp.mostrarCartelDeError("Se ha producido un error al borrar el contacto\n\n" + ex.getMessage());
        }
        finally {
            listarContactosEnVista();
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////// MANEJADORES PARA CADA ACCION //////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private class ManejadorAccionConectarVP implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            va = new JFrameVistaAutenticacion();
            va.manejarAccionConectar( new ManejadorAccionConectarVA() );
            va.iniciarVista();
        }
    }

    private class ManejadorAccionAgregarContactoVP implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vc = new JFrameVistaContacto(Modo.AGREGAR);
            vc.manejarAccion( new ManejadorAccionAgregarVC() );
            vc.iniciarVista();
        }
    }

    private class ManejadorAccionVaciarVP implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int resultado = vp.mostrarCartelDeConfirmacion("¿Estás seguro de borrar todos los contactos?");
            if ( resultado == 0 )
            {
                try {
                    m.vaciarListaDeContactos();
                    listarContactosEnVista();
                } catch (SQLException ex) {
                    vp.mostrarCartelDeError("Se ha producido un error al intentar borrar todos los contactos\n\n" + ex.getMessage());
                }
            }
        }
    }

    private class ManejadorAccionVerEstadisticasVP implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ve = new JFrameVistaEstadistica();
                ve.mostrarCantidades(m.obtenerCantidadesParaEstadistica());
                ve.mostrarEdadPromedio(m.obtenerEdadPromedio());
                ve.iniciarVista();
            } 
            catch (SQLException ex) {
                vp.mostrarCartelDeError("Se ha producido un error al intentar mostrar las estadísticas\n\n" + ex.getMessage());
            }
        }
    }

    private class ManejadorCambioDeItemFiltrarVP implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                listarContactosEnVista();
            }
        }
    }

    private class ManejadorClickTablaVP implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                try {
                    vc = new JFrameVistaContacto(Modo.VER, m.obtenerContacto( vp.obtenerIDSeleccionado() ));
                    vc.manejarAccionEditar(new ManejadorAccionEditarContactoVC());
                    vc.manejarAccionBorrar(new ManejadorAccionBorrarContactoVC());
                    vc.manejarAccion( new ManejadorAccionCerrarVC() );
                } catch (SQLException ex) {
                    vp.mostrarCartelDeError("El contacto no existe\n" + ex.getMessage());
                }
                vc.iniciarVista();
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

    private class ManejadorAccionEditarContactoVC implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == 1) { // ESTA SELECCIONADO
                vc.establecerModo(Modo.EDITAR);
            } 
            else {
                actualizarContacto();
                vc.establecerModo(Modo.VER);
            }
        }        
    }

    private class ManejadorAccionBorrarContactoVC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            borrarContacto();
            vc.cerrarVentana();
            listarContactosEnVista();
        }
    }
    
    private class ManejadorAccionCerrarVC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vc.cerrarVentana();
        }
    }
    
    private class ManejadorAccionAgregarVC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            agregarContacto();
            listarContactosEnVista();
        }
    }
    
    private class ManejadorAccionConectarVA implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                m.conectarABaseDeDatos(va.obtenerDireccion(), va.obtenerUsuario(), va.obtenerContrasena());
                va.cerrarVentana();
                vp.actualizarEstado(true);
                vp.activarControles();
                vp.desactivarBotonDeConexion();
                listarContactosEnVista();
            }
            catch (ClassNotFoundException ex) {
                vp.mostrarCartelDeError("Se ha producido un error al conectar con la base de datos\n\n" + ex.getMessage());
            }
            catch (SQLException ex) {
                vp.mostrarCartelDeError("Se ha producido un error al conectar con la base de datos\n\n" + ex.getMessage());
            } 
        }
    }
}
