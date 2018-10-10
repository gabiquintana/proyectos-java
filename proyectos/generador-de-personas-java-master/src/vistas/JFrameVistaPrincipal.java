
package vistas;

import generador.Archivo;
import generador.Campo;
import generador.Persona;
import generador.Tipo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author caemci
 */
public class JFrameVistaPrincipal extends javax.swing.JFrame {

    public JFrameVistaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCabecera = new javax.swing.JPanel();
        jPanelFiltro = new javax.swing.JPanel();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonGenerar = new javax.swing.JButton();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBotonera = new javax.swing.JPanel();
        jButtonConectar = new javax.swing.JButton();
        jButtonParametros = new javax.swing.JButton();
        jButtonExportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelLicencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de personas");
        setBackground(new java.awt.Color(217, 200, 184));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPanelCabecera.setPreferredSize(new java.awt.Dimension(850, 50));
        jPanelCabecera.setLayout(new java.awt.BorderLayout());

        jPanelFiltro.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabelCantidad.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCantidad.setText("Cantidad de personas:");
        jLabelCantidad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelFiltro.add(jLabelCantidad);

        jTextFieldCantidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldCantidad.setPreferredSize(new java.awt.Dimension(90, 40));
        jTextFieldCantidad.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelFiltro.add(jTextFieldCantidad);

        jButtonGenerar.setBackground(new java.awt.Color(255, 250, 240));
        jButtonGenerar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonGenerar.setForeground(new java.awt.Color(255, 250, 240));
        jButtonGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/grow-icon.png"))); // NOI18N
        jButtonGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonGenerar.setIconTextGap(20);
        jButtonGenerar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonGenerar.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonGenerar.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanelFiltro.add(jButtonGenerar);

        jPanelCabecera.add(jPanelFiltro, java.awt.BorderLayout.WEST);

        jLabelEstado.setFont(new java.awt.Font("Lato Black", 1, 18)); // NOI18N
        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstado.setText("status");
        jPanelCabecera.add(jLabelEstado, java.awt.BorderLayout.CENTER);

        jPanelBotonera.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanelBotonera.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButtonConectar.setBackground(new java.awt.Color(255, 250, 240));
        jButtonConectar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonConectar.setForeground(new java.awt.Color(255, 250, 240));
        jButtonConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/database-icon.png"))); // NOI18N
        jButtonConectar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonConectar.setIconTextGap(20);
        jButtonConectar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonConectar.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonConectar.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanelBotonera.add(jButtonConectar);

        jButtonParametros.setBackground(new java.awt.Color(255, 250, 240));
        jButtonParametros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonParametros.setForeground(new java.awt.Color(255, 250, 240));
        jButtonParametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/settings-icon.png"))); // NOI18N
        jButtonParametros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonParametros.setIconTextGap(20);
        jButtonParametros.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonParametros.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonParametros.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanelBotonera.add(jButtonParametros);

        jButtonExportar.setBackground(new java.awt.Color(255, 250, 240));
        jButtonExportar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonExportar.setForeground(new java.awt.Color(255, 250, 240));
        jButtonExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/export-icon.png"))); // NOI18N
        jButtonExportar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonExportar.setIconTextGap(20);
        jButtonExportar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonExportar.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonExportar.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanelBotonera.add(jButtonExportar);

        jPanelCabecera.add(jPanelBotonera, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanelCabecera, java.awt.BorderLayout.NORTH);

        jTable1.setBackground(new java.awt.Color(255, 250, 240));
        jTable1.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new java.awt.Color(232, 140, 74));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 3));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(255, 206, 91));
        jTable1.setSelectionForeground(new java.awt.Color(24, 19, 9));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanelFooter.setLayout(new java.awt.BorderLayout(3, 3));

        jLabelWeb.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabelWeb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo-caemci.png"))); // NOI18N
        jLabelWeb.setText("www.caemci.com.ar");
        jLabelWeb.setIconTextGap(10);
        jPanelFooter.add(jLabelWeb, java.awt.BorderLayout.WEST);

        jLabelLicencia.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabelLicencia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLicencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/licencia.png"))); // NOI18N
        jLabelLicencia.setIconTextGap(10);
        jPanelFooter.add(jLabelLicencia, java.awt.BorderLayout.EAST);
        jPanelFooter.add(jSeparator1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanelFooter, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.hayConexionConBD(false);
        this.jScrollPane1.setVisible(false);
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/dibujo-caemci.png"));
        setIconImage(icon);
    }
    
    public void mostrarCartelDeError (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", 0);
    }
    
    public void mostrarCartelDeConfirmacion (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void activarBotonExportar (boolean estado) {
        this.jButtonExportar.setEnabled(estado);
    }
    
    private void armarColumnas () {
        DefaultTableModel dtm = new DefaultTableModel(Campo.values(), Campo.values().length);
        this.jTable1.setModel(dtm);
        this.jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
    
    public void agregarFila (Persona p) {
        DefaultTableModel dtf = (DefaultTableModel) this.jTable1.getModel();
        ArrayList<Object> datos = new ArrayList<Object>();
        for (int i = 0; i < Campo.values().length; i++) {
            Campo ca = Campo.values()[i];
            if ( ca.isSeleccionado() ) {
                datos.add(p.DATOS[i]);
            }
        }
        dtf.addRow( p.DATOS );
    }
    
    private void ajustarColumna (int vColIndex) {
        
        this.jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int margin = 5;
        DefaultTableColumnModel colModel = (DefaultTableColumnModel) this.jTable1.getColumnModel();
        TableColumn col = colModel.getColumn(vColIndex);
        int width;

        // Get width of column header
        TableCellRenderer renderer = col.getHeaderRenderer();
        if (renderer == null) {
            renderer = this.jTable1.getTableHeader().getDefaultRenderer();
        }
        Component comp = renderer.getTableCellRendererComponent(this.jTable1, col.getHeaderValue(), false, false, 0, 0);
        width = comp.getPreferredSize().width;

        // Get maximum width of column data
        for (int r=0; r<this.jTable1.getRowCount(); r++) {
            renderer = this.jTable1.getCellRenderer(r, vColIndex);
            comp = renderer.getTableCellRendererComponent(
                this.jTable1, this.jTable1.getValueAt(r, vColIndex), false, false, r, vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }

        // Add margin
        width += 2*margin;

        // Set the width
        col.setPreferredWidth(width);
    }
    
    private void ajustarColumnas() {
        for (int i = 0; i < this.jTable1.getColumnCount(); i++) {
            ajustarColumna(i);
        }
    }
    
    public void cambiarModeloDeTabla () {
        armarColumnas();
        ArrayList<String> columnas = new ArrayList<String>();
        TableColumnModel tcm = this.jTable1.getColumnModel();
        int nroColumnas = tcm.getColumnCount();
        int borradas = 0;
        for (int i = 0; i < nroColumnas; i++) {
            Campo ca = Campo.values()[i];
            if ( !ca.isSeleccionado() ) {
                TableColumn columnaABorrar = tcm.getColumn(i - borradas);
                this.jTable1.removeColumn(columnaABorrar);
                borradas++;
            }
        }
    }
    
    public void limpiarFilas() {
        DefaultTableModel dtf = (DefaultTableModel) this.jTable1.getModel();
        int cant = dtf.getRowCount();
        for(int i=cant; i>0; i--){
            dtf.removeRow(i-1);
        }
    }
    
    public void hayConexionConBD (boolean conectado) {
        activarControles(conectado);
        activarBotonExportar(false);
        if (conectado) {
            this.jLabelEstado.setText("CONECTADO");
            this.jLabelEstado.setForeground(new Color(55,184,88));
        }
        else {
            this.jLabelEstado.setText("NO CONECTADO");
            this.jLabelEstado.setForeground(new Color(255,87,71));
        }
    }
    
    public void activarControles (boolean flag) {
        for (int i = 1; i < this.jPanelBotonera.getComponents().length; i++) {
            this.jPanelBotonera.getComponent(i).setEnabled(flag);
        }
        for (int i = 0; i < this.jPanelFiltro.getComponents().length; i++) {
            this.jPanelFiltro.getComponent(i).setEnabled(flag);
        }
        this.jButtonConectar.setEnabled(!flag);
    }
    
    public int obtenerNumeroAGenerar() {
        try {
            return Integer.parseInt(this.jTextFieldCantidad.getText() );
        }
        catch (Exception e) {
            mostrarCartelDeError("Cantidad incorrecta");
        }
        return 0;
    }
    
    public void mostrar (ArrayList<Persona> lista) {
        limpiarFilas();
        this.jScrollPane1.setVisible(true);
        for (int i = 0; i < lista.size(); i++) {
            Persona p = lista.get(i);
            agregarFila(p);
        }
        ajustarColumnas();
    }
    
    public Archivo seleccionarArchivo()
    {
        String ruta = ""; // Ruta inicial vacía
        String extension = "";
        
        // JFileChooser es un componente que permite trabajar con el árbol de archivos del sistema operativo
        JFileChooser explorador = new JFileChooser();
        explorador.setAcceptAllFileFilterUsed(false);
        explorador.addChoosableFileFilter(new FileNameExtensionFilter("Valores separados por comas", "csv")); // Filtra por archivos csv
        explorador.addChoosableFileFilter(new FileNameExtensionFilter("Consulta SQL", "sql")); // Filtra por archivos sql
        explorador.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // Muestra carpetas
        int resultado = explorador.showSaveDialog(null); // Abre la ventana en modo "Guardar"
        if (resultado == JFileChooser.APPROVE_OPTION) // Si NO toca el botón de cancelar
        {
            // Me quedo con la ruta absoluta del archivo seleccionado por el usuario
            FileNameExtensionFilter extensionSeleccionada = (FileNameExtensionFilter) explorador.getFileFilter();
            
            extension = extensionSeleccionada.getExtensions()[0];
            ruta = explorador.getSelectedFile().getAbsolutePath();
            if (!ruta.contains(".")) {
                ruta += "." + extension;
            }
        }
        System.out.println(ruta);
        return new Archivo(obtenerTipo(extension), ruta, recopilarDatos()); // Devuelvo la ruta (OJO, pudo haber quedado vacía si es que tocó en cancelar)
    }
    
    private String[][] recopilarDatos () {
        int filas = this.jTable1.getRowCount();
        int columnas = this.jTable1.getColumnCount();
        String[][] datos = new String[filas][columnas];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = this.jTable1.getValueAt(i, j).toString();
            }
        }
        return datos;
    }
    
    private Tipo obtenerTipo (String extension) {
        for (int i = 0; i < Tipo.values().length; i++) {
            if (extension.equalsIgnoreCase(Tipo.values()[i].name())) {
                return Tipo.values()[i];
            }
        }
        return null;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////// MANEJADORES PARA CADA ACCION //////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void manejarAccionConectar (ActionListener al) {
        this.jButtonConectar.addActionListener(al);
    }
    
    public void manejarAccionParametrizar (ActionListener al) {
        this.jButtonParametros.addActionListener(al);
    }
    
    public void manejarAccionExportar (ActionListener al) {
        this.jButtonExportar.addActionListener(al);
    }
    
    public void manejarAccionGenerar (ActionListener al) {
        this.jButtonGenerar.addActionListener(al);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonParametros;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLicencia;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables
}
