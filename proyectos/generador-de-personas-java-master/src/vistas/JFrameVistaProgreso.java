
package vistas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author caemci
 */
public class JFrameVistaProgreso extends javax.swing.JFrame {
    
    private final int MAXIMO;
    private int actual;

    public JFrameVistaProgreso(int max) {
        initComponents();
        this.MAXIMO = max;
        this.actual = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenido = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabelLeyenda = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelLicencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Progreso");
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(0, 20));

        jPanelContenido.setLayout(new java.awt.BorderLayout(0, 10));

        jProgressBar1.setBackground(new java.awt.Color(255, 206, 91));
        jProgressBar1.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(232, 140, 74));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 25));
        jProgressBar1.setStringPainted(true);
        jPanelContenido.add(jProgressBar1, java.awt.BorderLayout.CENTER);

        jLabelLeyenda.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelLeyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLeyenda.setText("Generando personas...");
        jLabelLeyenda.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelContenido.add(jLabelLeyenda, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanelContenido, java.awt.BorderLayout.CENTER);

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
    }// </editor-fold>//GEN-END:initComponents
    
    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/dibujo-caemci.png"));
        setIconImage(icon);
    }
    
    public void contar () {
        this.actual++;
        double valor = (this.actual * 100.0) / this.MAXIMO;
        this.jProgressBar1.setValue( (int) valor );
    }
    
    public void cerrarVentana() {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLeyenda;
    private javax.swing.JLabel jLabelLicencia;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
