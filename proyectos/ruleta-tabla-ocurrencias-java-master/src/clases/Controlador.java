/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Virtual
 */
public class Controlador implements Printable
{
    private Ventana v = new Ventana();
    private VentanaAcerca va = new VentanaAcerca();
    private Ruleta r = new Ruleta();
    private ManejadorDeArchivos mda = new ManejadorDeArchivos();
    private boolean pregunta = false;
    private boolean seGuardo = false;
    private boolean seCargo = false;
    private int indice = 0;
    private int pagina = 1;
    
    private Impresion0a9 pagina1 = new Impresion0a9();
    private Impresion10a18 pagina2 = new Impresion10a18();
    private Impresion19a27 pagina3 = new Impresion19a27();
    private Impresion28a36 pagina4 = new Impresion28a36();
    
    public Controlador() 
    {
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png"));
        v.setIconImage(icono);
        va.setIconImage(icono);
        
        v.getContentPane().setBackground(Color.white);
        v.setVisible(true);
        v.setSize(1280, 720);
        v.setLocationRelativeTo(null);
        
        va.getContentPane().setBackground(Color.white);
        va.setVisible(false);
        va.setLocationRelativeTo(null);
        va.setSize(545, 310);
        
        pagina1.setLocationRelativeTo(null);
        pagina2.setLocationRelativeTo(null);
        pagina3.setLocationRelativeTo(null);
        pagina4.setLocationRelativeTo(null);
        
        v.addNuevoListener(new NuevoHandler());
        v.addCargarListener(new CargarHandler());
        v.addGuardarListener(new GuardarHandler());
        v.addImprimirListener(new ImprimirHandler());
        v.addSalirListener(new SalirHandler());
        
        v.addGenerarListener(new GenerarHandler());
        
        v.addInstruccionesListener(new InstruccionesHandler());
        v.addAcercaListener(new AcercaHandler());
        
        v.addAnteriorListener(new AnteriorHandler());
        v.addSiguienteListener(new SiguienteHandler());
        
        v.getjMenuItemGuardar().setEnabled(false);
        
        desactivarPasoAPaso();
        
    }
    
    private void verInstructivo()
    {
        try
        {
            File archivo = new File("Instructivo.pdf");
            Desktop.getDesktop().open(archivo);
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }
        
    }
    
    private void desactivarPasoAPaso()
    {
        v.getjLabelNumAnterior().setBackground(new java.awt.Color(200, 200, 200));
        v.getjLabelNumActual().setBackground(new java.awt.Color(200, 200, 200));
        v.getjButtonAnterior().setEnabled(false);
        v.getjButtonSiguiente().setEnabled(false);
        v.getjLabelNumTirada().setText("-");
        v.getjLabelNumActual().setText("-");
        v.getjLabelNumAnterior().setText("-");
    }
    
    private void activarPasoAPaso()
    {
        v.getjLabelNumAnterior().setBackground(new java.awt.Color(200, 200, 200));
        v.getjLabelNumActual().setBackground(new java.awt.Color(200, 200, 200));
        v.getjButtonSiguiente().setEnabled(true);
        
        if (r.getNumerosGenerados().size() == 1)
        {
            v.getjButtonSiguiente().setEnabled(false);
            v.getjButtonAnterior().setEnabled(false);
        }
        
        v.getjLabelNumTirada().setText(indice+1 + "");
        v.getjLabelNumActual().setText(r.getNumerosGenerados().get(indice) + "");
        v.getjLabelNumAnterior().setText("-");
        colorearLabel(r.getNumerosGenerados().get(indice), v.getjLabelNumActual());
    }
    
    private void colorearLabel(int numero, javax.swing.JLabel label)
    {
        switch (numero)
        {
            case 0: label.setBackground(new java.awt.Color(58, 148, 74)); break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 12:
            case 14:
            case 16:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 36: label.setBackground(new java.awt.Color(225, 0, 26)); break;

            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 20:
            case 22:
            case 24:
            case 26:
            case 28:
            case 29:
            case 31:
            case 33:
            case 35: label.setBackground(new java.awt.Color(0, 0, 0)); break;
        }
    }
    
    private void rellenarTabla(JTable tabla, int[] array)
    {
        DefaultTableModel modeloDeTabla = (DefaultTableModel) tabla.getModel();
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modeloDeTabla);
        
        tabla.setModel(new DefaultTableModel());
        while(modeloDeTabla.getRowCount()>0)modeloDeTabla.removeRow(0);
        
        for (int i = 0; i < 37; i++) 
        {
            Object[] datosFila = {i,array[i]};
            modeloDeTabla.addRow(datosFila);
        }
        
        tabla.setModel(modeloDeTabla);
        tabla.setRowSorter(sorter);
        tabla.getRowSorter().toggleSortOrder(1);
        tabla.getRowSorter().toggleSortOrder(1);
        
        tabla.getColumnModel().getColumn(0).setPreferredWidth(18);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(30);
        
        tabla.setDefaultRenderer(Integer.class, new MiRender());
    }
    
    private void mostrarTablas(boolean mostrar)
    {
        v.getjTable0().setVisible(mostrar);
        v.getjTable1().setVisible(mostrar);
        v.getjTable2().setVisible(mostrar);
        v.getjTable3().setVisible(mostrar);
        v.getjTable4().setVisible(mostrar);
        v.getjTable5().setVisible(mostrar);
        v.getjTable6().setVisible(mostrar);
        v.getjTable7().setVisible(mostrar);
        v.getjTable8().setVisible(mostrar);
        v.getjTable9().setVisible(mostrar);
        v.getjTable10().setVisible(mostrar);
        v.getjTable11().setVisible(mostrar);
        v.getjTable12().setVisible(mostrar);
        v.getjTable13().setVisible(mostrar);
        v.getjTable14().setVisible(mostrar);
        v.getjTable15().setVisible(mostrar);
        v.getjTable16().setVisible(mostrar);
        v.getjTable17().setVisible(mostrar);
        v.getjTable18().setVisible(mostrar);
        v.getjTable19().setVisible(mostrar);
        v.getjTable20().setVisible(mostrar);
        v.getjTable21().setVisible(mostrar);
        v.getjTable22().setVisible(mostrar);
        v.getjTable23().setVisible(mostrar);
        v.getjTable24().setVisible(mostrar);
        v.getjTable25().setVisible(mostrar);
        v.getjTable26().setVisible(mostrar);
        v.getjTable27().setVisible(mostrar);
        v.getjTable28().setVisible(mostrar);
        v.getjTable29().setVisible(mostrar);
        v.getjTable30().setVisible(mostrar);
        v.getjTable31().setVisible(mostrar);
        v.getjTable32().setVisible(mostrar);
        v.getjTable33().setVisible(mostrar);
        v.getjTable34().setVisible(mostrar);
        v.getjTable35().setVisible(mostrar);
        v.getjTable36().setVisible(mostrar);
    }
    
    private void mostrarResultados()
    {
        rellenarTabla(v.getjTable0(), r.getPost0());
        rellenarTabla(v.getjTable1(), r.getPost1());
        rellenarTabla(v.getjTable2(), r.getPost2());
        rellenarTabla(v.getjTable3(), r.getPost3());
        rellenarTabla(v.getjTable4(), r.getPost4());
        rellenarTabla(v.getjTable5(), r.getPost5());
        rellenarTabla(v.getjTable6(), r.getPost6());
        rellenarTabla(v.getjTable7(), r.getPost7());
        rellenarTabla(v.getjTable8(), r.getPost8());
        rellenarTabla(v.getjTable9(), r.getPost9());
        rellenarTabla(v.getjTable10(), r.getPost10());
        rellenarTabla(v.getjTable11(), r.getPost11());
        rellenarTabla(v.getjTable12(), r.getPost12());
        rellenarTabla(v.getjTable13(), r.getPost13());
        rellenarTabla(v.getjTable14(), r.getPost14());
        rellenarTabla(v.getjTable15(), r.getPost15());
        rellenarTabla(v.getjTable16(), r.getPost16());
        rellenarTabla(v.getjTable17(), r.getPost17());
        rellenarTabla(v.getjTable18(), r.getPost18());
        rellenarTabla(v.getjTable19(), r.getPost19());
        rellenarTabla(v.getjTable20(), r.getPost20());
        rellenarTabla(v.getjTable21(), r.getPost21());
        rellenarTabla(v.getjTable22(), r.getPost22());
        rellenarTabla(v.getjTable23(), r.getPost23());
        rellenarTabla(v.getjTable24(), r.getPost24());
        rellenarTabla(v.getjTable25(), r.getPost25());
        rellenarTabla(v.getjTable26(), r.getPost26());
        rellenarTabla(v.getjTable27(), r.getPost27());
        rellenarTabla(v.getjTable28(), r.getPost28());
        rellenarTabla(v.getjTable29(), r.getPost29());
        rellenarTabla(v.getjTable30(), r.getPost30());
        rellenarTabla(v.getjTable31(), r.getPost31());
        rellenarTabla(v.getjTable32(), r.getPost32());
        rellenarTabla(v.getjTable33(), r.getPost33());
        rellenarTabla(v.getjTable34(), r.getPost34());
        rellenarTabla(v.getjTable35(), r.getPost35());
        rellenarTabla(v.getjTable36(), r.getPost36());
        
        rellenarTabla(pagina1.getjTable0(), r.getPost0());
        rellenarTabla(pagina1.getjTable1(), r.getPost1());
        rellenarTabla(pagina1.getjTable2(), r.getPost2());
        rellenarTabla(pagina1.getjTable3(), r.getPost3());
        rellenarTabla(pagina1.getjTable4(), r.getPost4());
        rellenarTabla(pagina1.getjTable5(), r.getPost5());
        rellenarTabla(pagina1.getjTable6(), r.getPost6());
        rellenarTabla(pagina1.getjTable7(), r.getPost7());
        rellenarTabla(pagina1.getjTable8(), r.getPost8());
        rellenarTabla(pagina1.getjTable9(), r.getPost9());
        rellenarTabla(pagina2.getjTable10(), r.getPost10());
        rellenarTabla(pagina2.getjTable11(), r.getPost11());
        rellenarTabla(pagina2.getjTable12(), r.getPost12());
        rellenarTabla(pagina2.getjTable13(), r.getPost13());
        rellenarTabla(pagina2.getjTable14(), r.getPost14());
        rellenarTabla(pagina2.getjTable15(), r.getPost15());
        rellenarTabla(pagina2.getjTable16(), r.getPost16());
        rellenarTabla(pagina2.getjTable17(), r.getPost17());
        rellenarTabla(pagina2.getjTable18(), r.getPost18());
        rellenarTabla(pagina3.getjTable19(), r.getPost19());
        rellenarTabla(pagina3.getjTable20(), r.getPost20());
        rellenarTabla(pagina3.getjTable21(), r.getPost21());
        rellenarTabla(pagina3.getjTable22(), r.getPost22());
        rellenarTabla(pagina3.getjTable23(), r.getPost23());
        rellenarTabla(pagina3.getjTable24(), r.getPost24());
        rellenarTabla(pagina3.getjTable25(), r.getPost25());
        rellenarTabla(pagina3.getjTable26(), r.getPost26());
        rellenarTabla(pagina3.getjTable27(), r.getPost27());
        rellenarTabla(pagina4.getjTable28(), r.getPost28());
        rellenarTabla(pagina4.getjTable29(), r.getPost29());
        rellenarTabla(pagina4.getjTable30(), r.getPost30());
        rellenarTabla(pagina4.getjTable31(), r.getPost31());
        rellenarTabla(pagina4.getjTable32(), r.getPost32());
        rellenarTabla(pagina4.getjTable33(), r.getPost33());
        rellenarTabla(pagina4.getjTable34(), r.getPost34());
        rellenarTabla(pagina4.getjTable35(), r.getPost35());
        rellenarTabla(pagina4.getjTable36(), r.getPost36());
        
        v.repaint();
        pagina1.repaint();
        pagina2.repaint();
        pagina3.repaint();
        pagina4.repaint();
    }
    
    private boolean preguntar()
    {
        if (pregunta)
        {
            int opcion = Cartel.mostrarCartelConfirmacion("¿Desea guardar el escenario anterior?", "SELECCIONE UNA OPCION");

            if (opcion == 0) return true;
            else return false;
        }
        else return false;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /////////////////////////////////////////
    // CLASES HANDLER PARA MANEJAR EVENTOS //
    /////////////////////////////////////////
    
    class AnteriorHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            v.getjButtonSiguiente().setEnabled(true);
            v.getjButtonAnterior().setEnabled(true);
            
            indice--;
            
            v.getjLabelNumTirada().setText(indice+1 + "");
            v.getjLabelNumActual().setText(r.getNumerosGenerados().get(indice) + "");
            if (indice == 0)
            {
                v.getjLabelNumAnterior().setText("-");
                v.getjButtonAnterior().setEnabled(false);
                v.getjLabelNumAnterior().setBackground(new java.awt.Color(200, 200, 200));
            }
            else 
            {
                v.getjLabelNumAnterior().setText(r.getNumerosGenerados().get(indice-1) + "");
                colorearLabel(r.getNumerosGenerados().get(indice-1), v.getjLabelNumAnterior());
            }
            
            colorearLabel(r.getNumerosGenerados().get(indice), v.getjLabelNumActual());
            
        }
    }
    
    class SiguienteHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            v.getjButtonSiguiente().setEnabled(true);
            v.getjButtonAnterior().setEnabled(true);
            
            indice++;
            
            v.getjLabelNumTirada().setText(indice+1 + "");
            v.getjLabelNumActual().setText(r.getNumerosGenerados().get(indice) + "");
            v.getjLabelNumAnterior().setText(r.getNumerosGenerados().get(indice-1) + "");
            
            if (indice == r.getNumerosGenerados().size() - 1)
            v.getjButtonSiguiente().setEnabled(false);
            
            colorearLabel(r.getNumerosGenerados().get(indice), v.getjLabelNumActual());
            colorearLabel(r.getNumerosGenerados().get(indice-1), v.getjLabelNumAnterior());
        }
    }
    
    class NuevoHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (preguntar()) mda.guardarArchivo(r.getNumerosGenerados());
          
            r = new Ruleta();
            System.gc();
            
            mostrarTablas(false);
            desactivarPasoAPaso();
            
            v.getjMenuItemNuevo().setEnabled(true);
            v.getjMenuItemCargar().setEnabled(true);
            v.getjMenuItemGuardar().setEnabled(false);
            v.getjMenuSimulador().setEnabled(true);
        }
    }
    
    class CargarHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            Runnable miRunnable = new Runnable()
            {
                public void run()
                {
                    try
                    {
                        if (preguntar()) mda.guardarArchivo(r.getNumerosGenerados());
            
                        r = new Ruleta();
                        
                        ArrayList<Integer> aux = mda.cargarArchivo();
                        
                        if (aux != null)
                        {
                            r.generarNumeros(aux);
                            mostrarTablas(true);
                            mostrarResultados();
                            activarPasoAPaso();
                            System.gc();
                            pregunta = false;
                            
                            v.getjMenuItemNuevo().setEnabled(true);
                            if (seCargo) v.getjMenuItemCargar().setEnabled(false);
                            v.getjMenuItemGuardar().setEnabled(false);
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            };
            Thread hilo = new Thread (miRunnable);
            hilo.start();  
        }
    }
    
    class GuardarHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            Runnable miRunnable = new Runnable()
            {
                public void run()
                {
                    try
                    {
                        seGuardo = mda.guardarArchivo(r.getNumerosGenerados());
                        pregunta = false;
                       
                        mostrarTablas(true);
                        v.getjMenuItemNuevo().setEnabled(true);
                        v.getjMenuItemCargar().setEnabled(false);
                        if (seGuardo) v.getjMenuItemGuardar().setEnabled(false);
                    }
                    catch (Exception e)
                    {
                       e.printStackTrace();
                    }
                }
            };
            Thread hilo = new Thread (miRunnable);
            hilo.start();  
        }
    }
    
    class ImprimirHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            
            
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Simulador de ruleta");

            // Creamos el objeto Book
            Book libro = new Book();
            // Se añaden las páginas al libro, una apaisada y dos verticales
            libro.append((Printable)pagina1, job.defaultPage());
            libro.append((Printable)pagina2, job.defaultPage());
            libro.append((Printable)pagina3, job.defaultPage());
            libro.append((Printable)pagina4, job.defaultPage());
            
            job.setPageable( libro );
            
            if( job.printDialog() )
            {
                try 
                {
                    pagina1.setVisible(true);
                    pagina2.setVisible(true);
                    pagina3.setVisible(true);
                    pagina4.setVisible(true);

                    job.print(); 
                } 
                catch ( Exception exc ) 
                {
                    exc.printStackTrace();
                }
            }
            
            pagina1.setVisible(false);
            pagina2.setVisible(false);
            pagina3.setVisible(false);
            pagina4.setVisible(false);
            
        }
    }
    
    class Pagina10 extends JFrame implements Printable 
    {
        @Override
        public int print(Graphics g, PageFormat f, int pageIndex) throws PrinterException 
        {
            Graphics2D g2 = (Graphics2D) g;
            int fontHeight = g2.getFontMetrics().getHeight();

            double alturaPag = f.getImageableHeight()-fontHeight;
            double anchoPag = f.getImageableWidth();
            double anchoPanel = 450;
            double alturaPanel = 650;
            double escala = 1; 

            //El panel no cabria en la hoja, asi que necesitamos reescalarlo:
            if (anchoPanel >= anchoPag) 
            {
                escala =  anchoPag / anchoPanel;
            }

            //Posicionamos correctamente el panel:
            g2.translate(f.getImageableX(),f.getImageableY());
            //Cambiamos la escala para que quepa el panel en la hoja:
            g2.scale(escala,escala);

            this.paint(g);
            return PAGE_EXISTS;
        }
    }
    
    class SalirHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            System.exit(0);
        }
    }
    
    class GenerarHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            boolean seguir = true;
            
            do
            {
                try
                {
                    String x;
                    
                    x = Cartel.mostrarIntroducirNumero("Introduzca la cantidad de números aleatorios que desea generar (Entre 1 y 10000000)", "GENERAR NUMEROS");
                    
                    if (x != null) 
                    {
                        int a = Integer.parseInt(x);
                        
                        if (a > 0 && a <= 10000000) 
                        {
                            r.generarNumeros(a);
                        
                            mostrarTablas(true);
                            mostrarResultados();
                            activarPasoAPaso();

                            seguir = false;
                            pregunta = true;

                            v.getjMenuItemNuevo().setEnabled(true);
                            v.getjMenuItemCargar().setEnabled(false);
                            v.getjMenuItemGuardar().setEnabled(true);
                            v.getjMenuSimulador().setEnabled(false);
                        }
                        else throw new ExcepcionLimites();
                        
                    }
                    else throw new Exception();
                }
                catch (NumberFormatException nfe)
                {
                    Cartel.mostrarMensajeError("ERROR 6: Número incorrecto", "ERROR");     
                } 
                catch (ExcepcionLimites el) 
                {
                    Cartel.mostrarMensajeError(el.getMessage(), "ERROR");
                } 
                catch (Exception ex) 
                {
                    seguir = false;
                }
                
            } while (seguir);
        }
    }
    
    class InstruccionesHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            verInstructivo();
        }
    }
    
    class AcercaHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            va.setVisible(true);
        }
    }
    
}

