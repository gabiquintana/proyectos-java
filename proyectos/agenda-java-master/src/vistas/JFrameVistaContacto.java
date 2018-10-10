
package vistas;

import clases.Categoria;
import clases.Contacto;
import clases.Modo;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author caemci
 */
public class JFrameVistaContacto extends javax.swing.JFrame {
    
    public static final Locale LOCALE_AR = new Locale("es", "AR");
    private Modo modo;
    private Contacto contacto;

    public JFrameVistaContacto(Modo mod) {
        initComponents();
        this.contacto = new Contacto();
        this.establecerModo(mod);
    }
    
    public JFrameVistaContacto(Modo mod, Contacto co) {
        initComponents();
        this.contacto = co;
        this.establecerModo(mod);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenido = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jPanelBotonera = new javax.swing.JPanel();
        jToggleButtonEditar = new javax.swing.JToggleButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonAccion = new javax.swing.JButton();
        jPanelEdicion = new javax.swing.JPanel();
        jPanelIconos = new javax.swing.JPanel();
        jLabelIconoCredencial = new javax.swing.JLabel();
        jLabelIconoMail = new javax.swing.JLabel();
        jLabelIconoTelefono = new javax.swing.JLabel();
        jLabelIconoMapa = new javax.swing.JLabel();
        jLabelIconoCalendario = new javax.swing.JLabel();
        jLabelIconoEtiqueta = new javax.swing.JLabel();
        jPanelCampos = new javax.swing.JPanel();
        jPanelNombreApellido = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jXDatePickerNacimiento = new org.jdesktop.swingx.JXDatePicker();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jPanelFooter = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelLicencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/silueta.jpg"))); // NOI18N
        jLabelFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 140, 74), 4, true));

        jPanelBotonera.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        jToggleButtonEditar.setBackground(new java.awt.Color(255, 250, 240));
        jToggleButtonEditar.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jToggleButtonEditar.setForeground(new java.awt.Color(24, 19, 9));
        jToggleButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit-user-icon.png"))); // NOI18N
        jToggleButtonEditar.setText("Editar");
        jToggleButtonEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButtonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButtonEditar.setIconTextGap(20);
        jPanelBotonera.add(jToggleButtonEditar);

        jButtonBorrar.setBackground(new java.awt.Color(255, 250, 240));
        jButtonBorrar.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jButtonBorrar.setForeground(new java.awt.Color(24, 19, 9));
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/remove-user-icon.png"))); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonBorrar.setIconTextGap(20);
        jButtonBorrar.setPreferredSize(new java.awt.Dimension(400, 53));
        jPanelBotonera.add(jButtonBorrar);

        jButtonAccion.setBackground(new java.awt.Color(255, 250, 240));
        jButtonAccion.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jButtonAccion.setForeground(new java.awt.Color(24, 19, 9));
        jButtonAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/close-icon.png"))); // NOI18N
        jButtonAccion.setText("Cerrar");
        jButtonAccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAccion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonAccion.setIconTextGap(20);
        jButtonAccion.setPreferredSize(new java.awt.Dimension(400, 53));
        jPanelBotonera.add(jButtonAccion);

        jPanelEdicion.setPreferredSize(new java.awt.Dimension(100, 800));
        jPanelEdicion.setLayout(new javax.swing.BoxLayout(jPanelEdicion, javax.swing.BoxLayout.LINE_AXIS));

        jPanelIconos.setMinimumSize(new java.awt.Dimension(70, 192));
        jPanelIconos.setPreferredSize(new java.awt.Dimension(0, 800));
        jPanelIconos.setLayout(new java.awt.GridLayout(6, 1));

        jLabelIconoCredencial.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelIconoCredencial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoCredencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/credencial-icon.png"))); // NOI18N
        jLabelIconoCredencial.setIconTextGap(15);
        jPanelIconos.add(jLabelIconoCredencial);

        jLabelIconoMail.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelIconoMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mail-icon.png"))); // NOI18N
        jLabelIconoMail.setIconTextGap(15);
        jPanelIconos.add(jLabelIconoMail);

        jLabelIconoTelefono.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelIconoTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/phone-icon.png"))); // NOI18N
        jLabelIconoTelefono.setIconTextGap(15);
        jPanelIconos.add(jLabelIconoTelefono);

        jLabelIconoMapa.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelIconoMapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/map-icon.png"))); // NOI18N
        jLabelIconoMapa.setIconTextGap(15);
        jPanelIconos.add(jLabelIconoMapa);

        jLabelIconoCalendario.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabelIconoCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/calendar-icon.png"))); // NOI18N
        jLabelIconoCalendario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelIconoCalendario.setIconTextGap(5);
        jPanelIconos.add(jLabelIconoCalendario);

        jLabelIconoEtiqueta.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelIconoEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tag-icon.png"))); // NOI18N
        jLabelIconoEtiqueta.setIconTextGap(15);
        jPanelIconos.add(jLabelIconoEtiqueta);

        jPanelEdicion.add(jPanelIconos);

        jPanelCampos.setLayout(new java.awt.GridLayout(6, 1));

        jPanelNombreApellido.setLayout(new java.awt.GridLayout(1, 2));

        jTextFieldNombre.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(24, 19, 9));
        jTextFieldNombre.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextFieldNombre.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelNombreApellido.add(jTextFieldNombre);

        jTextFieldApellido.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(24, 19, 9));
        jTextFieldApellido.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextFieldApellido.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelNombreApellido.add(jTextFieldApellido);

        jPanelCampos.add(jPanelNombreApellido);

        jTextFieldMail.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextFieldMail.setForeground(new java.awt.Color(24, 19, 9));
        jTextFieldMail.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextFieldMail.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelCampos.add(jTextFieldMail);

        jTextFieldTelefono.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextFieldTelefono.setForeground(new java.awt.Color(24, 19, 9));
        jTextFieldTelefono.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextFieldTelefono.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelCampos.add(jTextFieldTelefono);

        jTextFieldDireccion.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jTextFieldDireccion.setForeground(new java.awt.Color(24, 19, 9));
        jTextFieldDireccion.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextFieldDireccion.setSelectionColor(new java.awt.Color(255, 206, 91));
        jPanelCampos.add(jTextFieldDireccion);

        jXDatePickerNacimiento.setForeground(new java.awt.Color(24, 19, 9));
        jXDatePickerNacimiento.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        jPanelCampos.add(jXDatePickerNacimiento);

        jComboBoxCategoria.setEditable(true);
        jComboBoxCategoria.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jComboBoxCategoria.setToolTipText("");
        jComboBoxCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanelCampos.add(jComboBoxCategoria);

        jPanelEdicion.add(jPanelCampos);

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFoto))
                .addContainerGap(417, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jPanelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
        this.setVisible(true); // Hace la ventana visible
    }
    
    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/dibujo-caemci.png"));
        setIconImage(icon);
    }
    
    private void llenarCampos() {
        this.jTextFieldNombre.setText(contacto.getNombre());
        this.jTextFieldApellido.setText(contacto.getApellido());
        this.jTextFieldMail.setText(contacto.getMail());
        this.jTextFieldTelefono.setText(contacto.getTelefono() + "");
        this.jTextFieldDireccion.setText(contacto.getDireccion());
        this.prepararSelectorDeFecha();
        this.prepararListaDeCategorias();
        this.jXDatePickerNacimiento.setDate(contacto.getFechaDeNacimiento());
        this.jComboBoxCategoria.setSelectedIndex(contacto.getCategoria().ordinal()-1);
        this.mostrarEdad();
    }
    
    public void actualizarContacto() throws NumberFormatException, NullPointerException {
        this.contacto.setNombre( this.jTextFieldNombre.getText() );
        this.contacto.setApellido( this.jTextFieldApellido.getText() );
        this.contacto.setMail( this.jTextFieldMail.getText() );
        this.contacto.setDireccion( this.jTextFieldDireccion.getText() );
        this.contacto.setTelefono( Integer.parseInt(this.jTextFieldTelefono.getText()) );
        this.contacto.setFechaDeNacimiento( new Date(this.jXDatePickerNacimiento.getDate().getTime()) );
        this.contacto.setCategoria( (Categoria) this.jComboBoxCategoria.getSelectedItem() );
    }
    
    private void prepararSelectorDeFecha () {
        this.jXDatePickerNacimiento.setFormats(new SimpleDateFormat("d 'de' MMMM 'de' yyyy",LOCALE_AR));
    }
    
    private void prepararListaDeCategorias () {
        Categoria[] categs = new Categoria[Categoria.values().length-1];
        for (int i = 1; i < Categoria.values().length; i++) {
            categs[i-1] = Categoria.values()[i];
        }
        this.jComboBoxCategoria.setModel( new DefaultComboBoxModel(categs) );
    }
    
    public void establecerModo (Modo mod) {
        switch (mod) {
            case AGREGAR:
                jButtonAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add-user-icon.png")));
                jButtonAccion.setText("Añadir");
                this.jButtonBorrar.setVisible(false);
                this.jToggleButtonEditar.setVisible(false);
                habilitarCampos(true);
                prepararListaDeCategorias();
                prepararSelectorDeFecha();
                this.setTitle("Nuevo contacto");
                break;
            case EDITAR:
                habilitarCampos(true);
                this.setTitle("Editando a " + this.jTextFieldNombre.getText() + " " + this.jTextFieldApellido.getText());
                break;
            case VER:
                this.llenarCampos();
                this.setTitle("Viendo a " + this.jTextFieldNombre.getText() + " " + this.jTextFieldApellido.getText());
                habilitarCampos(false);
                break;    
        }
        this.validate();
    }
    
    private void habilitarCampos (boolean flag) {
        for (int i = 0; i < this.jPanelNombreApellido.getComponents().length; i++) {
            JTextComponent campo = (JTextComponent) this.jPanelNombreApellido.getComponent(i);
            campo.setEditable(flag);
        }
        for (int i = 1; i < this.jPanelCampos.getComponents().length-2; i++) {
            JTextComponent campo = (JTextComponent) this.jPanelCampos.getComponent(i);
            campo.setEditable(flag);
        }
        this.jXDatePickerNacimiento.setEditable(flag);
        this.jComboBoxCategoria.setEnabled(flag);
    }
    
    private void mostrarEdad () {
        this.jLabelIconoCalendario.setText("("+ contacto.getEdad() +")");
    }
    
    public void cerrarVentana() {
        this.dispose();
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////// MANEJADORES PARA CADA ACCION //////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////  
    
    public void manejarAccionEditar (ItemListener il) {
        this.jToggleButtonEditar.addItemListener(il);
    }
    
    public void manejarAccionBorrar (ActionListener al) {
        this.jButtonBorrar.addActionListener(al);
    }
    
    public void manejarAccion (ActionListener al) {
        this.jButtonAccion.addActionListener(al);
    }

    public Contacto getContacto() {
        return contacto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccion;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JComboBox<Categoria> jComboBoxCategoria;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelIconoCalendario;
    private javax.swing.JLabel jLabelIconoCredencial;
    private javax.swing.JLabel jLabelIconoEtiqueta;
    private javax.swing.JLabel jLabelIconoMail;
    private javax.swing.JLabel jLabelIconoMapa;
    private javax.swing.JLabel jLabelIconoTelefono;
    private javax.swing.JLabel jLabelLicencia;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelEdicion;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelIconos;
    private javax.swing.JPanel jPanelNombreApellido;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JToggleButton jToggleButtonEditar;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerNacimiento;
    // End of variables declaration//GEN-END:variables
}
