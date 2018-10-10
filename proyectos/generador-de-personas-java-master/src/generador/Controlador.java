package generador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistas.JFrameVistaAutenticacion;
import vistas.JFrameVistaConfiguracion;
import vistas.JFrameVistaPrincipal;
import vistas.JFrameVistaProgreso;

/**
 *
 * @author caemci
 */
public class Controlador {

    private JFrameVistaPrincipal vp;
    private JFrameVistaAutenticacion va;
    private JFrameVistaConfiguracion vconf;
    private JFrameVistaProgreso vprog;
    private Modelo m;

    public void iniciar() {
        this.m = new Modelo();
        this.vp = new JFrameVistaPrincipal();
        this.vconf = new JFrameVistaConfiguracion();
        this.vconf.manejarAccionConfirmar( new ManejadorAccionConfirmarVC() );

        this.vp.manejarAccionConectar(new ManejadorAccionConectarVP());
        this.vp.manejarAccionGenerar(new ManejadorAccionGenerarVP());
        this.vp.manejarAccionExportar(new ManejadorAccionExportarVP());
        this.vp.manejarAccionParametrizar(new ManejadorAccionParametrizarVP());

        this.vp.iniciarVista();
    }

       
    private void exportar() {
        try {
            Archivo arch = vp.seleccionarArchivo();
            if (!arch.getRuta().isEmpty()) {
                m.exportar(arch);
                vp.mostrarCartelDeConfirmacion("El archivo se ha exportado exitosamente\n\n" + arch.getRuta());
            }
        }
        catch (IOException ex) {
            vp.mostrarCartelDeError("Error al exportar el archivo.\n\n" + ex.getMessage());
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
    
    private class ManejadorAccionGenerarVP implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (vp.obtenerNumeroAGenerar() > 0) {
                int cantidad = vp.obtenerNumeroAGenerar();
                vp.limpiarFilas();
                vp.cambiarModeloDeTabla();
                Runnable ejecucion = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            vp.mostrar( m.obtenerPersonas(cantidad));
                        } catch (SQLException ex) {
                            vp.mostrarCartelDeError("Error al generar personas\n\n" + ex.getMessage());
                        }
                    }
                };
                Thread hilo = new Thread(ejecucion);
                hilo.start();
                vp.activarBotonExportar(true);
            }
        }
    }
    
    private class ManejadorAccionExportarVP implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Runnable ejecucion = new Runnable() {
                @Override
                public void run() {
                    exportar();
                }
            };
            Thread hilo = new Thread(ejecucion);
            hilo.start();
        }
    }
    
    private class ManejadorAccionParametrizarVP implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vconf.iniciarVista();
            vconf.manejarAccionConfirmar( new ManejadorAccionConfirmarVC() );
        }
    }
    
    private class ManejadorAccionConfirmarVC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                vconf.obtenerConfiguracion();
                m.generarBibliotecaDeDatos();
                vp.cambiarModeloDeTabla();
                vp.limpiarFilas();
                vconf.cerrarVentana();
            } catch (SQLException ex) {
                vp.mostrarCartelDeError("Ocurrió un error con la base de datos al regenerar la biblioteca de datos\n\n" + ex.getMessage());
            }
            catch (NumberFormatException ex) {
                vp.mostrarCartelDeError("Rango de edad no válido\n\n" + ex.getMessage());
            }
            catch (NullPointerException ex) {
                vp.mostrarCartelDeError("Rango de edad incompleto\n\n" + ex.getMessage());
            }
        }
    }
    
    private class ManejadorAccionConectarVA implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                m.conectarABaseDeDatos(va.obtenerDireccion(), va.obtenerUsuario(), va.obtenerContrasena());
                vconf.obtenerConfiguracion();
                m.generarBibliotecaDeDatos();
                va.cerrarVentana();
                vp.hayConexionConBD(true);
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
