
package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caemci
 */
public class JFrameVistaAutenticacion extends javax.swing.JFrame {

    public JFrameVistaAutenticacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenido = new javax.swing.JPanel();
        jPanelEdicion = new javax.swing.JPanel();
        jPanelLabels = new javax.swing.JPanel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelIconoContrasena = new javax.swing.JLabel();
        jPanelCampos = new javax.swing.JPanel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanelBotonera = new javax.swing.JPanel();
        jButtonCerrar = new javax.swing.JButton();
        jButtonConectar = new javax.swing.JButton();
        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelLicencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conectar a base de datos");
        setResizable(false);

        jPanelEdicion.setPreferredSize(new java.awt.Dimension(100, 800));
        jPanelEdicion.setLayout(new java.awt.BorderLayout(10, 0));

        jPanelLabels.setMinimumSize(new java.awt.Dimension(300, 90));
        jPanelLabels.setPreferredSize(new java.awt.Dimension(150, 800));
        jPanelLabels.setLayout(new java.awt.GridLayout(3, 1));

        jLabelDireccion.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDireccion.setText("Dirección:");
        jLabelDireccion.setIconTextGap(15);
        jLabelDireccion.setPreferredSize(new java.awt.Dimension(200, 0));
        jPanelLabels.add(jLabelDireccion);

        jLabelUsuario.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUsuario.setText("Usuario:");
        jLabelUsuario.setIconTextGap(15);
        jLabelUsuario.setPreferredSize(new java.awt.Dimension(200, 0));
        jPanelLabels.add(jLabelUsuario);

        jLabelIconoContrasena.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelIconoContrasena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelIconoContrasena.setText("Contraseña:");
        jLabelIconoContrasena.setIconTextGap(15);
        jLabelIconoContrasena.setPreferredSize(new java.awt.Dimension(200, 0));
        jPanelLabels.add(jLabelIconoContrasena);

        jPanelEdicion.add(jPanelLabels, java.awt.BorderLayout.WEST);

        jPanelCampos.setPreferredSize(new java.awt.Dimension(300, 111));
        jPanelCampos.setLayout(new java.awt.GridLayout(3, 1));

        jTextFieldDireccion.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextFieldDireccion.setForeground(new java.awt.Color(24, 19, 9));
        jTextFieldDireccion.setText("localhost/genpersona?useSSL=false");
        jTextFieldDireccion.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextFieldDireccion.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelCampos.add(jTextFieldDireccion);

        jTextFieldUsuario.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(24, 19, 9));
        jTextFieldUsuario.setText("root");
        jTextFieldUsuario.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextFieldUsuario.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelCampos.add(jTextFieldUsuario);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPasswordField1.setText("root");
        jPasswordField1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jPanelCampos.add(jPasswordField1);

        jPanelEdicion.add(jPanelCampos, java.awt.BorderLayout.CENTER);

        jPanelBotonera.setLayout(new javax.swing.BoxLayout(jPanelBotonera, javax.swing.BoxLayout.LINE_AXIS));

        jButtonCerrar.setBackground(new java.awt.Color(255, 250, 240));
        jButtonCerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(24, 19, 9));
        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/close-icon.png"))); // NOI18N
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCerrar.setIconTextGap(20);
        jButtonCerrar.setPreferredSize(new java.awt.Dimension(400, 53));
        jPanelBotonera.add(jButtonCerrar);

        jButtonConectar.setBackground(new java.awt.Color(255, 250, 240));
        jButtonConectar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonConectar.setForeground(new java.awt.Color(24, 19, 9));
        jButtonConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/database-icon.png"))); // NOI18N
        jButtonConectar.setText("Conectar");
        jButtonConectar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonConectar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonConectar.setIconTextGap(20);
        jButtonConectar.setPreferredSize(new java.awt.Dimension(400, 53));
        jPanelBotonera.add(jButtonConectar);

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addComponent(jPanelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

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
    }// </editor-fold>//GEN-END:initComponents
    
    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.manejarAccionCerrar();
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/dibujo-caemci.png"));
        setIconImage(icon);
    }
    
    public void manejarAccionConectar (ActionListener al) {
        this.jButtonConectar.addActionListener(al);
    }
    
    public String obtenerDireccion() {
        return this.jTextFieldDireccion.getText();
    }
    
    public String obtenerUsuario() {
        return this.jTextFieldUsuario.getText();
    }
    
    public String obtenerContrasena() {
        return String.valueOf( this.jPasswordField1.getPassword() );
    }
    
    private void manejarAccionCerrar () {
        this.jButtonCerrar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarVentana();
            }
        });
    }
    
    public void cerrarVentana() {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelIconoContrasena;
    private javax.swing.JLabel jLabelLicencia;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelEdicion;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelLabels;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
