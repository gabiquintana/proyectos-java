
package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author caemci
 */
public class JFrameVistaEstadistica extends javax.swing.JFrame {

    public JFrameVistaEstadistica() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenido = new javax.swing.JPanel();
        jPanelIconos = new javax.swing.JPanel();
        jLabelLeyendaOtros = new javax.swing.JLabel();
        jLabelLeyendaAmigos = new javax.swing.JLabel();
        jLabelLeyendaFamiliares = new javax.swing.JLabel();
        jLabelLeyendaTrabajo = new javax.swing.JLabel();
        jLabelLeyendaFacultad = new javax.swing.JLabel();
        jLabelLeyendaPromedio = new javax.swing.JLabel();
        jPanelCampos = new javax.swing.JPanel();
        jLabelOtros = new javax.swing.JLabel();
        jLabelAmigos = new javax.swing.JLabel();
        jLabelFamiliares = new javax.swing.JLabel();
        jLabelTrabajo = new javax.swing.JLabel();
        jLabelFacultad = new javax.swing.JLabel();
        jLabelPromedio = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelLicencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadísticas");
        setBackground(new java.awt.Color(217, 200, 184));
        setResizable(false);

        jPanelContenido.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jPanelIconos.setPreferredSize(new java.awt.Dimension(320, 300));
        jPanelIconos.setLayout(new java.awt.GridLayout(6, 1));

        jLabelLeyendaOtros.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelLeyendaOtros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLeyendaOtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tag-icon.png"))); // NOI18N
        jLabelLeyendaOtros.setText("Otros:");
        jLabelLeyendaOtros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLeyendaOtros.setIconTextGap(15);
        jPanelIconos.add(jLabelLeyendaOtros);

        jLabelLeyendaAmigos.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelLeyendaAmigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLeyendaAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/friends-icon.png"))); // NOI18N
        jLabelLeyendaAmigos.setText("Amigos:");
        jLabelLeyendaAmigos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLeyendaAmigos.setIconTextGap(15);
        jPanelIconos.add(jLabelLeyendaAmigos);

        jLabelLeyendaFamiliares.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelLeyendaFamiliares.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLeyendaFamiliares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/family-icon.png"))); // NOI18N
        jLabelLeyendaFamiliares.setText("Familiares:");
        jLabelLeyendaFamiliares.setToolTipText("");
        jLabelLeyendaFamiliares.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLeyendaFamiliares.setIconTextGap(15);
        jPanelIconos.add(jLabelLeyendaFamiliares);

        jLabelLeyendaTrabajo.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelLeyendaTrabajo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLeyendaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/job-icon.png"))); // NOI18N
        jLabelLeyendaTrabajo.setText("Compañeros de trabajo:");
        jLabelLeyendaTrabajo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLeyendaTrabajo.setIconTextGap(15);
        jPanelIconos.add(jLabelLeyendaTrabajo);

        jLabelLeyendaFacultad.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelLeyendaFacultad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLeyendaFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/academic-icon.png"))); // NOI18N
        jLabelLeyendaFacultad.setText("Compañeros de facultad:");
        jLabelLeyendaFacultad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLeyendaFacultad.setIconTextGap(15);
        jPanelIconos.add(jLabelLeyendaFacultad);

        jLabelLeyendaPromedio.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelLeyendaPromedio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLeyendaPromedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/calendar-icon.png"))); // NOI18N
        jLabelLeyendaPromedio.setText("Edad promedio:");
        jLabelLeyendaPromedio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelLeyendaPromedio.setIconTextGap(15);
        jPanelIconos.add(jLabelLeyendaPromedio);

        jPanelContenido.add(jPanelIconos);

        jPanelCampos.setPreferredSize(new java.awt.Dimension(100, 300));
        jPanelCampos.setLayout(new java.awt.GridLayout(6, 1));

        jLabelOtros.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        jLabelOtros.setForeground(new java.awt.Color(232, 140, 74));
        jLabelOtros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOtros.setText("N");
        jLabelOtros.setIconTextGap(15);
        jPanelCampos.add(jLabelOtros);

        jLabelAmigos.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        jLabelAmigos.setForeground(new java.awt.Color(232, 140, 74));
        jLabelAmigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAmigos.setText("N");
        jLabelAmigos.setIconTextGap(15);
        jPanelCampos.add(jLabelAmigos);

        jLabelFamiliares.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        jLabelFamiliares.setForeground(new java.awt.Color(232, 140, 74));
        jLabelFamiliares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFamiliares.setText("N");
        jLabelFamiliares.setToolTipText("");
        jLabelFamiliares.setIconTextGap(15);
        jPanelCampos.add(jLabelFamiliares);

        jLabelTrabajo.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        jLabelTrabajo.setForeground(new java.awt.Color(232, 140, 74));
        jLabelTrabajo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTrabajo.setText("N");
        jLabelTrabajo.setIconTextGap(15);
        jPanelCampos.add(jLabelTrabajo);

        jLabelFacultad.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        jLabelFacultad.setForeground(new java.awt.Color(232, 140, 74));
        jLabelFacultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFacultad.setText("N");
        jLabelFacultad.setIconTextGap(15);
        jPanelCampos.add(jLabelFacultad);

        jLabelPromedio.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        jLabelPromedio.setForeground(new java.awt.Color(232, 140, 74));
        jLabelPromedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPromedio.setText("N");
        jLabelPromedio.setIconTextGap(15);
        jPanelCampos.add(jLabelPromedio);

        jPanelContenido.add(jPanelCampos);

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

        getContentPane().add(jPanelFooter, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
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
    
    public void mostrarCantidades(ArrayList<Integer> cantidades) {
        for (int i = 0; i < cantidades.size(); i++) {
            JLabel lbl = (JLabel) this.jPanelCampos.getComponent(i);
            lbl.setText(cantidades.get(i) + "");
        }
    }
    
    public void mostrarEdadPromedio (int edad) {
        this.jLabelPromedio.setText(edad + "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAmigos;
    private javax.swing.JLabel jLabelFacultad;
    private javax.swing.JLabel jLabelFamiliares;
    private javax.swing.JLabel jLabelLeyendaAmigos;
    private javax.swing.JLabel jLabelLeyendaFacultad;
    private javax.swing.JLabel jLabelLeyendaFamiliares;
    private javax.swing.JLabel jLabelLeyendaOtros;
    private javax.swing.JLabel jLabelLeyendaPromedio;
    private javax.swing.JLabel jLabelLeyendaTrabajo;
    private javax.swing.JLabel jLabelLicencia;
    private javax.swing.JLabel jLabelOtros;
    private javax.swing.JLabel jLabelPromedio;
    private javax.swing.JLabel jLabelTrabajo;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelIconos;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
