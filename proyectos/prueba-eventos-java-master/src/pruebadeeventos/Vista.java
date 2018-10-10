
package pruebadeeventos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Vista extends javax.swing.JFrame
{
    public Vista()
    {
        initComponents();
    }
    
    public void iniciarVista()
    {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/DibujoCaemci.png"));
        setIconImage(icon);
    }
    
    public void escucharEventosDeAccion(ActionListener manejadorAL)
    {
        this.jButtonPruebaAccion.addActionListener(manejadorAL);
    }
    
    public void escucharEventosDeFoco(FocusListener manejadorFL)
    {
        this.jButtonPruebaFoco.addFocusListener(manejadorFL);
    }
    
    public void escucharEventosDeMouse(MouseListener manejadorML)
    {
        this.jLabelPruebaMouse.addMouseListener(manejadorML);
    }
    
    public void escucharEventosDeTeclado(KeyListener manejadorKL)
    {
        this.jTextAreaPrueba.addKeyListener(manejadorKL);
    }
    
    public void escucharEventosDeMovimiento(MouseMotionListener manejadorMML)
    {
        this.addMouseMotionListener(manejadorMML);
    }

    public JButton getjButtonPruebaAccion()
    {
        return jButtonPruebaAccion;
    }

    public JButton getjButtonPruebaFoco()
    {
        return jButtonPruebaFoco;
    }

    public JLabel getjLabelCuentaDeCaracteres()
    {
        return jLabelCuentaDeCaracteres;
    }

    public JLabel getjLabelPruebaMouse()
    {
        return jLabelPruebaMouse;
    }

    public JTextArea getjTextAreaPrueba()
    {
        return jTextAreaPrueba;
    }

    public JLabel getjLabelCoordenadas()
    {
        return jLabelCoordenadas;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabelPruebaMouse = new javax.swing.JLabel();
        jButtonPruebaAccion = new javax.swing.JButton();
        jButtonPruebaFoco = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPrueba = new javax.swing.JTextArea();
        jLabelCuentaDeCaracteres = new javax.swing.JLabel();
        jLabelCoordenadas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prueba de eventos");
        setResizable(false);

        jLabelPruebaMouse.setBackground(new java.awt.Color(204, 204, 255));
        jLabelPruebaMouse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPruebaMouse.setForeground(new java.awt.Color(0, 102, 204));
        jLabelPruebaMouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPruebaMouse.setText("jLabel para prueba de mouse");
        jLabelPruebaMouse.setFocusCycleRoot(true);
        jLabelPruebaMouse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonPruebaAccion.setBackground(new java.awt.Color(255, 102, 102));
        jButtonPruebaAccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonPruebaAccion.setText("jButton para prueba de acción");

        jButtonPruebaFoco.setBackground(new java.awt.Color(0, 153, 153));
        jButtonPruebaFoco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonPruebaFoco.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPruebaFoco.setText("jButton para prueba de foco");

        jTextAreaPrueba.setColumns(20);
        jTextAreaPrueba.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextAreaPrueba.setRows(4);
        jScrollPane1.setViewportView(jTextAreaPrueba);

        jLabelCuentaDeCaracteres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuentaDeCaracteres.setText("Aquí deben salir la cantidad de caracteres del jTextArea");

        jLabelCoordenadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCoordenadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCoordenadas.setText("Coordenadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPruebaMouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCuentaDeCaracteres, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPruebaAccion)
                            .addComponent(jButtonPruebaFoco, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelCoordenadas, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPruebaMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelCuentaDeCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPruebaFoco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPruebaAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPruebaAccion;
    private javax.swing.JButton jButtonPruebaFoco;
    private javax.swing.JLabel jLabelCoordenadas;
    private javax.swing.JLabel jLabelCuentaDeCaracteres;
    private javax.swing.JLabel jLabelPruebaMouse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPrueba;
    // End of variables declaration//GEN-END:variables
}
