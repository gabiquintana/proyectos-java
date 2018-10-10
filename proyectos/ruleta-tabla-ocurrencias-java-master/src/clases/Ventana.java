/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Virtual
 */
public class Ventana extends javax.swing.JFrame implements Printable
{

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException 
    {
        if (pageIndex > 0) return NO_SUCH_PAGE;
        Graphics2D g2d = (Graphics2D)graphics;
        //Punto donde empezará a imprimir dentro la pagina (50, 150)
        g2d.translate(  pageFormat.getImageableX()+50, 
                        pageFormat.getImageableY()+150);
        
//        pageFormat.setOrientation(PageFormat.PORTRAIT);
//        
//        Paper papel = new Paper();
//        papel.setSize(8.3*72, 11.7*72); //A4
//        pageFormat.setPaper(papel);
        
        g2d.scale(0.50,0.50); //Reducción de la impresión al 50%
        jPanel37.printAll(graphics);
        return PAGE_EXISTS;                
    }

    public JButton getjButtonAnterior() {
        return jButtonAnterior;
    }

    public void setjButtonAnterior(JButton jButtonAnterior) {
        this.jButtonAnterior = jButtonAnterior;
    }

    public JButton getjButtonSiguiente() {
        return jButtonSiguiente;
    }

    public void setjButtonSiguiente(JButton jButtonSiguiente) {
        this.jButtonSiguiente = jButtonSiguiente;
    }

    public JLabel getjLabelNumActual() {
        return jLabelNumActual;
    }

    public void setjLabelNumActual(JLabel jLabelNumActual) {
        this.jLabelNumActual = jLabelNumActual;
    }

    public JLabel getjLabelNumAnterior() {
        return jLabelNumAnterior;
    }

    public void setjLabelNumAnterior(JLabel jLabelNumAnterior) {
        this.jLabelNumAnterior = jLabelNumAnterior;
    }

    public JLabel getjLabelNumTirada() {
        return jLabelNumTirada;
    }

    public void setjLabelNumTirada(JLabel jLabelNumTirada) {
        this.jLabelNumTirada = jLabelNumTirada;
    }
    
    public void addAnteriorListener(ActionListener al) 
    {
        jButtonAnterior.addActionListener(al);
    }
    
    public void addSiguienteListener(ActionListener al) 
    {
        jButtonSiguiente.addActionListener(al);
    }
    
    public void addNuevoListener(ActionListener al) 
    {
        jMenuItemNuevo.addActionListener(al);
    }
    
    public void addCargarListener(ActionListener al) 
    {
        jMenuItemCargar.addActionListener(al);
    }
    
    public void addGuardarListener(ActionListener al) 
    {
        jMenuItemGuardar.addActionListener(al);
    }
    
    public void addImprimirListener(ActionListener al) 
    {
        jMenuItemImprimir.addActionListener(al);
    }
    
    public void addSalirListener(ActionListener al) 
    {
        jMenuItemSalir.addActionListener(al);
    }
    
    public void addGenerarListener(ActionListener al) 
    {
        jMenuItemGenerar.addActionListener(al);
    }
    
    public void addInstruccionesListener(ActionListener al) 
    {
        jMenuItemInstrucciones.addActionListener(al);
    }
    
    public void addAcercaListener(ActionListener al) 
    {
        jMenuItemAcerca.addActionListener(al);
    }

    public JMenu getjMenuArchivo() {
        return jMenuArchivo;
    }

    public void setjMenuArchivo(JMenu jMenuArchivo) {
        this.jMenuArchivo = jMenuArchivo;
    }

    public JMenu getjMenuAyuda() {
        return jMenuAyuda;
    }

    public void setjMenuAyuda(JMenu jMenuAyuda) {
        this.jMenuAyuda = jMenuAyuda;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenuItem getjMenuItemAcerca() {
        return jMenuItemAcerca;
    }

    public void setjMenuItemAcerca(JMenuItem jMenuItemAcerca) {
        this.jMenuItemAcerca = jMenuItemAcerca;
    }

    public JMenuItem getjMenuItemCargar() {
        return jMenuItemCargar;
    }

    public void setjMenuItemCargar(JMenuItem jMenuItemCargar) {
        this.jMenuItemCargar = jMenuItemCargar;
    }

    public JMenuItem getjMenuItemGenerar() {
        return jMenuItemGenerar;
    }

    public void setjMenuItemGenerar(JMenuItem jMenuItemGenerar) {
        this.jMenuItemGenerar = jMenuItemGenerar;
    }

    public JMenuItem getjMenuItemGuardar() {
        return jMenuItemGuardar;
    }

    public void setjMenuItemGuardar(JMenuItem jMenuItemGuardar) {
        this.jMenuItemGuardar = jMenuItemGuardar;
    }

    public JMenuItem getjMenuItemImprimir() {
        return jMenuItemImprimir;
    }

    public void setjMenuItemImprimir(JMenuItem jMenuItemImprimir) {
        this.jMenuItemImprimir = jMenuItemImprimir;
    }

    public JMenuItem getjMenuItemInstrucciones() {
        return jMenuItemInstrucciones;
    }

    public void setjMenuItemInstrucciones(JMenuItem jMenuItemInstrucciones) {
        this.jMenuItemInstrucciones = jMenuItemInstrucciones;
    }

    public JMenuItem getjMenuItemNuevo() {
        return jMenuItemNuevo;
    }

    public void setjMenuItemNuevo(JMenuItem jMenuItemNuevo) {
        this.jMenuItemNuevo = jMenuItemNuevo;
    }

    public JMenuItem getjMenuItemSalir() {
        return jMenuItemSalir;
    }

    public void setjMenuItemSalir(JMenuItem jMenuItemSalir) {
        this.jMenuItemSalir = jMenuItemSalir;
    }

    public JMenu getjMenuSimulador() {
        return jMenuSimulador;
    }

    public void setjMenuSimulador(JMenu jMenuSimulador) {
        this.jMenuSimulador = jMenuSimulador;
    }

    public JPopupMenu.Separator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JPopupMenu.Separator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JPopupMenu.Separator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JPopupMenu.Separator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JLabel getjLabel0() {
        return jLabel0;
    }

    public void setjLabel0(JLabel jLabel0) {
        this.jLabel0 = jLabel0;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel30() {
        return jLabel30;
    }

    public void setjLabel30(JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public JLabel getjLabel34() {
        return jLabel34;
    }

    public void setjLabel34(JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    public JLabel getjLabel35() {
        return jLabel35;
    }

    public void setjLabel35(JLabel jLabel35) {
        this.jLabel35 = jLabel35;
    }

    public JLabel getjLabel36() {
        return jLabel36;
    }

    public void setjLabel36(JLabel jLabel36) {
        this.jLabel36 = jLabel36;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel37() {
        return jPanel37;
    }

    public void setjPanel37(JPanel jPanel37) {
        this.jPanel37 = jPanel37;
    }

    public JScrollPane getjScrollPane0() {
        return jScrollPane0;
    }

    public void setjScrollPane0(JScrollPane jScrollPane0) {
        this.jScrollPane0 = jScrollPane0;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane10() {
        return jScrollPane10;
    }

    public void setjScrollPane10(JScrollPane jScrollPane10) {
        this.jScrollPane10 = jScrollPane10;
    }

    public JScrollPane getjScrollPane11() {
        return jScrollPane11;
    }

    public void setjScrollPane11(JScrollPane jScrollPane11) {
        this.jScrollPane11 = jScrollPane11;
    }

    public JScrollPane getjScrollPane12() {
        return jScrollPane12;
    }

    public void setjScrollPane12(JScrollPane jScrollPane12) {
        this.jScrollPane12 = jScrollPane12;
    }

    public JScrollPane getjScrollPane13() {
        return jScrollPane13;
    }

    public void setjScrollPane13(JScrollPane jScrollPane13) {
        this.jScrollPane13 = jScrollPane13;
    }

    public JScrollPane getjScrollPane14() {
        return jScrollPane14;
    }

    public void setjScrollPane14(JScrollPane jScrollPane14) {
        this.jScrollPane14 = jScrollPane14;
    }

    public JScrollPane getjScrollPane15() {
        return jScrollPane15;
    }

    public void setjScrollPane15(JScrollPane jScrollPane15) {
        this.jScrollPane15 = jScrollPane15;
    }

    public JScrollPane getjScrollPane16() {
        return jScrollPane16;
    }

    public void setjScrollPane16(JScrollPane jScrollPane16) {
        this.jScrollPane16 = jScrollPane16;
    }

    public JScrollPane getjScrollPane17() {
        return jScrollPane17;
    }

    public void setjScrollPane17(JScrollPane jScrollPane17) {
        this.jScrollPane17 = jScrollPane17;
    }

    public JScrollPane getjScrollPane18() {
        return jScrollPane18;
    }

    public void setjScrollPane18(JScrollPane jScrollPane18) {
        this.jScrollPane18 = jScrollPane18;
    }

    public JScrollPane getjScrollPane19() {
        return jScrollPane19;
    }

    public void setjScrollPane19(JScrollPane jScrollPane19) {
        this.jScrollPane19 = jScrollPane19;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane20() {
        return jScrollPane20;
    }

    public void setjScrollPane20(JScrollPane jScrollPane20) {
        this.jScrollPane20 = jScrollPane20;
    }

    public JScrollPane getjScrollPane21() {
        return jScrollPane21;
    }

    public void setjScrollPane21(JScrollPane jScrollPane21) {
        this.jScrollPane21 = jScrollPane21;
    }

    public JScrollPane getjScrollPane22() {
        return jScrollPane22;
    }

    public void setjScrollPane22(JScrollPane jScrollPane22) {
        this.jScrollPane22 = jScrollPane22;
    }

    public JScrollPane getjScrollPane23() {
        return jScrollPane23;
    }

    public void setjScrollPane23(JScrollPane jScrollPane23) {
        this.jScrollPane23 = jScrollPane23;
    }

    public JScrollPane getjScrollPane24() {
        return jScrollPane24;
    }

    public void setjScrollPane24(JScrollPane jScrollPane24) {
        this.jScrollPane24 = jScrollPane24;
    }

    public JScrollPane getjScrollPane25() {
        return jScrollPane25;
    }

    public void setjScrollPane25(JScrollPane jScrollPane25) {
        this.jScrollPane25 = jScrollPane25;
    }

    public JScrollPane getjScrollPane26() {
        return jScrollPane26;
    }

    public void setjScrollPane26(JScrollPane jScrollPane26) {
        this.jScrollPane26 = jScrollPane26;
    }

    public JScrollPane getjScrollPane27() {
        return jScrollPane27;
    }

    public void setjScrollPane27(JScrollPane jScrollPane27) {
        this.jScrollPane27 = jScrollPane27;
    }

    public JScrollPane getjScrollPane28() {
        return jScrollPane28;
    }

    public void setjScrollPane28(JScrollPane jScrollPane28) {
        this.jScrollPane28 = jScrollPane28;
    }

    public JScrollPane getjScrollPane29() {
        return jScrollPane29;
    }

    public void setjScrollPane29(JScrollPane jScrollPane29) {
        this.jScrollPane29 = jScrollPane29;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane30() {
        return jScrollPane30;
    }

    public void setjScrollPane30(JScrollPane jScrollPane30) {
        this.jScrollPane30 = jScrollPane30;
    }

    public JScrollPane getjScrollPane31() {
        return jScrollPane31;
    }

    public void setjScrollPane31(JScrollPane jScrollPane31) {
        this.jScrollPane31 = jScrollPane31;
    }

    public JScrollPane getjScrollPane32() {
        return jScrollPane32;
    }

    public void setjScrollPane32(JScrollPane jScrollPane32) {
        this.jScrollPane32 = jScrollPane32;
    }

    public JScrollPane getjScrollPane33() {
        return jScrollPane33;
    }

    public void setjScrollPane33(JScrollPane jScrollPane33) {
        this.jScrollPane33 = jScrollPane33;
    }

    public JScrollPane getjScrollPane34() {
        return jScrollPane34;
    }

    public void setjScrollPane34(JScrollPane jScrollPane34) {
        this.jScrollPane34 = jScrollPane34;
    }

    public JScrollPane getjScrollPane35() {
        return jScrollPane35;
    }

    public void setjScrollPane35(JScrollPane jScrollPane35) {
        this.jScrollPane35 = jScrollPane35;
    }

    public JScrollPane getjScrollPane36() {
        return jScrollPane36;
    }

    public void setjScrollPane36(JScrollPane jScrollPane36) {
        this.jScrollPane36 = jScrollPane36;
    }

    public JScrollPane getjScrollPane37() {
        return jScrollPane37;
    }

    public void setjScrollPane37(JScrollPane jScrollPane37) {
        this.jScrollPane37 = jScrollPane37;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public JScrollPane getjScrollPane7() {
        return jScrollPane7;
    }

    public void setjScrollPane7(JScrollPane jScrollPane7) {
        this.jScrollPane7 = jScrollPane7;
    }

    public JScrollPane getjScrollPane8() {
        return jScrollPane8;
    }

    public void setjScrollPane8(JScrollPane jScrollPane8) {
        this.jScrollPane8 = jScrollPane8;
    }

    public JScrollPane getjScrollPane9() {
        return jScrollPane9;
    }

    public void setjScrollPane9(JScrollPane jScrollPane9) {
        this.jScrollPane9 = jScrollPane9;
    }

    public JTable getjTable0() {
        return jTable0;
    }

    public void setjTable0(JTable jTable0) {
        this.jTable0 = jTable0;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTable getjTable10() {
        return jTable10;
    }

    public void setjTable10(JTable jTable10) {
        this.jTable10 = jTable10;
    }

    public JTable getjTable11() {
        return jTable11;
    }

    public void setjTable11(JTable jTable11) {
        this.jTable11 = jTable11;
    }

    public JTable getjTable12() {
        return jTable12;
    }

    public void setjTable12(JTable jTable12) {
        this.jTable12 = jTable12;
    }

    public JTable getjTable13() {
        return jTable13;
    }

    public void setjTable13(JTable jTable13) {
        this.jTable13 = jTable13;
    }

    public JTable getjTable14() {
        return jTable14;
    }

    public void setjTable14(JTable jTable14) {
        this.jTable14 = jTable14;
    }

    public JTable getjTable15() {
        return jTable15;
    }

    public void setjTable15(JTable jTable15) {
        this.jTable15 = jTable15;
    }

    public JTable getjTable16() {
        return jTable16;
    }

    public void setjTable16(JTable jTable16) {
        this.jTable16 = jTable16;
    }

    public JTable getjTable17() {
        return jTable17;
    }

    public void setjTable17(JTable jTable17) {
        this.jTable17 = jTable17;
    }

    public JTable getjTable18() {
        return jTable18;
    }

    public void setjTable18(JTable jTable18) {
        this.jTable18 = jTable18;
    }

    public JTable getjTable19() {
        return jTable19;
    }

    public void setjTable19(JTable jTable19) {
        this.jTable19 = jTable19;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public void setjTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }

    public JTable getjTable20() {
        return jTable20;
    }

    public void setjTable20(JTable jTable20) {
        this.jTable20 = jTable20;
    }

    public JTable getjTable21() {
        return jTable21;
    }

    public void setjTable21(JTable jTable21) {
        this.jTable21 = jTable21;
    }

    public JTable getjTable22() {
        return jTable22;
    }

    public void setjTable22(JTable jTable22) {
        this.jTable22 = jTable22;
    }

    public JTable getjTable23() {
        return jTable23;
    }

    public void setjTable23(JTable jTable23) {
        this.jTable23 = jTable23;
    }

    public JTable getjTable24() {
        return jTable24;
    }

    public void setjTable24(JTable jTable24) {
        this.jTable24 = jTable24;
    }

    public JTable getjTable25() {
        return jTable25;
    }

    public void setjTable25(JTable jTable25) {
        this.jTable25 = jTable25;
    }

    public JTable getjTable26() {
        return jTable26;
    }

    public void setjTable26(JTable jTable26) {
        this.jTable26 = jTable26;
    }

    public JTable getjTable27() {
        return jTable27;
    }

    public void setjTable27(JTable jTable27) {
        this.jTable27 = jTable27;
    }

    public JTable getjTable28() {
        return jTable28;
    }

    public void setjTable28(JTable jTable28) {
        this.jTable28 = jTable28;
    }

    public JTable getjTable29() {
        return jTable29;
    }

    public void setjTable29(JTable jTable29) {
        this.jTable29 = jTable29;
    }

    public JTable getjTable3() {
        return jTable3;
    }

    public void setjTable3(JTable jTable3) {
        this.jTable3 = jTable3;
    }

    public JTable getjTable30() {
        return jTable30;
    }

    public void setjTable30(JTable jTable30) {
        this.jTable30 = jTable30;
    }

    public JTable getjTable31() {
        return jTable31;
    }

    public void setjTable31(JTable jTable31) {
        this.jTable31 = jTable31;
    }

    public JTable getjTable32() {
        return jTable32;
    }

    public void setjTable32(JTable jTable32) {
        this.jTable32 = jTable32;
    }

    public JTable getjTable33() {
        return jTable33;
    }

    public void setjTable33(JTable jTable33) {
        this.jTable33 = jTable33;
    }

    public JTable getjTable34() {
        return jTable34;
    }

    public void setjTable34(JTable jTable34) {
        this.jTable34 = jTable34;
    }

    public JTable getjTable35() {
        return jTable35;
    }

    public void setjTable35(JTable jTable35) {
        this.jTable35 = jTable35;
    }

    public JTable getjTable36() {
        return jTable36;
    }

    public void setjTable36(JTable jTable36) {
        this.jTable36 = jTable36;
    }

    public JTable getjTable4() {
        return jTable4;
    }

    public void setjTable4(JTable jTable4) {
        this.jTable4 = jTable4;
    }

    public JTable getjTable5() {
        return jTable5;
    }

    public void setjTable5(JTable jTable5) {
        this.jTable5 = jTable5;
    }

    public JTable getjTable6() {
        return jTable6;
    }

    public void setjTable6(JTable jTable6) {
        this.jTable6 = jTable6;
    }

    public JTable getjTable7() {
        return jTable7;
    }

    public void setjTable7(JTable jTable7) {
        this.jTable7 = jTable7;
    }

    public JTable getjTable8() {
        return jTable8;
    }

    public void setjTable8(JTable jTable8) {
        this.jTable8 = jTable8;
    }

    public JTable getjTable9() {
        return jTable9;
    }

    public void setjTable9(JTable jTable9) {
        this.jTable9 = jTable9;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane37 = new javax.swing.JScrollPane();
        jPanel37 = new javax.swing.JPanel();
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane0 = new javax.swing.JScrollPane();
        jTable0 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable18 = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable19 = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable20 = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable22 = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable23 = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTable24 = new javax.swing.JTable();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTable25 = new javax.swing.JTable();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTable26 = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTable27 = new javax.swing.JTable();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTable28 = new javax.swing.JTable();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTable29 = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTable30 = new javax.swing.JTable();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTable31 = new javax.swing.JTable();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTable32 = new javax.swing.JTable();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTable33 = new javax.swing.JTable();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTable34 = new javax.swing.JTable();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTable35 = new javax.swing.JTable();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTable36 = new javax.swing.JTable();
        jLabelNumActual = new javax.swing.JLabel();
        jLabelNumAnterior = new javax.swing.JLabel();
        jLabelPasoAPaso = new javax.swing.JLabel();
        jLabelAnterior = new javax.swing.JLabel();
        jLabelActual = new javax.swing.JLabel();
        jLabelTirada = new javax.swing.JLabel();
        jLabelNumTirada = new javax.swing.JLabel();
        jButtonAnterior = new javax.swing.JButton();
        jLabelImagenFichas = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemCargar = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemImprimir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuSimulador = new javax.swing.JMenu();
        jMenuItemGenerar = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemInstrucciones = new javax.swing.JMenuItem();
        jMenuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Ruleta");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane37.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane37.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel37.setPreferredSize(new java.awt.Dimension(1850, 720));
        jPanel37.setLayout(null);

        jLabel0.setBackground(new java.awt.Color(58, 148, 74));
        jLabel0.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(255, 255, 255));
        jLabel0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0.setText("0");
        jLabel0.setOpaque(true);
        jPanel37.add(jLabel0);
        jLabel0.setBounds(0, 0, 50, 40);

        jLabel1.setBackground(new java.awt.Color(225, 0, 26));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setOpaque(true);
        jPanel37.add(jLabel1);
        jLabel1.setBounds(50, 0, 50, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jLabel2.setOpaque(true);
        jPanel37.add(jLabel2);
        jLabel2.setBounds(100, 0, 50, 40);

        jLabel3.setBackground(new java.awt.Color(225, 0, 26));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jLabel3.setOpaque(true);
        jPanel37.add(jLabel3);
        jLabel3.setBounds(150, 0, 50, 40);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jLabel4.setOpaque(true);
        jPanel37.add(jLabel4);
        jLabel4.setBounds(200, 0, 50, 40);

        jLabel5.setBackground(new java.awt.Color(225, 0, 26));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        jLabel5.setOpaque(true);
        jPanel37.add(jLabel5);
        jLabel5.setBounds(250, 0, 50, 40);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        jLabel6.setOpaque(true);
        jPanel37.add(jLabel6);
        jLabel6.setBounds(300, 0, 50, 40);

        jLabel7.setBackground(new java.awt.Color(225, 0, 26));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        jLabel7.setOpaque(true);
        jPanel37.add(jLabel7);
        jLabel7.setBounds(350, 0, 50, 40);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        jLabel8.setOpaque(true);
        jPanel37.add(jLabel8);
        jLabel8.setBounds(400, 0, 50, 40);

        jLabel9.setBackground(new java.awt.Color(225, 0, 26));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("9");
        jLabel9.setOpaque(true);
        jPanel37.add(jLabel9);
        jLabel9.setBounds(450, 0, 50, 40);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("10");
        jLabel10.setOpaque(true);
        jPanel37.add(jLabel10);
        jLabel10.setBounds(500, 0, 50, 40);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("11");
        jLabel11.setOpaque(true);
        jPanel37.add(jLabel11);
        jLabel11.setBounds(550, 0, 50, 40);

        jLabel12.setBackground(new java.awt.Color(225, 0, 26));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("12");
        jLabel12.setOpaque(true);
        jPanel37.add(jLabel12);
        jLabel12.setBounds(600, 0, 50, 40);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("13");
        jLabel13.setOpaque(true);
        jPanel37.add(jLabel13);
        jLabel13.setBounds(650, 0, 50, 40);

        jLabel14.setBackground(new java.awt.Color(225, 0, 26));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("14");
        jLabel14.setOpaque(true);
        jPanel37.add(jLabel14);
        jLabel14.setBounds(700, 0, 50, 40);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("15");
        jLabel15.setOpaque(true);
        jPanel37.add(jLabel15);
        jLabel15.setBounds(750, 0, 50, 40);

        jLabel16.setBackground(new java.awt.Color(225, 0, 26));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("16");
        jLabel16.setOpaque(true);
        jPanel37.add(jLabel16);
        jLabel16.setBounds(800, 0, 50, 40);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("17");
        jLabel17.setOpaque(true);
        jPanel37.add(jLabel17);
        jLabel17.setBounds(850, 0, 50, 40);

        jLabel18.setBackground(new java.awt.Color(225, 0, 26));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("18");
        jLabel18.setOpaque(true);
        jPanel37.add(jLabel18);
        jLabel18.setBounds(900, 0, 50, 40);

        jLabel19.setBackground(new java.awt.Color(225, 0, 26));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("19");
        jLabel19.setOpaque(true);
        jPanel37.add(jLabel19);
        jLabel19.setBounds(950, 0, 50, 40);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("20");
        jLabel20.setOpaque(true);
        jPanel37.add(jLabel20);
        jLabel20.setBounds(1000, 0, 50, 40);

        jLabel21.setBackground(new java.awt.Color(225, 0, 26));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("21");
        jLabel21.setOpaque(true);
        jPanel37.add(jLabel21);
        jLabel21.setBounds(1050, 0, 50, 40);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("22");
        jLabel22.setOpaque(true);
        jPanel37.add(jLabel22);
        jLabel22.setBounds(1100, 0, 50, 40);

        jLabel23.setBackground(new java.awt.Color(225, 0, 26));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("23");
        jLabel23.setOpaque(true);
        jPanel37.add(jLabel23);
        jLabel23.setBounds(1150, 0, 50, 40);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("24");
        jLabel24.setOpaque(true);
        jPanel37.add(jLabel24);
        jLabel24.setBounds(1200, 0, 50, 40);

        jLabel25.setBackground(new java.awt.Color(225, 0, 26));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("25");
        jLabel25.setOpaque(true);
        jPanel37.add(jLabel25);
        jLabel25.setBounds(1250, 0, 50, 40);

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("26");
        jLabel26.setOpaque(true);
        jPanel37.add(jLabel26);
        jLabel26.setBounds(1300, 0, 50, 40);

        jLabel27.setBackground(new java.awt.Color(225, 0, 26));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("27");
        jLabel27.setOpaque(true);
        jPanel37.add(jLabel27);
        jLabel27.setBounds(1350, 0, 50, 40);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("28");
        jLabel28.setOpaque(true);
        jPanel37.add(jLabel28);
        jLabel28.setBounds(1400, 0, 50, 40);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("29");
        jLabel29.setOpaque(true);
        jPanel37.add(jLabel29);
        jLabel29.setBounds(1450, 0, 50, 40);

        jLabel30.setBackground(new java.awt.Color(225, 0, 26));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("30");
        jLabel30.setOpaque(true);
        jPanel37.add(jLabel30);
        jLabel30.setBounds(1500, 0, 50, 40);

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("31");
        jLabel31.setOpaque(true);
        jPanel37.add(jLabel31);
        jLabel31.setBounds(1550, 0, 50, 40);

        jLabel32.setBackground(new java.awt.Color(225, 0, 26));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("32");
        jLabel32.setOpaque(true);
        jPanel37.add(jLabel32);
        jLabel32.setBounds(1600, 0, 50, 40);

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("33");
        jLabel33.setOpaque(true);
        jPanel37.add(jLabel33);
        jLabel33.setBounds(1650, 0, 50, 40);

        jLabel34.setBackground(new java.awt.Color(225, 0, 26));
        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("34");
        jLabel34.setOpaque(true);
        jPanel37.add(jLabel34);
        jLabel34.setBounds(1700, 0, 50, 40);

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("35");
        jLabel35.setOpaque(true);
        jPanel37.add(jLabel35);
        jLabel35.setBounds(1750, 0, 50, 40);

        jLabel36.setBackground(new java.awt.Color(225, 0, 26));
        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("36");
        jLabel36.setOpaque(true);
        jPanel37.add(jLabel36);
        jLabel36.setBounds(1800, 0, 50, 40);

        jTable0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable0.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable0.setShowVerticalLines(false);
        jScrollPane0.setViewportView(jTable0);
        if (jTable0.getColumnModel().getColumnCount() > 0) {
            jTable0.getColumnModel().getColumn(0).setResizable(false);
            jTable0.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable0.getColumnModel().getColumn(1).setResizable(false);
            jTable0.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane0);
        jScrollPane0.setBounds(0, 40, 50, 620);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane1);
        jScrollPane1.setBounds(50, 40, 50, 620);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane2);
        jScrollPane2.setBounds(100, 40, 50, 620);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable3.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane3);
        jScrollPane3.setBounds(150, 40, 50, 620);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable4.setShowVerticalLines(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane4);
        jScrollPane4.setBounds(200, 40, 50, 620);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable5.setShowVerticalLines(false);
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane5);
        jScrollPane5.setBounds(250, 40, 50, 620);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable6.setShowVerticalLines(false);
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane6);
        jScrollPane6.setBounds(300, 40, 50, 620);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable7.setShowVerticalLines(false);
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane7);
        jScrollPane7.setBounds(350, 40, 50, 620);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable8.setShowVerticalLines(false);
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setResizable(false);
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane8);
        jScrollPane8.setBounds(400, 40, 50, 620);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable9.setShowVerticalLines(false);
        jScrollPane9.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setResizable(false);
            jTable9.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable9.getColumnModel().getColumn(1).setResizable(false);
            jTable9.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane9);
        jScrollPane9.setBounds(450, 40, 50, 620);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable10.setShowVerticalLines(false);
        jScrollPane10.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setResizable(false);
            jTable10.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable10.getColumnModel().getColumn(1).setResizable(false);
            jTable10.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane10);
        jScrollPane10.setBounds(500, 40, 50, 620);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable11.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable11.setShowVerticalLines(false);
        jScrollPane11.setViewportView(jTable11);
        if (jTable11.getColumnModel().getColumnCount() > 0) {
            jTable11.getColumnModel().getColumn(0).setResizable(false);
            jTable11.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable11.getColumnModel().getColumn(1).setResizable(false);
            jTable11.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane11);
        jScrollPane11.setBounds(550, 40, 50, 620);

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable12.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable12.setShowVerticalLines(false);
        jScrollPane12.setViewportView(jTable12);
        if (jTable12.getColumnModel().getColumnCount() > 0) {
            jTable12.getColumnModel().getColumn(0).setResizable(false);
            jTable12.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable12.getColumnModel().getColumn(1).setResizable(false);
            jTable12.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane12);
        jScrollPane12.setBounds(600, 40, 50, 620);

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable13.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable13.setShowVerticalLines(false);
        jScrollPane13.setViewportView(jTable13);
        if (jTable13.getColumnModel().getColumnCount() > 0) {
            jTable13.getColumnModel().getColumn(0).setResizable(false);
            jTable13.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable13.getColumnModel().getColumn(1).setResizable(false);
            jTable13.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane13);
        jScrollPane13.setBounds(650, 40, 50, 620);

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable14.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable14.setShowVerticalLines(false);
        jScrollPane14.setViewportView(jTable14);
        if (jTable14.getColumnModel().getColumnCount() > 0) {
            jTable14.getColumnModel().getColumn(0).setResizable(false);
            jTable14.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable14.getColumnModel().getColumn(1).setResizable(false);
            jTable14.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane14);
        jScrollPane14.setBounds(700, 40, 50, 620);

        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable15.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable15.setShowVerticalLines(false);
        jScrollPane15.setViewportView(jTable15);
        if (jTable15.getColumnModel().getColumnCount() > 0) {
            jTable15.getColumnModel().getColumn(0).setResizable(false);
            jTable15.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable15.getColumnModel().getColumn(1).setResizable(false);
            jTable15.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane15);
        jScrollPane15.setBounds(750, 40, 50, 620);

        jTable16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable16.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable16.setShowVerticalLines(false);
        jScrollPane16.setViewportView(jTable16);
        if (jTable16.getColumnModel().getColumnCount() > 0) {
            jTable16.getColumnModel().getColumn(0).setResizable(false);
            jTable16.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable16.getColumnModel().getColumn(1).setResizable(false);
            jTable16.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane16);
        jScrollPane16.setBounds(800, 40, 50, 620);

        jTable17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable17.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable17.setShowVerticalLines(false);
        jScrollPane17.setViewportView(jTable17);
        if (jTable17.getColumnModel().getColumnCount() > 0) {
            jTable17.getColumnModel().getColumn(0).setResizable(false);
            jTable17.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable17.getColumnModel().getColumn(1).setResizable(false);
            jTable17.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane17);
        jScrollPane17.setBounds(850, 40, 50, 620);

        jTable18.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable18.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable18.setShowVerticalLines(false);
        jScrollPane18.setViewportView(jTable18);
        if (jTable18.getColumnModel().getColumnCount() > 0) {
            jTable18.getColumnModel().getColumn(0).setResizable(false);
            jTable18.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable18.getColumnModel().getColumn(1).setResizable(false);
            jTable18.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane18);
        jScrollPane18.setBounds(900, 40, 50, 620);

        jTable19.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable19.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable19.setShowVerticalLines(false);
        jScrollPane19.setViewportView(jTable19);
        if (jTable19.getColumnModel().getColumnCount() > 0) {
            jTable19.getColumnModel().getColumn(0).setResizable(false);
            jTable19.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable19.getColumnModel().getColumn(1).setResizable(false);
            jTable19.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane19);
        jScrollPane19.setBounds(950, 40, 50, 620);

        jTable20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable20.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable20.setShowVerticalLines(false);
        jScrollPane20.setViewportView(jTable20);
        if (jTable20.getColumnModel().getColumnCount() > 0) {
            jTable20.getColumnModel().getColumn(0).setResizable(false);
            jTable20.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable20.getColumnModel().getColumn(1).setResizable(false);
            jTable20.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane20);
        jScrollPane20.setBounds(1000, 40, 50, 620);

        jTable21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable21.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable21.setShowVerticalLines(false);
        jScrollPane21.setViewportView(jTable21);
        if (jTable21.getColumnModel().getColumnCount() > 0) {
            jTable21.getColumnModel().getColumn(0).setResizable(false);
            jTable21.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable21.getColumnModel().getColumn(1).setResizable(false);
            jTable21.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane21);
        jScrollPane21.setBounds(1050, 40, 50, 620);

        jTable22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable22.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable22.setShowVerticalLines(false);
        jScrollPane22.setViewportView(jTable22);
        if (jTable22.getColumnModel().getColumnCount() > 0) {
            jTable22.getColumnModel().getColumn(0).setResizable(false);
            jTable22.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable22.getColumnModel().getColumn(1).setResizable(false);
            jTable22.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane22);
        jScrollPane22.setBounds(1100, 40, 50, 620);

        jTable23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable23.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable23.setShowVerticalLines(false);
        jScrollPane23.setViewportView(jTable23);
        if (jTable23.getColumnModel().getColumnCount() > 0) {
            jTable23.getColumnModel().getColumn(0).setResizable(false);
            jTable23.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable23.getColumnModel().getColumn(1).setResizable(false);
            jTable23.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane23);
        jScrollPane23.setBounds(1150, 40, 50, 620);

        jTable24.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable24.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable24.setShowVerticalLines(false);
        jScrollPane24.setViewportView(jTable24);
        if (jTable24.getColumnModel().getColumnCount() > 0) {
            jTable24.getColumnModel().getColumn(0).setResizable(false);
            jTable24.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable24.getColumnModel().getColumn(1).setResizable(false);
            jTable24.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane24);
        jScrollPane24.setBounds(1200, 40, 50, 620);

        jTable25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable25.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable25.setShowVerticalLines(false);
        jScrollPane25.setViewportView(jTable25);
        if (jTable25.getColumnModel().getColumnCount() > 0) {
            jTable25.getColumnModel().getColumn(0).setResizable(false);
            jTable25.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable25.getColumnModel().getColumn(1).setResizable(false);
            jTable25.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane25);
        jScrollPane25.setBounds(1250, 40, 50, 620);

        jTable26.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable26.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable26.setShowVerticalLines(false);
        jScrollPane26.setViewportView(jTable26);
        if (jTable26.getColumnModel().getColumnCount() > 0) {
            jTable26.getColumnModel().getColumn(0).setResizable(false);
            jTable26.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable26.getColumnModel().getColumn(1).setResizable(false);
            jTable26.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane26);
        jScrollPane26.setBounds(1300, 40, 50, 620);

        jTable27.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable27.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable27.setShowVerticalLines(false);
        jScrollPane27.setViewportView(jTable27);
        if (jTable27.getColumnModel().getColumnCount() > 0) {
            jTable27.getColumnModel().getColumn(0).setResizable(false);
            jTable27.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable27.getColumnModel().getColumn(1).setResizable(false);
            jTable27.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane27);
        jScrollPane27.setBounds(1350, 40, 50, 620);

        jTable28.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable28.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable28.setShowVerticalLines(false);
        jScrollPane28.setViewportView(jTable28);
        if (jTable28.getColumnModel().getColumnCount() > 0) {
            jTable28.getColumnModel().getColumn(0).setResizable(false);
            jTable28.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable28.getColumnModel().getColumn(1).setResizable(false);
            jTable28.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane28);
        jScrollPane28.setBounds(1400, 40, 50, 620);

        jTable29.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable29.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable29.setShowVerticalLines(false);
        jScrollPane29.setViewportView(jTable29);
        if (jTable29.getColumnModel().getColumnCount() > 0) {
            jTable29.getColumnModel().getColumn(0).setResizable(false);
            jTable29.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable29.getColumnModel().getColumn(1).setResizable(false);
            jTable29.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane29);
        jScrollPane29.setBounds(1450, 40, 50, 620);

        jTable30.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable30.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable30.setShowVerticalLines(false);
        jScrollPane30.setViewportView(jTable30);
        if (jTable30.getColumnModel().getColumnCount() > 0) {
            jTable30.getColumnModel().getColumn(0).setResizable(false);
            jTable30.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable30.getColumnModel().getColumn(1).setResizable(false);
            jTable30.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane30);
        jScrollPane30.setBounds(1500, 40, 50, 620);

        jTable31.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable31.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable31.setShowVerticalLines(false);
        jScrollPane31.setViewportView(jTable31);
        if (jTable31.getColumnModel().getColumnCount() > 0) {
            jTable31.getColumnModel().getColumn(0).setResizable(false);
            jTable31.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable31.getColumnModel().getColumn(1).setResizable(false);
            jTable31.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane31);
        jScrollPane31.setBounds(1550, 40, 50, 620);

        jTable32.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable32.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable32.setShowVerticalLines(false);
        jScrollPane32.setViewportView(jTable32);
        if (jTable32.getColumnModel().getColumnCount() > 0) {
            jTable32.getColumnModel().getColumn(0).setResizable(false);
            jTable32.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable32.getColumnModel().getColumn(1).setResizable(false);
            jTable32.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane32);
        jScrollPane32.setBounds(1600, 40, 50, 620);

        jTable33.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable33.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable33.setShowVerticalLines(false);
        jScrollPane33.setViewportView(jTable33);
        if (jTable33.getColumnModel().getColumnCount() > 0) {
            jTable33.getColumnModel().getColumn(0).setResizable(false);
            jTable33.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable33.getColumnModel().getColumn(1).setResizable(false);
            jTable33.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane33);
        jScrollPane33.setBounds(1650, 40, 50, 620);

        jTable34.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable34.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable34.setShowVerticalLines(false);
        jScrollPane34.setViewportView(jTable34);
        if (jTable34.getColumnModel().getColumnCount() > 0) {
            jTable34.getColumnModel().getColumn(0).setResizable(false);
            jTable34.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable34.getColumnModel().getColumn(1).setResizable(false);
            jTable34.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane34);
        jScrollPane34.setBounds(1700, 40, 50, 620);

        jTable35.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable35.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable35.setShowVerticalLines(false);
        jScrollPane35.setViewportView(jTable35);
        if (jTable35.getColumnModel().getColumnCount() > 0) {
            jTable35.getColumnModel().getColumn(0).setResizable(false);
            jTable35.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable35.getColumnModel().getColumn(1).setResizable(false);
            jTable35.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane35);
        jScrollPane35.setBounds(1750, 40, 50, 620);

        jTable36.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C", "N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable36.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable36.setShowVerticalLines(false);
        jScrollPane36.setViewportView(jTable36);
        if (jTable36.getColumnModel().getColumnCount() > 0) {
            jTable36.getColumnModel().getColumn(0).setResizable(false);
            jTable36.getColumnModel().getColumn(0).setPreferredWidth(18);
            jTable36.getColumnModel().getColumn(1).setResizable(false);
            jTable36.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel37.add(jScrollPane36);
        jScrollPane36.setBounds(1800, 40, 50, 620);

        jScrollPane37.setViewportView(jPanel37);

        getContentPane().add(jScrollPane37);
        jScrollPane37.setBounds(0, 0, 1000, 670);

        jLabelNumActual.setBackground(new java.awt.Color(225, 0, 26));
        jLabelNumActual.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelNumActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumActual.setText("16");
        jLabelNumActual.setOpaque(true);
        getContentPane().add(jLabelNumActual);
        jLabelNumActual.setBounds(1170, 270, 50, 40);

        jLabelNumAnterior.setBackground(new java.awt.Color(225, 0, 26));
        jLabelNumAnterior.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelNumAnterior.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumAnterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumAnterior.setText("16");
        jLabelNumAnterior.setOpaque(true);
        getContentPane().add(jLabelNumAnterior);
        jLabelNumAnterior.setBounds(1170, 190, 50, 40);

        jLabelPasoAPaso.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelPasoAPaso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPasoAPaso.setText("PASO A PASO");
        getContentPane().add(jLabelPasoAPaso);
        jLabelPasoAPaso.setBounds(1000, 120, 280, 42);

        jLabelAnterior.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelAnterior.setText("Número actual:");
        getContentPane().add(jLabelAnterior);
        jLabelAnterior.setBounds(1060, 280, 86, 17);

        jLabelActual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelActual.setText("Número anterior:");
        getContentPane().add(jLabelActual);
        jLabelActual.setBounds(1060, 200, 96, 17);

        jLabelTirada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTirada.setText("Tirada N°:");
        getContentPane().add(jLabelTirada);
        jLabelTirada.setBounds(1060, 360, 59, 17);

        jLabelNumTirada.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNumTirada.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelNumTirada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumTirada.setText("16");
        jLabelNumTirada.setOpaque(true);
        getContentPane().add(jLabelNumTirada);
        jLabelNumTirada.setBounds(1170, 350, 50, 40);

        jButtonAnterior.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior.png"))); // NOI18N
        jButtonAnterior.setToolTipText("");
        jButtonAnterior.setFocusPainted(false);
        jButtonAnterior.setOpaque(false);
        getContentPane().add(jButtonAnterior);
        jButtonAnterior.setBounds(1030, 420, 110, 33);

        jLabelImagenFichas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rouletteChica.png"))); // NOI18N
        getContentPane().add(jLabelImagenFichas);
        jLabelImagenFichas.setBounds(1040, 540, 235, 129);

        jButtonSiguiente.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siguiente.png"))); // NOI18N
        jButtonSiguiente.setFocusPainted(false);
        jButtonSiguiente.setOpaque(false);
        getContentPane().add(jButtonSiguiente);
        jButtonSiguiente.setBounds(1140, 420, 110, 33);

        jMenuArchivo.setText("Archivo");

        jMenuItemNuevo.setText("Nuevo escenario...");
        jMenuArchivo.add(jMenuItemNuevo);

        jMenuItemCargar.setText("Cargar escenario...");
        jMenuItemCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCargar);

        jMenuItemGuardar.setText("Guardar escenario...");
        jMenuArchivo.add(jMenuItemGuardar);
        jMenuArchivo.add(jSeparator1);

        jMenuItemImprimir.setText("Imprimir resultados...");
        jMenuArchivo.add(jMenuItemImprimir);
        jMenuArchivo.add(jSeparator2);

        jMenuItemSalir.setText("Salir");
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuSimulador.setText("Simulador");

        jMenuItemGenerar.setText("Generar números...");
        jMenuSimulador.add(jMenuItemGenerar);

        jMenuBar1.add(jMenuSimulador);

        jMenuAyuda.setText("Ayuda");

        jMenuItemInstrucciones.setText("Instrucciones de uso");
        jMenuAyuda.add(jMenuItemInstrucciones);

        jMenuItemAcerca.setText("Acerca de...");
        jMenuAyuda.add(jMenuItemAcerca);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActual;
    private javax.swing.JLabel jLabelAnterior;
    private javax.swing.JLabel jLabelImagenFichas;
    private javax.swing.JLabel jLabelNumActual;
    private javax.swing.JLabel jLabelNumAnterior;
    private javax.swing.JLabel jLabelNumTirada;
    private javax.swing.JLabel jLabelPasoAPaso;
    private javax.swing.JLabel jLabelTirada;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAcerca;
    private javax.swing.JMenuItem jMenuItemCargar;
    private javax.swing.JMenuItem jMenuItemGenerar;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemImprimir;
    private javax.swing.JMenuItem jMenuItemInstrucciones;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuSimulador;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JScrollPane jScrollPane0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable0;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTable18;
    private javax.swing.JTable jTable19;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable20;
    private javax.swing.JTable jTable21;
    private javax.swing.JTable jTable22;
    private javax.swing.JTable jTable23;
    private javax.swing.JTable jTable24;
    private javax.swing.JTable jTable25;
    private javax.swing.JTable jTable26;
    private javax.swing.JTable jTable27;
    private javax.swing.JTable jTable28;
    private javax.swing.JTable jTable29;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable30;
    private javax.swing.JTable jTable31;
    private javax.swing.JTable jTable32;
    private javax.swing.JTable jTable33;
    private javax.swing.JTable jTable34;
    private javax.swing.JTable jTable35;
    private javax.swing.JTable jTable36;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}
