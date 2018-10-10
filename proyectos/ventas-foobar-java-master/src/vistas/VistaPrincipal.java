
package vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelFacturacion = new javax.swing.JPanel();
        jLabelCarne = new javax.swing.JLabel();
        jLabelPollo = new javax.swing.JLabel();
        jLabelJamon = new javax.swing.JLabel();
        jLabelGrasa = new javax.swing.JLabel();
        jLabelManteca = new javax.swing.JLabel();
        jProgressBarCarne = new javax.swing.JProgressBar();
        jProgressBarPollo = new javax.swing.JProgressBar();
        jProgressBarJamon = new javax.swing.JProgressBar();
        jProgressBarManteca = new javax.swing.JProgressBar();
        jProgressBarGrasa = new javax.swing.JProgressBar();
        jButtonVender = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema FooBar");
        setBackground(new java.awt.Color(217, 200, 184));
        setResizable(false);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N

        jTextFieldUsuario.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsuario.setText("Usuario");

        jPasswordFieldClave.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPasswordFieldClave.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldClave.setText("12345678");

        jButtonEntrar.setBackground(new java.awt.Color(218, 193, 159));
        jButtonEntrar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonEntrar.setText("ENTRAR");

        jLabelCarne.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCarne.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCarne.setText("Empanadas de carne:");
        jLabelCarne.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelPollo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPollo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPollo.setText("Empanadas de pollo:");
        jLabelPollo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelJamon.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelJamon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelJamon.setText("Empanadas de J y Q:");
        jLabelJamon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelGrasa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelGrasa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGrasa.setText("Medialunas de grasa:");
        jLabelGrasa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelManteca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelManteca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelManteca.setText("Medialunas de manteca:");
        jLabelManteca.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jProgressBarCarne.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarCarne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarCarne.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarCarne.setMaximum(60);
        jProgressBarCarne.setToolTipText("");
        jProgressBarCarne.setValue(44);
        jProgressBarCarne.setString("cant de MAX");
        jProgressBarCarne.setStringPainted(true);

        jProgressBarPollo.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarPollo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarPollo.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarPollo.setMaximum(60);
        jProgressBarPollo.setValue(31);
        jProgressBarPollo.setString("cant de MAX");
        jProgressBarPollo.setStringPainted(true);

        jProgressBarJamon.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarJamon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarJamon.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarJamon.setMaximum(60);
        jProgressBarJamon.setValue(58);
        jProgressBarJamon.setString("cant de MAX");
        jProgressBarJamon.setStringPainted(true);

        jProgressBarManteca.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarManteca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarManteca.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarManteca.setMaximum(120);
        jProgressBarManteca.setValue(50);
        jProgressBarManteca.setString("cant de MAX");
        jProgressBarManteca.setStringPainted(true);

        jProgressBarGrasa.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarGrasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarGrasa.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarGrasa.setMaximum(120);
        jProgressBarGrasa.setValue(43);
        jProgressBarGrasa.setString("cant de MAX");
        jProgressBarGrasa.setStringPainted(true);

        jButtonVender.setBackground(new java.awt.Color(218, 193, 159));
        jButtonVender.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonVender.setText("VENDER");

        jButtonCargar.setBackground(new java.awt.Color(218, 193, 159));
        jButtonCargar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonCargar.setText("CARGAR STOCK");

        javax.swing.GroupLayout jPanelFacturacionLayout = new javax.swing.GroupLayout(jPanelFacturacion);
        jPanelFacturacion.setLayout(jPanelFacturacionLayout);
        jPanelFacturacionLayout.setHorizontalGroup(
            jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFacturacionLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBarCarne, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jProgressBarPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarJamon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarManteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarGrasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFacturacionLayout.createSequentialGroup()
                            .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                            .addComponent(jLabelCarne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(300, 300, 300))
                        .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                            .addComponent(jLabelPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
                        .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                            .addComponent(jLabelJamon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(300, 300, 300))
                        .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                            .addComponent(jLabelManteca, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
                        .addComponent(jLabelGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelFacturacionLayout.setVerticalGroup(
            jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBarCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarJamon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarManteca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelCarne)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelPollo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelJamon)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelManteca)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelGrasa)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLogo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addComponent(jPanelFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // La aplicación por defecto se cierra al tocar la cruz
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.jButtonEntrar.requestFocus(); // El foco inicial estará por defecto sobre el botón "Entrar"
        this.mostrarPanelFacturacion(false);
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/DibujoCaemci.png"));
        setIconImage(icon);
    }
    
    public void cargarAccionDeBotonEntrar (ActionListener al)
    {
        this.jButtonEntrar.addActionListener(al);
    }
    
    public void cargarAccionDeBotonVender (ActionListener al)
    {
        this.jButtonVender.addActionListener(al);
    }
    
    public void cargarAccionDeBotonCargar (ActionListener al)
    {
        this.jButtonCargar.addActionListener(al);
    }
    
    public void cargarAccionDeCampoUsuario (FocusListener fl)
    {
        this.jTextFieldUsuario.addFocusListener(fl);
    }
    
    public void cargarAccionDeCampoClave (FocusListener fl)
    {
        this.jPasswordFieldClave.addFocusListener(fl);
    }
    
    public String obtenerNombreDeUsuario()
    {
        return jTextFieldUsuario.getText();
    }
    
    public String obtenerClave()
    {
        return String.valueOf(jPasswordFieldClave.getPassword());
    }
    
    public void establecerNombreDeUsuario(String valor)
    {
        jTextFieldUsuario.setText(valor);
    }
    
    public void establecerClave(String valor)
    {
        jPasswordFieldClave.setText(valor);
    }
    
    public void pintarTextoCampoUsuario(Color c)
    {
        this.jTextFieldUsuario.setForeground(c);
    }
    
    public void pintarTextoCampoClave(Color c)
    {
        this.jPasswordFieldClave.setForeground(c);
    }
     
    public void mostrarPanelFacturacion (boolean b)
    {
        this.jPanelFacturacion.setVisible(b);
    }
    
    public void establecerMaximoDeEmpanadas (int max)
    {
        this.jProgressBarCarne.setMaximum(max);
        this.jProgressBarPollo.setMaximum(max);
        this.jProgressBarJamon.setMaximum(max);
    }
    
    public void establecerMaximoDeMedialunas (int max)
    {
        this.jProgressBarGrasa.setMaximum(max);
        this.jProgressBarManteca.setMaximum(max);
    }
    
    public void establecerValorEmpanadasCarne (int cant)
    {
        this.jProgressBarCarne.setValue(cant);
        this.jProgressBarCarne.setString(cant + " de " + this.jProgressBarCarne.getMaximum());
    }
    
    public void establecerValorEmpanadasPollo (int cant)
    {
        this.jProgressBarPollo.setValue(cant);
        this.jProgressBarPollo.setString(cant + " de " + this.jProgressBarPollo.getMaximum());
    }
    
    public void establecerValorEmpanadasJamon (int cant)
    {
        this.jProgressBarJamon.setValue(cant);
        this.jProgressBarJamon.setString(cant + " de " + this.jProgressBarJamon.getMaximum());
    }
    
    public void establecerValorMedialunasGrasa (int cant)
    {
        this.jProgressBarGrasa.setValue(cant);
        this.jProgressBarGrasa.setString(cant + " de " + this.jProgressBarGrasa.getMaximum());
    }
    
    public void establecerValorMedialunasManteca (int cant)
    {
        this.jProgressBarManteca.setValue(cant);
        this.jProgressBarManteca.setString(cant + " de " + this.jProgressBarManteca.getMaximum());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelCarne;
    private javax.swing.JLabel jLabelGrasa;
    private javax.swing.JLabel jLabelJamon;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelManteca;
    private javax.swing.JLabel jLabelPollo;
    private javax.swing.JPanel jPanelFacturacion;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JProgressBar jProgressBarCarne;
    private javax.swing.JProgressBar jProgressBarGrasa;
    private javax.swing.JProgressBar jProgressBarJamon;
    private javax.swing.JProgressBar jProgressBarManteca;
    private javax.swing.JProgressBar jProgressBarPollo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
