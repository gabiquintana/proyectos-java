
package vistas;

import generador.Configuracion;
import generador.Genero;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author caemci
 */
public class JFrameVistaConfiguracion extends javax.swing.JFrame {

    public JFrameVistaConfiguracion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGenero = new javax.swing.ButtonGroup();
        jPanelContenido = new javax.swing.JPanel();
        jPanelParametros = new javax.swing.JPanel();
        jPanelDNI = new javax.swing.JPanel();
        jCheckBoxDNI = new javax.swing.JCheckBox();
        jPanelNombres = new javax.swing.JPanel();
        jCheckBoxNombre = new javax.swing.JCheckBox();
        jPanelApellidos = new javax.swing.JPanel();
        jCheckBoxApellido = new javax.swing.JCheckBox();
        jPanelGenero = new javax.swing.JPanel();
        jRadioButtonHombres = new javax.swing.JRadioButton();
        jRadioButtonMujeres = new javax.swing.JRadioButton();
        jRadioButtonAmbos = new javax.swing.JRadioButton();
        jPanelNacimiento = new javax.swing.JPanel();
        jCheckBoxFechaNacimiento = new javax.swing.JCheckBox();
        jPanelRango = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEdadMinima = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEdadMaxima = new javax.swing.JTextField();
        jPanelMail = new javax.swing.JPanel();
        jCheckBoxMail = new javax.swing.JCheckBox();
        jPanelMovil = new javax.swing.JPanel();
        jCheckBoxMovil = new javax.swing.JCheckBox();
        jPanelDomicilio = new javax.swing.JPanel();
        jCheckBoxDomicilio = new javax.swing.JCheckBox();
        jPanelNacionalidad = new javax.swing.JPanel();
        jCheckBoxNacionalidad = new javax.swing.JCheckBox();
        jButtonCerrar = new javax.swing.JButton();
        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelLicencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración");
        setResizable(false);

        jPanelContenido.setLayout(new java.awt.BorderLayout());

        jPanelParametros.setPreferredSize(new java.awt.Dimension(450, 400));
        jPanelParametros.setLayout(new javax.swing.BoxLayout(jPanelParametros, javax.swing.BoxLayout.PAGE_AXIS));

        jPanelDNI.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxDNI.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxDNI.setSelected(true);
        jCheckBoxDNI.setText("¿DNI?");
        jPanelDNI.add(jCheckBoxDNI);

        jPanelParametros.add(jPanelDNI);

        jPanelNombres.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxNombre.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxNombre.setSelected(true);
        jCheckBoxNombre.setText("¿Nombre?");
        jCheckBoxNombre.setEnabled(false);
        jPanelNombres.add(jCheckBoxNombre);

        jPanelParametros.add(jPanelNombres);

        jPanelApellidos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxApellido.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxApellido.setSelected(true);
        jCheckBoxApellido.setText("¿Apellido?");
        jPanelApellidos.add(jCheckBoxApellido);

        jPanelParametros.add(jPanelApellidos);

        jPanelGenero.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        buttonGroupGenero.add(jRadioButtonHombres);
        jRadioButtonHombres.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jRadioButtonHombres.setText("Hombres");
        jPanelGenero.add(jRadioButtonHombres);

        buttonGroupGenero.add(jRadioButtonMujeres);
        jRadioButtonMujeres.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jRadioButtonMujeres.setText("Mujeres");
        jPanelGenero.add(jRadioButtonMujeres);

        buttonGroupGenero.add(jRadioButtonAmbos);
        jRadioButtonAmbos.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jRadioButtonAmbos.setSelected(true);
        jRadioButtonAmbos.setText("Ambos");
        jPanelGenero.add(jRadioButtonAmbos);

        jPanelParametros.add(jPanelGenero);

        jPanelNacimiento.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxFechaNacimiento.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxFechaNacimiento.setSelected(true);
        jCheckBoxFechaNacimiento.setText("¿Fecha de nacimiento?");
        jPanelNacimiento.add(jCheckBoxFechaNacimiento);

        jPanelRango.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setText("Rango de edades:");
        jPanelRango.add(jLabel1);

        jTextFieldEdadMinima.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jTextFieldEdadMinima.setText("18");
        jTextFieldEdadMinima.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jPanelRango.add(jTextFieldEdadMinima);

        jLabel2.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel2.setText("-");
        jPanelRango.add(jLabel2);

        jTextFieldEdadMaxima.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jTextFieldEdadMaxima.setText("30");
        jTextFieldEdadMaxima.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jPanelRango.add(jTextFieldEdadMaxima);

        jPanelNacimiento.add(jPanelRango);

        jPanelParametros.add(jPanelNacimiento);

        jPanelMail.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxMail.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxMail.setSelected(true);
        jCheckBoxMail.setText("¿Mail?");
        jPanelMail.add(jCheckBoxMail);

        jPanelParametros.add(jPanelMail);

        jPanelMovil.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxMovil.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxMovil.setSelected(true);
        jCheckBoxMovil.setText("¿Móvil?");
        jPanelMovil.add(jCheckBoxMovil);

        jPanelParametros.add(jPanelMovil);

        jPanelDomicilio.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxDomicilio.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxDomicilio.setSelected(true);
        jCheckBoxDomicilio.setText("¿Domicilio?");
        jPanelDomicilio.add(jCheckBoxDomicilio);

        jPanelParametros.add(jPanelDomicilio);

        jPanelNacionalidad.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBoxNacionalidad.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jCheckBoxNacionalidad.setSelected(true);
        jCheckBoxNacionalidad.setText("¿Nacionalidad?");
        jPanelNacionalidad.add(jCheckBoxNacionalidad);

        jPanelParametros.add(jPanelNacionalidad);

        jPanelContenido.add(jPanelParametros, java.awt.BorderLayout.CENTER);

        jButtonCerrar.setBackground(new java.awt.Color(255, 250, 240));
        jButtonCerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(24, 19, 9));
        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/check-icon.png"))); // NOI18N
        jButtonCerrar.setText("Confirmar");
        jButtonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCerrar.setIconTextGap(20);
        jButtonCerrar.setPreferredSize(new java.awt.Dimension(400, 53));
        jPanelContenido.add(jButtonCerrar, java.awt.BorderLayout.SOUTH);

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
        gestionarParametrosAdicionales();
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/dibujo-caemci.png"));
        setIconImage(icon);
    }
    
    private void gestionarParametrosAdicionales () {
        jPanelRango.setVisible(true);
        manejarEleccionFechaDeNacimiento();
    }
    
    public void obtenerConfiguracion() {
        int min = Integer.parseInt( this.jTextFieldEdadMinima.getText() ); 
        int max = Integer.parseInt( this.jTextFieldEdadMaxima.getText() );
        if (min < 1 || max > 90 || min > max) throw new NumberFormatException("La edad debe estar comprendida entre 1 y 90 años");
        Configuracion.establecerConfiguracion(
                                this.jRadioButtonHombres.isSelected() ? Genero.HOMBRE : (this.jRadioButtonMujeres.isSelected() ? Genero.MUJER : Genero.AMBOS), 
                                this.jCheckBoxNombre.isSelected(),
                                this.jCheckBoxApellido.isSelected(),
                                this.jCheckBoxDNI.isSelected(), 
                                this.jCheckBoxFechaNacimiento.isSelected(), 
                                min, 
                                max, 
                                this.jCheckBoxMail.isSelected(), 
                                this.jCheckBoxMovil.isSelected(), 
                                this.jCheckBoxDomicilio.isSelected(),
                                this.jCheckBoxNacionalidad.isSelected());
    }
    
    private void manejarEleccionFechaDeNacimiento () {
        this.jCheckBoxFechaNacimiento.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    jPanelRango.setVisible(true);
                }
                else {
                    jPanelRango.setVisible(false);
                }
            }
        });
    }
    
    public void manejarAccionConfirmar (ActionListener al) {
        this.jButtonCerrar.addActionListener(al);
    }
    
    public void cerrarVentana() {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JCheckBox jCheckBoxApellido;
    private javax.swing.JCheckBox jCheckBoxDNI;
    private javax.swing.JCheckBox jCheckBoxDomicilio;
    private javax.swing.JCheckBox jCheckBoxFechaNacimiento;
    private javax.swing.JCheckBox jCheckBoxMail;
    private javax.swing.JCheckBox jCheckBoxMovil;
    private javax.swing.JCheckBox jCheckBoxNacionalidad;
    private javax.swing.JCheckBox jCheckBoxNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLicencia;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelApellidos;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelDNI;
    private javax.swing.JPanel jPanelDomicilio;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelGenero;
    private javax.swing.JPanel jPanelMail;
    private javax.swing.JPanel jPanelMovil;
    private javax.swing.JPanel jPanelNacimiento;
    private javax.swing.JPanel jPanelNacionalidad;
    private javax.swing.JPanel jPanelNombres;
    private javax.swing.JPanel jPanelParametros;
    private javax.swing.JPanel jPanelRango;
    private javax.swing.JRadioButton jRadioButtonAmbos;
    private javax.swing.JRadioButton jRadioButtonHombres;
    private javax.swing.JRadioButton jRadioButtonMujeres;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldEdadMaxima;
    private javax.swing.JTextField jTextFieldEdadMinima;
    // End of variables declaration//GEN-END:variables
}
