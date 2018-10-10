
package vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

public class VistaCarga extends javax.swing.JFrame {

    public VistaCarga() {
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
        jButtonCargar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldCarne = new javax.swing.JTextField();
        jTextFieldPollo = new javax.swing.JTextField();
        jTextFieldJamon = new javax.swing.JTextField();
        jTextFieldGrasa = new javax.swing.JTextField();
        jTextFieldManteca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de carga de stock");
        setResizable(false);

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

        jLabelCantidadCarne.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadCarne.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadCarne.setText("Faltan xx");
        jLabelCantidadCarne.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadPollo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadPollo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadPollo.setText("Faltan xx");
        jLabelCantidadPollo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadJamon.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadJamon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadJamon.setText("Faltan xx");
        jLabelCantidadJamon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadManteca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadManteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadManteca.setText("Faltan xx");
        jLabelCantidadManteca.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidadGrasa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCantidadGrasa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCantidadGrasa.setText("Faltan xx");
        jLabelCantidadGrasa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButtonCargar.setBackground(new java.awt.Color(204, 255, 204));
        jButtonCargar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonCargar.setText("CARGAR STOCK");

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonCancelar.setText("CANCELAR");

        jTextFieldCarne.setColumns(2);
        jTextFieldCarne.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

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
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // La ventana se cierra al tocar la cruz
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/DibujoCaemci.png"));
        setIconImage(icon);
    }
    
    public void cargarAccionDeBotonCancelar (ActionListener al)
    {
        this.jButtonCancelar.addActionListener(al);
    }
    
    public void cargarAccionDeBotonCargar (ActionListener al)
    {
        this.jButtonCargar.addActionListener(al);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCargar;
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
    private javax.swing.JTextField jTextFieldCarne;
    private javax.swing.JTextField jTextFieldGrasa;
    private javax.swing.JTextField jTextFieldJamon;
    private javax.swing.JTextField jTextFieldManteca;
    private javax.swing.JTextField jTextFieldPollo;
    // End of variables declaration//GEN-END:variables
}
