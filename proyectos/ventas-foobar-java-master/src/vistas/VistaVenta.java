
package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;

public class VistaVenta extends javax.swing.JFrame {

    public VistaVenta() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCarne = new javax.swing.JLabel();
        jLabelPollo = new javax.swing.JLabel();
        jLabelJamon = new javax.swing.JLabel();
        jLabelGrasa = new javax.swing.JLabel();
        jLabelManteca = new javax.swing.JLabel();
        jLabelCantidadCarne = new javax.swing.JLabel();
        jLabelCantidadPollo = new javax.swing.JLabel();
        jLabelCantidadJamon = new javax.swing.JLabel();
        jLabelCantidadManteca = new javax.swing.JLabel();
        jLabelCantidadGrasa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonVender = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelAbono = new javax.swing.JLabel();
        jLabelVuelto = new javax.swing.JLabel();
        jTextFieldCarne = new javax.swing.JTextField();
        jTextFieldVuelto = new javax.swing.JTextField();
        jTextFieldAbono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldPollo = new javax.swing.JTextField();
        jTextFieldJamon = new javax.swing.JTextField();
        jTextFieldGrasa = new javax.swing.JTextField();
        jTextFieldManteca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de venta");
        setResizable(false);

        jLabelCarne.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCarne.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCarne.setLabelFor(jLabelCantidadCarne);
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

        jLabelCantidadCarne.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadCarne.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadCarne.setText("Quedan xxx");
        jLabelCantidadCarne.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadPollo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadPollo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadPollo.setText("Quedan xxx");
        jLabelCantidadPollo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadJamon.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadJamon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadJamon.setText("Quedan xxx");
        jLabelCantidadJamon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadManteca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadManteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadManteca.setText("Quedan xxx");
        jLabelCantidadManteca.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadGrasa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadGrasa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadGrasa.setText("Quedan xxx");
        jLabelCantidadGrasa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonVender.setBackground(new java.awt.Color(204, 255, 204));
        jButtonVender.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonVender.setText("VENDER");

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonCancelar.setText("CANCELAR");

        jLabelTotal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotal.setText("Total:");
        jLabelTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelAbono.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAbono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAbono.setText("Abona con:");
        jLabelAbono.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelVuelto.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelVuelto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelVuelto.setText("Su vuelto:");
        jLabelVuelto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextFieldCarne.setColumns(2);
        jTextFieldCarne.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextFieldVuelto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextFieldAbono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextFieldTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextFieldPollo.setColumns(2);
        jTextFieldPollo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextFieldJamon.setColumns(2);
        jTextFieldJamon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextFieldGrasa.setColumns(2);
        jTextFieldGrasa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextFieldManteca.setColumns(2);
        jTextFieldManteca.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelJamon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldJamon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCantidadJamon)
                            .addComponent(jLabelCantidadPollo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelManteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelCantidadGrasa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldManteca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCantidadManteca))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantidadCarne))
                    .addComponent(jButtonVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVuelto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAbono))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTotal))
                    .addComponent(jSeparator2)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCarne)
                            .addComponent(jLabelCantidadCarne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPollo)
                            .addComponent(jLabelCantidadPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJamon)
                            .addComponent(jLabelCantidadJamon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldJamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCantidadManteca)
                                .addComponent(jTextFieldManteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelManteca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelGrasa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCantidadGrasa)
                                .addComponent(jTextFieldGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTotal)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAbono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVuelto)
                            .addComponent(jTextFieldVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // La ventana (NO la aplicación completa) se cierra al tocar la cruz
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.setVisible(true); // Hace la ventana visible
        activarBotonCancelar(true);
        activarBotonVender(false);
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/DibujoCaemci.png"));
        setIconImage(icon);
    }
    
    public void cargarAccionDeBotonCancelar (ActionListener al)
    {
        this.jButtonCancelar.addActionListener(al);
    }
    
    public void cargarAccionDeBotonVender (ActionListener al)
    {
        this.jButtonVender.addActionListener(al);
    }
    
    public void cargarAccionDeGenerarTicket (MouseListener ml)
    {
        this.jTextArea1.addMouseListener(ml);
    }
    
    public void cargarAccionDeCampoTotal (FocusListener fl)
    {
        this.jTextFieldTotal.addFocusListener(fl);
    }
    
    public void cargarAccionDeCampoVuelto (FocusListener fl)
    {
        this.jTextFieldVuelto.addFocusListener(fl);
    }
    
    public void desecharVentana()
    {
        this.dispose();
    }
    
    public void mostrarDisponibilidadCarne ( int cant ) {
        this.jLabelCantidadCarne.setText( "Quedan " + cant);
    }
    
    public void mostrarDisponibilidadPollo ( int cant ) {
        this.jLabelCantidadPollo.setText( "Quedan " + cant);
    }
    
    public void mostrarDisponibilidadJamon ( int cant ) {
        this.jLabelCantidadJamon.setText( "Quedan " + cant);
    }
    
    public void mostrarDisponibilidadManteca ( int cant ) {
        this.jLabelCantidadManteca.setText( "Quedan " + cant);
    }
    
    public void mostrarDisponibilidadGrasa ( int cant ) {
        this.jLabelCantidadGrasa.setText( "Quedan " + cant);
    }
    
    public int obtenerCantidadDeCarne() {
        return validarEntrada( this.jTextFieldCarne.getText() );
    }
    
    public int obtenerCantidadDePollo() {
        return validarEntrada( this.jTextFieldPollo.getText() );
    }
    
    public int obtenerCantidadDeJamon() {
        return validarEntrada( this.jTextFieldJamon.getText() );
    }
    
    public int obtenerCantidadDeManteca() {
        return validarEntrada( this.jTextFieldManteca.getText() );
    }
    
    public int obtenerCantidadDeGrasa() {
        return validarEntrada( this.jTextFieldGrasa.getText() );
    }
    
    private int validarEntrada( String s )
    {
        if (s.isEmpty()) {
            return 0;
        }
        else {
            return Integer.parseInt( s );
        }
    }
    
    public void establecerTotal(double total) {
        this.jTextFieldTotal.setText( total + "" );
    }
    
    public double obtenerAbono() {
        String s = this.jTextFieldAbono.getText();
        if (s.isEmpty()) {
            return 0;
        }
        else {
            return Double.parseDouble( this.jTextFieldAbono.getText() );
        }
    }
    
    public void establecerVuelto(double vuelto) {
        this.jTextFieldVuelto.setText( vuelto + "" );
    }
    
    public void activarBotonCancelar(boolean b)
    {
        this.jButtonCancelar.setEnabled(b);
    }
    
    public void activarBotonVender(boolean b)
    {
        this.jButtonVender.setEnabled(b);
    }
    
    public void imprimirTicket( String s )
    {
        this.jTextArea1.setText(s);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelAbono;
    private javax.swing.JLabel jLabelCantidadCarne;
    private javax.swing.JLabel jLabelCantidadGrasa;
    private javax.swing.JLabel jLabelCantidadJamon;
    private javax.swing.JLabel jLabelCantidadManteca;
    private javax.swing.JLabel jLabelCantidadPollo;
    private javax.swing.JLabel jLabelCarne;
    private javax.swing.JLabel jLabelGrasa;
    private javax.swing.JLabel jLabelJamon;
    private javax.swing.JLabel jLabelManteca;
    private javax.swing.JLabel jLabelPollo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVuelto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAbono;
    private javax.swing.JTextField jTextFieldCarne;
    private javax.swing.JTextField jTextFieldGrasa;
    private javax.swing.JTextField jTextFieldJamon;
    private javax.swing.JTextField jTextFieldManteca;
    private javax.swing.JTextField jTextFieldPollo;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVuelto;
    // End of variables declaration//GEN-END:variables
}
